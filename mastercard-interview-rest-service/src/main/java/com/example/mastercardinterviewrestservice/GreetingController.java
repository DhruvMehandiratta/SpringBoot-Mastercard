package com.example.mastercardinterviewrestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    //how someone interacts with our api
    //this class does some request mappings
    //@RestController -> returns some data
    //@AppController -> returns some view

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();  //sets id for each greeting object

    // we need a single entry point of our application which is going to return a greeting object: -


    // greeting?name=Dan
    @GetMapping("/greeting")
    // specifies that this is going to be a get request with /greeting  entrypoint
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
