package com.code.future.controllers;

import com.code.future.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/editorial")
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/register-form")
    public String register(){
        return "editorial_form.html";
    }

    @PostMapping("/record")
    public String record(@RequestParam String name){

        try {
            editorialService.createEditorial(name);
        } catch (Exception e) {
            Logger.getLogger(EditorialController.class.getName()).log(Level.SEVERE, null, e);
            return "editorial_form.html";
        }

        return "index.html";
    }
}
