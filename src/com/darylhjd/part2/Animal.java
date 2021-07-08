package com.darylhjd.part2;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.printf("%s eats\n", this.name);
    }

    public void sleep() {
        System.out.printf("%s sleeps\n", this.name);
    }

    public String getName() {
        return this.name;
    }
}
