package org.example.class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E12ScannerAndLoops {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the number the number from where you want to start the loop");
        int start=scanner.nextInt();
        System.out.println("Please enter the ending number for the loop");
        int end=scanner.nextInt();
        int counter=start;
        while(counter<end){
            System.out.println(counter);
            counter++;
        }


    }
}
