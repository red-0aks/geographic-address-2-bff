package cl.wom.msbff.model;


import lombok.Data;

/**
 * The Class GeographicAddressValidationStateChangeEvent.
 *
 * @author nttdata
 */
@Data
public class GeographicAddressValidationStateChangeEvent {

    /** The event . */
    private GeographicAddressValidationStateChangeEventPayload event;
	
    /** The eventId . */
    private String eventId;
	
    /** The eventTime . */
    private String eventTime;
	
    /** The eventType . */
    private String eventType;
	
    /** The correlationId . */
    private String correlationId;
	
    /** The domain . */
    private String domain;
	
    /** The title . */
    private String title;
	
    /** The description . */
    private String description;
	
    /** The priority . */
    private String priority;
	
    /** The timeOcurred . */
    private String timeOcurred;
	

}