package com.spring.recipebook.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"", "/", "index", "index.html"})

    public String getIndexPage(){
        System.out.println("Bye");
        return "index";
    }


}