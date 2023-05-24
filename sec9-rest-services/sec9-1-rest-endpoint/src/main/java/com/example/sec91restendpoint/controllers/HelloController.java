package com.example.sec91restendpoint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * In order to not repeat the @ResponseBody annotation for each method,
 * @Controller and @ResponseBody can be replaced with @RestController.
 */
//@Controller
//public class HelloController {
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello World!";
//    }
//}

/**
 * The new method using the @RestController annotation
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}