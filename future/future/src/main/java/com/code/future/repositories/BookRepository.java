package com.code.future.repositories;

import com.code.future.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b from Book b WHERE b.title = :title")
    public Book findByTitle(@Param("title") String title);

    @Query("SELECT b from Book b WHERE b.author.name = :name")
    public List<Book> findByAuthor(@Param("name") String name);

}
