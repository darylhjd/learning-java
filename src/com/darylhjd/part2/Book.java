package com.darylhjd.part2;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    protected String name;
    protected int ageRec;

    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRec() {
        return this.ageRec;
    }

    @Override
    public String toString() {
        return String.format("%s (recommended for %d year-olds or older)", this.name, this.ageRec);
    }

    @Override
    public int compareTo(Book b) {
        return Comparator.comparing(Book::getAgeRec)
                .thenComparing(Book::getName)
                .compare(this, b);
    }
}
