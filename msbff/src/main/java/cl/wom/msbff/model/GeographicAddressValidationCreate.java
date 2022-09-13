package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class GeographicAddressValidationCreate.
 *
 * @author nttdata
 */
@Data
public class GeographicAddressValidationCreate {

    /** The provideAlternative . */
    private boolean provideAlternative;
	
    /** The submittedGeographicAddress . */
    private GeographicAddress submittedGeographicAddress;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	

}