package com.darylhjd.part2;

public class Student  extends Person implements Comparable<Student> {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return String.format("%s\n\tStudy credits %d", super.toString(), this.credits);
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareToIgnoreCase(student.name);
    }
}
