package cl.wom.msbff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.wom.msbff.proxy.GeographicAddressProxy;


//TODO: imports

/**
 * The Class GeographicAddressService.
 */
@Service
public class GeographicAddressService {

	/** The proxy. */
	@Autowired
	private GeographicAddressProxy proxy;


	public List<CommuneDTO> getCommunes(Long idState) {
		List<CommuneDTO> dto = new ArrayList<>(); //TODO: completar inicializacion
		//TODO: logica para encontrar lo que se debe ingresar a la lista del dto desde lo obtenido con proxy.
		return dto;
	}


	public List<?> getDatos() {
		List<?> dto = new ArrayList<>(); //TODO: completar inicializacion
		//TODO: logica para encontrar lo que se debe ingresar a la lista del dto desde lo obtenido con proxy.
		return dto;
	}

	
}