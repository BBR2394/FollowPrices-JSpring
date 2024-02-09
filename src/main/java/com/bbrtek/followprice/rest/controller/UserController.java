package com.bbrtek.followprice.rest.controller;

import com.bbrtek.followprice.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/test")
    public String messageTest() {
        return "{ \"message\": \"Bonjour ceci est un message de test\" }";
    }

    @GetMapping("/user/test")
    public User getUserTest() {
        User usrTest = new User();
        usrTest.initTest();
        return usrTest;
    }
}
