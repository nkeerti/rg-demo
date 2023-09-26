package com.example.azuredemo.azuredemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    /**
     * @return
     */
    @RequestMapping("/Hello")
    public String getHello(){

        return "Hello World";
    }
}
