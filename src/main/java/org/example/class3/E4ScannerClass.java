package org.example.class3;

import java.util.Scanner;

public class E4ScannerClass {
    public static void main(String[] args) {
        // break till 11:46
        // String name="Adam";
        //new Scanner(System.in) => Creating an object from the scanner class
        Scanner input = new Scanner(System.in);
        // it is going to wait for the user whenever user is
        // going to enter a whole from keyboard it will capture
        // and we can assign it to a variable
        System.out.println("Please Enter your age");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You should be at least 18");
        }
    }
}
