package com.darylhjd.part2;

public class Person {
    protected String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t%s", this.name, this.address);
    }
}

