package cl.wom.msbff.model;

import java.util.List;
import lombok.Data;

/**
 * The Class GeographicAddress.
 *
 * @author nttdata
 */
@Data
public class GeographicAddress {

    /** The id . */
    private String id;
	
    /** The href . */
    private String href;
	
    /** The city . */
    private String city;
	
    /** The country . */
    private String country;
	
    /** The locality . */
    private String locality;
	
    /** The name . */
    private String name;
	
    /** The postcode . */
    private String postcode;
	
    /** The stateOrProvince . */
    private String stateOrProvince;
	
    /** The streetName . */
    private String streetName;
	
    /** The streetNr . */
    private String streetNr;
	
    /** The streetNrLast . */
    private String streetNrLast;
	
    /** The streetNrLastSuffix . */
    private String streetNrLastSuffix;
	
    /** The streetNrSuffix . */
    private String streetNrSuffix;
	
    /** The streetSuffix . */
    private String streetSuffix;
	
    /** The streetType . */
    private String streetType;
	
    /** The geographicLocation . */
    private GeographicLocationRefOrValue geographicLocation;
	
    /** The geographicSubAddress . */
    private List<GeographicSubAddress> geographicSubAddress;
	
    /** The baseType . */
    private String baseType;
	
    /** The schemaLocation . */
    private String schemaLocation;
	
    /** The type . */
    private String type;
	

}