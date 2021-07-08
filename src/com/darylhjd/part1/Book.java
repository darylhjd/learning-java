package com.darylhjd.part1;

public class Book {
    private final String author;
    private final String name;
    private int pageCount;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pageCount = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d pages", this.author, this.name, this.pageCount);
    }
}
