package cl.wom.msbff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import cl.wom.msbff.dto.CommuneDTO;
import cl.wom.msbff.dto.RegionDTO;
import cl.wom.msbff.service.GeographicAddressService;
import org.apache.logging.log4j.*;

import org.springframework.http.HttpHeaders;

@RestController
public class GeographicAddressControllerImpl implements GeographicAddressController {

	private static final Logger log = LogManager.getLogger();

	@Autowired
	private GeographicAddressService service;

	@Override
	public List<RegionDTO> getRegions(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
		log.info("hola");
		return service.getRegions(token);
	}

	@Override
	public List<CommuneDTO> getCommunes(String token, String idRegion) {
		return service.getCommunes(token, idRegion);
	}

	/*
	 * @Override
	 * public String generateAccessToken() {
	 * return service.generateAccessTokenDTO();
	 * }
	 */

}