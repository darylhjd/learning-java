package com.darylhjd.part2;

import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.list = todolist;
        this.scanner = scanner;
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
                    this.list.remove(Integer.parseInt(this.scanner.nextLine()));
                    break;
                default:
                    System.out.println("Unknown command!");
                    break;
            }
        }
    }
}
