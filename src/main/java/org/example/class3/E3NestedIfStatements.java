package org.example.class3;

public class E3NestedIfStatements {
    public static void main(String[] args) {

        double accountBalance = 30000;
        char gender = 'M';
        int age = 45;
        System.out.print(1);
        if (accountBalance >= 40000){
            System.out.print(2);
            if (gender == 'F') {
                System.out.print(3);
            } else {
                System.out.print(4);
            }
            System.out.print(5);

        } else {
            System.out.print(6);
            if (age > 40) {
                System.out.print(7);
            } else {
                System.out.print(8);
            }

            System.out.print(9);
        }
        System.out.print(10);
    }
}
