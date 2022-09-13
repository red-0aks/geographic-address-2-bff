package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class Point.
 *
 * @author nttdata
 */
@Data
public class Point {

    /** The type . */
    private String type;
	
    /** The coordinates . */
    private Position coordinates;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	

}