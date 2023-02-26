package com.Helloword.HelloWordapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/1")
public class MyTestController {
    @GetMapping(path = "/api")
    public HashMap<String,String> giveQuote(){
        HashMap<String,String> response= new HashMap<String,String>();
        response.put("status", "Ok");
        response.put("result","Hello World" );
        return response;
    }
}
