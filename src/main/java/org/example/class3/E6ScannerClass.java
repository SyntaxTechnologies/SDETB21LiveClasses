package org.example.class3;

import java.util.Scanner;

public class E6ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a color name");
        String entireLine = input.nextLine();
        System.out.println("You have entered "+entireLine);

    }
}
