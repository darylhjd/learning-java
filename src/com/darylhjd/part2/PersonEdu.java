package com.darylhjd.part2;

public class PersonEdu {
    protected String name;
    protected Education edu;

    public PersonEdu(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }

    public Education getEdu() {
        return this.edu;
    }

    @Override
    public String toString() {
        return String.format("%s, %s\n", this.name, this.edu);
    }
}
