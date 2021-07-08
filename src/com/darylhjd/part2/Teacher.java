package com.darylhjd.part2;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s\n\tsalary %d euro/month", super.toString(), this.salary);
    }
}
