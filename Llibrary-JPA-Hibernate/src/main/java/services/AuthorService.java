package services;

import entities.Author;
import persistence.AuthorDAO;

public class AuthorService {

    private final AuthorDAO DAO;

    public AuthorService() {
        DAO = new AuthorDAO();
    }

    public Author createAuthor(String name, boolean high){
        try{
            Author author = new Author(name, high);
            DAO.create(author);
            return author;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
