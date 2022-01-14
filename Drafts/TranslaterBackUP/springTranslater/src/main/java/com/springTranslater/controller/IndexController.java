package com.springTranslater.controller;

import com.google.cloud.translate.*;
import com.springTranslater.model.Index;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class IndexController {

    @GetMapping("/translate")
    public String index(Model model){
        model.addAttribute("index", new Index());
        return "index";
    }

    @PostMapping("/translate")
    public String response(@ModelAttribute Index index, Model model) throws IOException {
        model.addAttribute("inputText", index);
        System.out.println(index.getInputText());
        return "index";
    }

    public void makingRequest(){

    }

}