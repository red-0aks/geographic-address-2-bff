package cl.wom.msbff.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.wom.msbff.dto.*;

@RequestMapping("/bff/geographicAddressManagement/v4/")
public interface GeographicAddressController {

	@GetMapping("/listStates")
	public List<RegionDTO> getRegions(@RequestHeader(HttpHeaders.AUTHORIZATION) String token);

	@GetMapping("/listCommunes")
	public List<CommuneDTO> getCommunes(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
			@RequestParam("idRegion") String idState);

	/*
	 * @RequestMapping(value = "/generateAccessToken", method = RequestMethod.POST,
	 * produces = "application/json")
	 * public String generateAccessToken();
	 */

}