/*
Make REST Call to show Hello Mark
Taylor from BridgeLabz
- Use POST Request Method and pass first name and
last name in the Body
- Create User DTO Bean with firstName and lastName as
attributes.
- Use CURL to demonstrate the REST API Call
- curl -X POST -H "Content-Type: application/json" -d
'{"firstName": ”Mark","lastName": ”Taylor"}'
"http://localhost:8080/hello/post" -w "\n"
 */
package com.bridgelab.show_hello._mark_taylor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // POST Request to accept JSON Body and return a message
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}