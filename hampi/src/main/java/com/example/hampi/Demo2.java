package com.example.hampi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2 {

    @GetMapping(value = "/nk")
    public String m1(){
        System.out.println("m1 inside");
        return "hello akash";
    }
    
}
