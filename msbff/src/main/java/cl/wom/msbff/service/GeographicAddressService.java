package cl.wom.msbff.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import cl.wom.msbff.dto.CommuneDTO;
import cl.wom.msbff.dto.RegionDTO;
import cl.wom.msbff.proxy.GeographicAddressProxy;
import org.apache.logging.log4j.*;

@Service
public class GeographicAddressService {

	private static final Logger log = LogManager.getLogger();

	@Autowired
	private GeographicAddressProxy proxy;

	private RestTemplate restTemplate = new RestTemplate();

	/* Constants */
	@Value("${ws.backend.url}")
	private String url;

	@Value("${ws.wom.tokenurl}")
	private String tokenUrl;
	private static final String regionsPath = "/api/regionComunas";
	private static final String communesPath = "/api/comunas";
	private static final String applicationJson = MediaType.APPLICATION_JSON_VALUE;
	private static final String applicationFormUrlEncoded = MediaType.APPLICATION_FORM_URLENCODED_VALUE;

	/**
	 * Consulta todas las regiones a tmf-geographic-address-service
	 * 
	 * @param token Bearer Access Token solicitado por tmf
	 * @return List<RegionDTO> Lista de regiones
	 */
	public List<RegionDTO> getRegions(String token) {
		List<RegionDTO> regions = new ArrayList<>();
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(token);

		log.info("MENSAJE DE PRUEBA");

		ResponseEntity<List<RegionDTO>> res = restTemplate.exchange(
			url + regionsPath,
			HttpMethod.GET,
			new HttpEntity<>(headers),
			new ParameterizedTypeReference<List<RegionDTO>>() {}
		);

		if (res.getBody() != null) {
			regions = res.getBody();
		}

		return regions;
	}

	/**
	 * Consulta todas las comunas segun el id de region entregado
	 * 
	 * @param token Bearer Access Token solicitado por tmf
	 * @param idRegion Id de Region para filtrar
	 * @return List<CommuneDTO> Lista de comunas por region
	 */
	public List<CommuneDTO> getCommunes(String token, String idRegion) {
		List<CommuneDTO> communes = new ArrayList<>();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);
		headers.setContentType(MediaType.APPLICATION_JSON);

		ResponseEntity<List<CommuneDTO>> res = restTemplate.exchange(
			url + communesPath,
			HttpMethod.GET,
			new HttpEntity<>(headers),
			new ParameterizedTypeReference<List<CommuneDTO>>() {},
			idRegion
		);

		if (res.getBody() != null) {
			communes = res.getBody();
		}

		return communes;
	}

	public String generateAccessTokenDTO() {
		String accessToken = "";
		HttpHeaders reqHeaders = new HttpHeaders();
		reqHeaders.set("Content-type", applicationFormUrlEncoded);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("grant_type", "password");
		map.add("client_id", "af4117d7");
		map.add("client_secret", "4ebee7576f328ade8e922757535c354c");
		map.add("username", "wom-magento");
		map.add("password", "wom-magento");

		ResponseEntity<String> res = restTemplate.exchange(
				tokenUrl,
				HttpMethod.POST,
				new HttpEntity<MultiValueMap<String, String>>(map, reqHeaders),
				new ParameterizedTypeReference<String>() {
				});
		if (res.getBody() != null) {
			accessToken = res.getBody();
		}

		return accessToken;
	}

}