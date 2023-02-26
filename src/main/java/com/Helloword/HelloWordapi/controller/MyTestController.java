package com.Helloword.HelloWordapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
/**
 * Controller class that handles HTTP requests for the Hello World API.
 */
@RestController

public class MyTestController {
    /**
     * Handles HTTP GET requests to the /api endpoint.
     *
     * @param name the name parameter, which defaults to "Mr" if not specified.
     * @return a HashMap containing the response status and message.
     */
    @GetMapping(path = "/api")
    public HashMap<String,String> giveQuote(@RequestParam(value = "name", defaultValue = "World") String name){
        // create a new HashMap to hold the response data
        HashMap<String,String> response= new HashMap<String,String>();
        try {
            // set the response status and message
            response.put("status", "200");
            response.put("result","Hello " + name );
        } catch (Exception e) {
            // handle any exceptions that may occur during the blocking operation
            response.put("status", "Error");
            response.put("message", "An error occurred while processing your request.");
        }
        // return the response data
        return response;
    }

    /**
     * Handles HTTP GET requests to the /api/hw endpoint.
     *
     * @return a String containing the "Hello World!" message.
     */
    @GetMapping(path = "/api/hw")
    public String getHome(){
        return "Hello World!";
    }
}

