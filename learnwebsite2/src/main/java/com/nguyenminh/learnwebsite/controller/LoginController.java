package com.nguyenminh.learnwebsite.controller;

import org.springframework.boot.Banner;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@CrossOrigin(origins = "http://localhost:4200/")
public class LoginController {


    @GetMapping("/home")
    public String getHome(){
        return "redirect:http://localhost:4200/";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/logout")
    public  String logOut(Model model){
        model.addAttribute("param.logout" , true);
        return "login";
    }
}
