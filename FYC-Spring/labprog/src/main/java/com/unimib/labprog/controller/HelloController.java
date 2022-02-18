package com.unimib.labprog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /*
    * RequestMapping maps to all HTTP types of requests.
    * Use GetMapping / PostMapping etc for specific use cases.
    * */
    @RequestMapping("/hello-world")
    public String sayHi() {
        return "Hello to you too, human.";
    }
}
