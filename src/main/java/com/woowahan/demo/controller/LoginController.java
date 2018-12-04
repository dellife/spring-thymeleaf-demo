package com.woowahan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @RequestMapping("/login")
//    public String login(Model model, HttpSession session)
//    {
//        String id = session.getAttribute("id") == null ? (String) session.getAttribute("id") : "";
//        model.addAttribute("id", id);
//        return "login";
//    }
}
