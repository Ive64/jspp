package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/???")
public class BagPageController {

    @GetMapping("/???")
    public String pageBag(Model model) {

        //TODO ...

        return "bag";
    }
}
