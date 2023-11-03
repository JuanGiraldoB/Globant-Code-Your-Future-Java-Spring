package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;

    private String name;
    private Integer year;
    private Integer copies;
    private Integer borrowedCopies;
    private Integer leftCopies;
    private Boolean status;
    @OneToOne
    private Author author;
    @OneToOne
    private Editorial editorial;

    public Book() {
    }

    public Book(String name, Integer year, Integer copies, Integer borrowedCopies, Integer leftCopies, Boolean status, Author author, Editorial editorial) {
        this.name = name;
        this.year = year;
        this.copies = copies;
        this.borrowedCopies = borrowedCopies;
        this.leftCopies = leftCopies;
        this.status = status;
        this.author = author;
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    public Integer getLeftCopies() {
        return leftCopies;
    }

    public void setLeftCopies(Integer leftCopies) {
        this.leftCopies = leftCopies;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", copies=" + copies +
                ", borrowedCopies=" + borrowedCopies +
                ", leftCopies=" + leftCopies +
                ", high=" + status +
                ", author=" + author +
                ", editorial=" + editorial +
                '}';
    }
}
