package com.code.future.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Book {

    @Id
    private Long isbn;
    private String title;
    private Integer copies;
    @Temporal(TemporalType.DATE)
    private Date registerDate;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Editorial editorial;

    public Book() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
