package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class EventSubscription.
 *
 * @author nttdata
 */
@Data
public class EventSubscription {

    /** The id . */
    private String id;
	
    /** The callback . */
    private String callback;
	
    /** The query . */
    private String query;
	

}