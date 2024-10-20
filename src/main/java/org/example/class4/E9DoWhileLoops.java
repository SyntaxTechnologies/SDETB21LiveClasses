package org.example.class4;

import java.util.Scanner;

public class E9DoWhileLoops {
    public static void main(String[] args) {



        // Please write a piece of code to ask the user for a number
        //as long as the user enters a number less than 10 repeat.
        int counter=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number less than 10");
        counter=scanner.nextInt();
        while (counter<10){
            System.out.println("Please Enter a number less than 10");
            counter=scanner.nextInt();
        }

        // Break till 11:54


    }
}
