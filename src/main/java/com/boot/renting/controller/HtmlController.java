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

    @GetMapping("/landlord/landlordIndex")
    public String landlordIndex() {
        return "landlord/landlordIndex";
    }

    @GetMapping("/user/userIndex")
    public String userIndex() {
        return "user/userIndex";
    }


    /*--------------------------admin------------------------------*/

    @GetMapping("/admin/index")
    public String adminIndex() {
        return "admin/index";
    }

    @GetMapping("/admin/login")
    public String adminLogin() {
        return "admin/login";
    }

    @GetMapping("/admin/adminList")
    public String adminList() {
        return "admin/adminList";
    }

    @GetMapping("/admin/userList")
    public String userList() {
        return "admin/userList";
    }

    @GetMapping("/admin/landlordList")
    public String landlordList() {
        return "admin/landlordList";
    }


    @GetMapping("/cs")
    public String cs() {
        return "cs";
    }


//
//    @GetMapping("/{html}")
//    public String html(@PathVariable("html") String html) {
//        return html;
//    }
//
//    @GetMapping("/{root}/{html}")
//    public String rootHtm(@PathVariable("root") String root, @PathVariable("html") String html) {
//        return root + "/" + html;
//    }
}
