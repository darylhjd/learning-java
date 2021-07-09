package com.darylhjd.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeesEdu {
    protected List<PersonEdu> employees;

    public EmployeesEdu() {
        this.employees = new ArrayList<>();
    }

    public void add(PersonEdu personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<PersonEdu> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    public void print() {
        for (PersonEdu employee : this.employees) {
            System.out.println(employee);
        }
    }

    public void print(Education education) {
        this.employees.stream().filter(p -> p.edu == education).forEach(System.out::println);
    }

    public void fire(Education education) {
        Iterator<PersonEdu> i = this.employees.iterator();

        while (i.hasNext()) {
            if (i.next().edu == education) {
                i.remove();
            }
        }
    }
}
