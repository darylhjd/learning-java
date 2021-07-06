package com.darylhjd;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            switch (this.scanner.nextLine()) {
                case "stop":
                    return;
                case "add":
                    System.out.print("To add: ");
                    this.list.add(this.scanner.nextLine());
                    break;
                case "list":
                    this.list.print();
                    break;
                case "remove":
                    System.out.print("Which one to remove: ");
                    this.list.remove(Integer.parseInt(this.scanner.nextLine()));
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
}
