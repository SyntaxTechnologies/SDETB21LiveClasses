package org.example.class3;

import java.util.Scanner;

public class E5ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a color name");
        String color = input.next();

        if (color.equals("yellow")) {
            System.out.println("I like banana");
        } else if (color.equals("red")) {
            System.out.println("I like Apples");
        } else {
            System.out.println("I like Oranges");
        }
    }
}
