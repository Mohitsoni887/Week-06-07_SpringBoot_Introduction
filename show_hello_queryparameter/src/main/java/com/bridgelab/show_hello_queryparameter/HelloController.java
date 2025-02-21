/*
Make REST Call to show Hello
Mark from BridgeLabz
- Use GET Request Method and pass name as
query parameter
- Use CURL to demonstrate the REST API Call
- curl localhost:8080/hello/query?name=Mark
-w "\n"
 */
package com.bridgelab.show_hello_queryparameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Endpoint to return "Hello from BridgeLabz"
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Endpoint to return "Hello [name] from BridgeLabz"
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(defaultValue = "Mohit") String name) {
        return "Hello " + name + " from BridgeLabz";
    }



}