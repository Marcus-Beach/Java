package com.edgetech.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String index ( Model model ){
        System.out.println("here I am");
        return "index.html";
    }
    @RequestMapping("/tester")
    public String tester ( Model model ){
        System.out.println("here I am");
        return "tester.html";
    }
}
