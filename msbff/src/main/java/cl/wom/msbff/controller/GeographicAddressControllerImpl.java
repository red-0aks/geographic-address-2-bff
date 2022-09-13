package cl.wom.msbff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

//TODO: import 

import cl.wom.msbff.service.GeographicAddressService;

/**
 * The Class GeographicAddressControllerImpl.
 */
@RestController
public class GeographicAddressControllerImpl implements GeographicAddressController {
	
	/** The GeographicAddress service. */
	@Autowired
	private GeographicAddressService service;

	@Override
	public List<CommuneDTO> getCommunes(Long idState) {
		return service.getCommunes(idState);
	}

	@Override
	public List<?> getDatos() {
		return service.getDatos();
	}

	
	
}