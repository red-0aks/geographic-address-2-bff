package cl.wom.msbff.model;

import java.util.List;
import lombok.Data;

/**
 * The Class GeographicLocation.
 *
 * @author nttdata
 */
@Data
public class GeographicLocation {

    /** The id . */
    private String id;
	
    /** The href . */
    private String href;
	
    /** The type . */
    private String type;
	
    /** The bbox . */
    private List<Integer> bbox;
	

}