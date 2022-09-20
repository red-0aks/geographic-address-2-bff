package cl.wom.msbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class GeographicAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeographicAddressApplication.class, args);
	}

}