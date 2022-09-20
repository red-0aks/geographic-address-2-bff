package cl.wom.msbff.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.wom.msbff.model.EventSubscription;
import cl.wom.msbff.model.EventSubscriptionInput;
import cl.wom.msbff.model.GeographicAddress;
import cl.wom.msbff.model.GeographicAddressValidation;
import cl.wom.msbff.model.GeographicAddressValidationCreate;
import cl.wom.msbff.model.GeographicAddressValidationStateChangeEvent;
import cl.wom.msbff.model.GeographicAddressValidationUpdate;
import cl.wom.msbff.model.GeographicSubAddress;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

//TODO: corregir imports con ctrl shift o

/**
 * The Interface GeographicAddressProxy.
 */
@FeignClient(name = "service", url = "http://localhost:3101")
public interface GeographicAddressProxy {

    @GetMapping("/geographicAddressValidation")
    List<GeographicAddressValidation> listGeographicAddressValidation(@RequestParam("fields") String fields,
            @RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit);

    @PostMapping("/geographicAddressValidation")
    GeographicAddressValidation createGeographicAddressValidation(
            @RequestBody GeographicAddressValidationCreate geographicAddressValidation);

    @GetMapping("/geographicAddressValidation/{id}")
    GeographicAddressValidation retrieveGeographicAddressValidation(@PathVariable("id") String id,
            @RequestParam("fields") String fields);

    @PatchMapping("/geographicAddressValidation/{id}")
    GeographicAddressValidation patchGeographicAddressValidation(@PathVariable("id") String id,
            @RequestBody GeographicAddressValidationUpdate geographicAddressValidation);

    @GetMapping("/geographicAddress")
    List<GeographicAddress> listGeographicAddress(@RequestParam("fields") String fields,
            @RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit);

    @GetMapping("/geographicAddress/{id}")
    GeographicAddress retrieveGeographicAddress(@PathVariable("id") String id, @RequestParam("fields") String fields);

    @GetMapping("/geographicAddress/{geographicAddressId}/geographicSubAddress")
    List<GeographicSubAddress> listGeographicSubAddress(@PathVariable("geographicAddressId") String geographicAddressId,
            @RequestParam("fields") String fields, @RequestParam("offset") Integer offset,
            @RequestParam("limit") Integer limit);

    @GetMapping("/geographicAddress/{geographicAddressId}/geographicSubAddress/{id}")
    GeographicSubAddress retrieveGeographicSubAddress(@PathVariable("geographicAddressId") String geographicAddressId,
            @PathVariable("id") String id, @RequestParam("fields") String fields);

    @PostMapping("/hub")
    EventSubscription registerListener(@RequestBody EventSubscriptionInput data);

    @DeleteMapping("/hub/{id}")
    void unregisterListener(@PathVariable("id") String id);

    @PostMapping("/listener/geographicAddressValidationStateChangeEvent")
    EventSubscription listenToGeographicAddressValidationStateChangeEvent(
            @RequestBody GeographicAddressValidationStateChangeEvent data);

}