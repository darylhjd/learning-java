package com.darylhjd;

import com.darylhjd.part2.BookReader;
import com.darylhjd.part2.Checker;

public class Main {
    public static void main(String[] args) {
        System.out.println(Checker.timeOfDay("17:23:05"));
        System.out.println(Checker.timeOfDay("abc"));
        System.out.println(Checker.timeOfDay("33:33:33"));
    }
}

