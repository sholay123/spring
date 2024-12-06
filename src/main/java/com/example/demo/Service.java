package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
  
  @GetMapping("/")
  
  public String fun1() {
    return "welcome to spring boot";
  }
  
  
  @RequestMapping(value="/welcome")
  public String fun1(@RequestParam("name") String name) {
    return "welcome " + name;
  }

}