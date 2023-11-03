package persistence;

import entities.Author;

import java.util.List;

public final class AuthorDAO extends DAO<Author> {

    @Override
    public void create(Author author){
        super.create(author);
    }

    public void delete(String id) throws Exception {
        Author author = findById(id);
        super.delete(author);
    }

    public Author findById(String id) throws Exception{
        connect();
        Author author = em.find(Author.class, id);
        disconnect();

        return author;
    }

    public List<Author> listAll() throws Exception {
        connect();
        List<Author> authors = em.createQuery("SELECT a FROM Author a").getResultList();
        disconnect();

        return authors;
    }

}
