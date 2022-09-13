package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class MultiPoint.
 *
 * @author nttdata
 */
@Data
public class MultiPoint {

    /** The type . */
    private String type;
	
    /** The coordinates . */
    private PositionArray coordinates;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	

}