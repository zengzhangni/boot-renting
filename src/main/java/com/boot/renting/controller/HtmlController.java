package com.boot.renting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {


    @GetMapping("/log")
    public String log() {
        return "log";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/cs")
    public String cs() {
        return "cs";
    }

}
