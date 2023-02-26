package com.Helloword.HelloWordapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

        import java.util.HashMap;

@RestController

public class MyTestController {
    @GetMapping(path = "/api")
    public HashMap<String,String> giveQuote(@RequestParam(value = "name", defaultValue = "Mr") String name){
        HashMap<String,String> response= new HashMap<String,String>();
        try {
            // simulate a blocking operation
            response.put("status", "200");
            response.put("result","Hello " + name );
        } catch (Exception e) {
            // handle any exceptions that may occur during the blocking operation
            response.put("status", "Error");
            response.put("message", "An error occurred while processing your request.");
        }
        return response;
    }

    @GetMapping(path = "/api/hw")
    public String getHome(){
        return "Hello World!";
    }
}

