package cl.wom.msbff.dto;

import lombok.Data;

@Data
public class CommuneDTO {

    private String id;

    private String code;

    private String name;

    private String locality;

    private String portabilityCode;

    private Boolean shippingAvailability;

    private String cityId;

    private String cityName;

    private String provinceId;

    private String provinceName;

}