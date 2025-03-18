package com.res.server.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/everyone-authenticated")
    public String getEveryoneText() {
        return "hello to everyone that is authenticated";
    }

    @GetMapping("/customer")
    @RolesAllowed("CUSTOMER")
    public String getUserText() {
        return "hello CUTIE";
    }

    @GetMapping("/admin")
    @RolesAllowed("ADMIN")
    public String getAdminText() {
        return "abc";
    }

}