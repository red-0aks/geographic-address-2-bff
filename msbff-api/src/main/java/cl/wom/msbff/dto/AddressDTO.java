package cl.wom.msbff.dto;


import lombok.Data;

/**
 * The Class Address.
 *
 * @author nttdata
 */
@Data
public class AddressDTO {

    /** The id. */
    private Long id;
    
    /** The StreetName. */
    private String streetName;
    
    /** The StreetType. */
    private String streetType;
    
    /** The Dependencies. */
    private Integer dependencies;
    

}