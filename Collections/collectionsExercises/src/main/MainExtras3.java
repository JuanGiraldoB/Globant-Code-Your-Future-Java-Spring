package main;

import main.Entities.Book;
import main.Entities.BookStore;

import java.util.HashSet;

public class MainExtras3 {

    public static void main(String[] args) {

        HashSet<Book> books = new HashSet<>();
        books.add(new Book("A Song of Ice and Fire", "G.R.R", 2, 1));

        BookStore bs = new BookStore(books);

        Book foundBook = bs.findBook("A Song of Ice and Fire");
        System.out.println("Borrowed : " + bs.loan(foundBook));

        System.out.println(foundBook);
        System.out.println("Refund : " + bs.refund(foundBook));
        System.out.println("Refund : " + bs.refund(foundBook));
        System.out.println("Refund : " + bs.refund(foundBook));

        System.out.println(foundBook);

    }

}
