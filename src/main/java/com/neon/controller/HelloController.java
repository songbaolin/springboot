package com.neon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/index")
    public String index() {
    	System.out.println("sssssssss");
        return "Hello Spring Boot 2.0!songbaolin";
    }
}