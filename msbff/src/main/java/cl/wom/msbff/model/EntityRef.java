package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class EntityRef.
 *
 * @author nttdata
 */
@Data
public class EntityRef {

    /** The id . */
    private String id;
	
    /** The href . */
    private String href;
	
    /** The name . */
    private String name;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	
    /** The referredType . */
    private String referredType;
	

}