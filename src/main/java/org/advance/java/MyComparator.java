package org.advance.java;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return - o1.getTitle().compareTo(o2.getTitle());
    }
}
