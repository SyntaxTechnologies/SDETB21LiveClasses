package org.example.class3;

public class E1NestedIfStatements {
    public static void main(String[] args) {

        //Nested If Statements
        double accountBalance=45000;
        char gender='F';
        if(accountBalance>=40000){

            if(gender=='F'){
                System.out.println("Lets buy Pink Color");
            }else {
                System.out.println("lets buy Black");
            }


        }else {
            System.out.println("Lets save more for Brand new Tesla");
        }
    }
}
