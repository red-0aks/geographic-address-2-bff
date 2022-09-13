package cl.wom.msbff.model;

import java.util.List;
import lombok.Data;

/**
 * The Class GeographicAddressValidationUpdate.
 *
 * @author nttdata
 */
@Data
public class GeographicAddressValidationUpdate {

    /** The provideAlternative . */
    private boolean provideAlternative;
	
    /** The validationDate . */
    private String validationDate;
	
    /** The validationResult . */
    private String validationResult;
	
    /** The alternateGeographicAddress . */
    private List<GeographicAddress> alternateGeographicAddress;
	
    /** The state . */
    private TaskStateType state;
	
    /** The submittedGeographicAddress . */
    private GeographicAddress submittedGeographicAddress;
	
    /** The validGeographicAddress . */
    private GeographicAddress validGeographicAddress;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	

}