package org.example.class3;

public class E9LogicalOperator {
    public static void main(String[] args) {

       // OR ||
        // It helps us combine two or more conditions in such a
        //way that if any condition is true overall result is true
        // and only when all the conditions are failed we get a false
        boolean bringFlowers=false;
        boolean bringChocolate=false;
        boolean allMyMistake=false;

        if(bringFlowers||bringChocolate||allMyMistake){
            System.out.println("Wife is happy");
        }else {
            System.out.println("Wife is Sad");
        }

    }
}
