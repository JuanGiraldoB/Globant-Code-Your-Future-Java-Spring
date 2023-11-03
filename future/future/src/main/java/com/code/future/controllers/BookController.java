package com.code.future.controllers;

import com.code.future.entities.Author;
import com.code.future.entities.Editorial;
import com.code.future.exceptions.MyException;
import com.code.future.services.AuthorService;
import com.code.future.services.BookService;
import com.code.future.services.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private EditorialService editorialService;

    @GetMapping("/register-form")
    public String register(ModelMap model){

        List<Author> authors = authorService.getAuthors();
        List<Editorial> editorials = editorialService.getEditorials();

        model.put("autores", authors);
        model.put("editoriales", editorials);

        return "book_form.html";
    }

    @PostMapping("/record")
    public String record(@RequestParam(required = false) Long isbn,
                         @RequestParam String title,
                         @RequestParam(required = false) Integer copies,
                         @RequestParam String idAuthor,
                         @RequestParam String idEditorial,
                         ModelMap model){
        try{

            bookService.createBook(isbn, title, copies, idAuthor, idEditorial);

            model.put("exito", "Libro cargado");

        }catch (Exception e){
            model.put("error", e.getMessage());
            return "book_form.html";
        }

        return "index.html";
    }

}
