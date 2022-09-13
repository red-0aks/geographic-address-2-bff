package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class Error.
 *
 * @author nttdata
 */
@Data
public class Error {

    /** The code . */
    private String code;
	
    /** The reason . */
    private String reason;
	
    /** The message . */
    private String message;
	
    /** The status . */
    private String status;
	
    /** The referenceError . */
    private String referenceError;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	

}