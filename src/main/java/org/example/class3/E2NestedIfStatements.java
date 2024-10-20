package org.example.class3;

public class E2NestedIfStatements {
    public static void main(String[] args) {
        // CTRl+Alt+L on windows
        // Cmd+Ops+L on Expensive Macs
        //Nested If Statements
        double accountBalance = 30000;
        char gender = 'M';
        System.out.print(1);
        if (accountBalance >= 40000) {
            System.out.print(2);
            if (gender == 'F') {
                System.out.print(3);
            } else {
                System.out.print(4);
            }
            System.out.print(5);

        } else {
            System.out.print(6);
        }
        System.out.print(7);
    }
}
