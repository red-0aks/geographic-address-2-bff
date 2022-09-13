package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class EventSubscriptionInput.
 *
 * @author nttdata
 */
@Data
public class EventSubscriptionInput {

    /** The callback . */
    private String callback;
	
    /** The query . */
    private String query;
	

}