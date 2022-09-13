package cl.wom.msbff.model;

import java.util.List;
import lombok.Data;

/**
 * The Class MultiLineString.
 *
 * @author nttdata
 */
@Data
public class MultiLineString {

    /** The type . */
    private String type;
	
    /** The coordinates . */
    private List<LineString> coordinates;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	

}