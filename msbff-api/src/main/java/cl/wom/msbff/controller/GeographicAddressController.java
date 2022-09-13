package cl.wom.msbff.controller;

import org.springframework.web.bind.annotation.RequestMapping;

//TODO: import ctrl shift o

/**
 * The Interface GeographicAddressController.
 */
@RequestMapping("/bff/geographicAddressManagement/v4/")
public interface GeographicAddressController {
	
	//TODO: completar 
	
	@GetMapping("/listCommunes")
	public List<CommuneDTO> getCommunes(@RequestParam("idState") Long idState);

	@GetMapping("/datos")
	public List<?> getDatos();

	
}