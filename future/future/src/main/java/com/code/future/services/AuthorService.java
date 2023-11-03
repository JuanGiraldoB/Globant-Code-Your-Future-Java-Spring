package com.code.future.services;

import com.code.future.entities.Author;
import com.code.future.exceptions.MyException;
import com.code.future.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Transactional
    public void createAuthor(String name) throws Exception {

        validate(name);

        Author author = new Author();

        author.setName(name);

        authorRepository.save(author);
    }

    public List<Author> getAuthors(){
        List<Author> authors = new ArrayList<>();

        authors = authorRepository.findAll();

        return authors;
    }

    public void updateAuthor(String id, String name) throws MyException {

        validate(name);

        Optional<Author> resp = authorRepository.findById(id);

        if (resp.isEmpty()){
            return;
        }

        Author author = resp.get();
        author.setName(name);

        authorRepository.save(author);
    }

    private void validate(String name) throws MyException {
        if (name == null || name.isEmpty()){
            throw new MyException("Can not be null");
        }
    }

}
