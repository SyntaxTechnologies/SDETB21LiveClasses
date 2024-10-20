package org.example.class3;

import java.util.Scanner;

public class E7ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your gender");
        char gender=input.next().toLowerCase().charAt(0);
        System.out.println("you entered "+gender);
        if(gender=='f'){
            System.out.println("I like a lot of shopping and makeup");
        }else {
            System.out.println("I like to sleep");
        }

    }
}
