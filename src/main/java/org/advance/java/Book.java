package org.advance.java;

public class Book
{

    int id;
    private String title;
    private String author;
    private int year;

    public Book(int id,String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}
