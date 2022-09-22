package com.niteshkumarportfolio.springboot.controller;

import com.niteshkumarportfolio.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Shabbir");
        user.setEmailId("shabbir@gmail.com");

        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id){
        return "The Path Variable is: "+id;
    }

}
