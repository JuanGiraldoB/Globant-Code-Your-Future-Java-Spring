package main.Entities;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private Integer amount;
    private Integer amountBorrowed;

    public Book() {
    }

    public Book(String title, String author, Integer amount, Integer amountBorrowed) {
        this.title = title;
        this.author = author;
        this.amount = amount;
        this.amountBorrowed = amountBorrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getAmount(), book.getAmount()) && Objects.equals(getAmountBorrowed(), book.getAmountBorrowed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getAmount(), getAmountBorrowed());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(Integer amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", amount=" + amount +
                ", amountBorrowed=" + amountBorrowed +
                '}';
    }
}
