package com.darylhjd.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookReader {
    protected Scanner scanner;
    protected ArrayList<Book> bookList;

    public BookReader() {
        this.scanner = new Scanner(System.in);
        this.bookList = new ArrayList<>();
    }

    public void start() {
        String name;
        int ageRec;
        while (true) {
            System.out.print("Enter book name, empty stops: ");
            name = this.scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Enter age rec: ");
            ageRec = Integer.parseInt(this.scanner.nextLine());
            this.bookList.add(new Book(name, ageRec));
        }
        System.out.printf("\n%d books in total.\n\n", this.bookList.size());
    }

    public void printBooks() {
        System.out.println("Books:");
        Collections.sort(this.bookList);
        for(Book b: this.bookList) {
            System.out.println(b);
        }
    }
}
