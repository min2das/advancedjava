package org.advance.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

    Book book1 = new Book(1,"Java", "John", 2010);
    Book book2 = new Book(2,"Java2", "John2", 2010);
    Book book3 = new Book(3,"Java3", "John2", 2010);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return  o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}