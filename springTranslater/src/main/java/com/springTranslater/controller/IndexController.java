package com.springTranslater.controller;

import com.springTranslater.model.Index;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        Index idx = new Index();

        idx.setInputText("Input");
        idx.setOutputText("Answer");
        return "index";
    }
}
