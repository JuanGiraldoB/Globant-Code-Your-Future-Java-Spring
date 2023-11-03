package com.code.future.services;

import com.code.future.entities.Author;
import com.code.future.entities.Book;
import com.code.future.entities.Editorial;
import com.code.future.exceptions.MyException;
import com.code.future.repositories.AuthorRepository;
import com.code.future.repositories.BookRepository;
import com.code.future.repositories.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    public void createBook(Long isbn, String title, Integer copies, String idAuthor, String idEditorial) throws Exception{

        validate(isbn, title, copies, idAuthor, idEditorial);

        Author author = authorRepository.findById(idAuthor).get();
        Editorial editorial = editorialRepository.findById(idEditorial).get();
        Book book = new Book();

        book.setIsbn(isbn);
        book.setTitle(title);
        book.setCopies(copies);
        book.setRegisterDate(new Date());
        book.setAuthor(author);
        book.setEditorial(editorial);


        bookRepository.save(book);
    }

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();

        books = bookRepository.findAll();

        return books;
    }

    public void updateBook(Long isbn, String title, Integer copies, String idAuthor, String idEditorial) throws Exception{

        validate(isbn, title, copies, idAuthor, idEditorial);

        Optional<Book> resp = bookRepository.findById(isbn);
        Optional<Author> respAuthor = authorRepository.findById(idAuthor);
        Optional<Editorial> respEditorial = editorialRepository.findById(idEditorial);

        if (resp.isEmpty()){
            return;
        }
        if (respAuthor.isEmpty()){
            return;
        }
        if (respEditorial.isEmpty()){
            return;
        }

        Book book = resp.get();
        Author author = respAuthor.get();
        Editorial editorial = respEditorial.get();

        book.setTitle(title);
        book.setCopies(copies);
        book.setAuthor(author);
        book.setEditorial(editorial);

        bookRepository.save(book);
    }

    private void validate(Long isbn, String title, Integer copies, String idAuthor, String idEditorial) throws Exception{
        if (isbn == null){
            throw new MyException("ISBN can not be null");
        }
        if (title == null || title.isEmpty()) {
            throw new MyException("title can not be null");
        }
        if (copies == null) {
            throw new MyException("title can not be null");
        }
        if (idAuthor == null || idAuthor.isEmpty()) {
            throw new MyException("title can not be null");
        }
        if (idEditorial == null || idEditorial.isEmpty()) {
            throw new MyException("title can not be null");
        }
    }

}
