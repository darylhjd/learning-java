package com.darylhjd;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.printf("%d: %s\n", i+1, this.tasks.get(i));
        }
    }

    public void remove(int number) {
        this.tasks.remove(number-1);
    }
}
