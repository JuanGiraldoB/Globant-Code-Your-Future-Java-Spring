package main.Entities;

import java.util.HashSet;

public class BookStore {

    HashSet<Book> books;

    public BookStore(HashSet<Book> books) {
        this.books = books;
    }

    public boolean loan(Book book) {

        if (book.getAmountBorrowed() >= book.getAmount()) {
            return false;
        }

        book.setAmountBorrowed(book.getAmountBorrowed() + 1);
        return true;

    }

    public boolean refund(Book book) {

        if (book.getAmountBorrowed()  == 0) {
            return false;
        }

        book.setAmountBorrowed(book.getAmountBorrowed() - 1);
        return true;

    }

    public Book findBook(String bookName) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookName)) {
                return book;
            }
        }

        return null;
    }

}
