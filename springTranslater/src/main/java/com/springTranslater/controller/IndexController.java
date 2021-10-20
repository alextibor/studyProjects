package com.springTranslater.controller;

import com.springTranslater.model.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/translate")
    public String index(Model model){
        model.addAttribute("index", new Index());
        return "index";
    }

    @PostMapping("/translate")
    public String response(@ModelAttribute Index index, Model model){
        model.addAttribute("inputText", index);
        System.out.println(index.getInputText());
        return "index";
    }
}