package com.smsc.sc.controller;


import com.smsc.sc.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/hello")
    public HelloWorldBean hello1(){
        return new HelloWorldBean("Hello World");
    }
}
