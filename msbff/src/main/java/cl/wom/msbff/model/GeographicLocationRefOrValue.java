package cl.wom.msbff.model;

import java.util.List;
import lombok.Data;

/**
 * The Class GeographicLocationRefOrValue.
 *
 * @author nttdata
 */
@Data
public class GeographicLocationRefOrValue {

    /** The id . */
    private String id;
	
    /** The href . */
    private String href;
	
    /** The name . */
    private String name;
	
    /** The baseType . */
    private String baseType;
	
    /** The bbox . */
    private List<Integer> bbox;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	
    /** The referredType . */
    private String referredType;
	

}