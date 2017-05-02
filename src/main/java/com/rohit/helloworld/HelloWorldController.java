package com.rohit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ryadav1 on 4/27/17.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Rohit Yadav!";
    }

    @RequestMapping("/health")
    public String status() {
        return "OK";
    }


}
