package com.darylhjd;

import com.darylhjd.part2.Education;
import com.darylhjd.part2.EmployeesEdu;
import com.darylhjd.part2.PersonEdu;

public class Main {
    public static void main(String[] args) {
        EmployeesEdu university = new EmployeesEdu();
        university.add(new PersonEdu("Petrus", Education.PHD));
        university.add(new PersonEdu("Arto", Education.HS));
        university.add(new PersonEdu("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}

