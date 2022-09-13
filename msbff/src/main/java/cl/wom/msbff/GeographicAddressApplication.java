package cl.wom.msbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class GeographicAddressApplication.
 */
@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class GeographicAddressApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(GeographicAddressApplication.class, args);
	}

}