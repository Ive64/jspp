package com.example.demo.controller;

import com.example.demo.model.Bag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/???")
@RequiredArgsConstructor
public class BagListController {

    @GetMapping("/???")
    public String listBags(Model model, @RequestParam(required = false, name = "color") String colorName) {
        List<Bag> bags = null;

        //TODO ...

        model.addAttribute("bags", bags);
        return "bag-list";
    }



}
