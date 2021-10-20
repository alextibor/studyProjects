package com.heraclito;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("alex", "this is coming from the controller");
        model.addAttribute("tibor", "this is coming from the controller");
        return "people";
    }
}