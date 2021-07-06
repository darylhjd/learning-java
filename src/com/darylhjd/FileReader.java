package com.darylhjd;

import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {
    public static void readFile(String filepath) {
        try (Scanner fileScanner = new Scanner(Paths.get(filepath))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
