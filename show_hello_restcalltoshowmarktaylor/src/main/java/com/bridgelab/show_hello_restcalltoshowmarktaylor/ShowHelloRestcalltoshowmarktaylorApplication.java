/*
Make REST Call to show Hello Mark
Taylor from BridgeLabz
- Use PUT Request Method and pass first name as
Path Variable and last name as Query Parameter
- Use CURL to demonstrate the REST API Call
- curl -X PUT
localhost:8080/hello/put/Mark/?lastName=Taylor
-w "\n"
 */
package com.bridgelab.show_hello_restcalltoshowmarktaylor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShowHelloRestcalltoshowmarktaylorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowHelloRestcalltoshowmarktaylorApplication.class, args);
	}

}
