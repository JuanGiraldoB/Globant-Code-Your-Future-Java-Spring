package com.code.future.controllers;

import com.code.future.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/register-form")
    public String register(){
        return "author_form.html";
    }

    @PostMapping("/record")
    public String record(@RequestParam String name){

        try {
            authorService.createAuthor(name);
        } catch (Exception e) {
            Logger.getLogger(AuthorController.class.getName()).log(Level.SEVERE, null, e);
            return "author_form.html";
        }

        return "index.html";
    }

}
