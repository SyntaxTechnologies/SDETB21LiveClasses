package org.example.class3;

public class E10LogicalOperator {
    public static void main(String[] args) {

       // OR ||
        // It helps us combine two or more conditions in such a
        //way that if any condition is true overall result is true
        // and only when all the conditions are failed we get a false
      double mathMarks=95;
      double scienceMarks=70;
      double historyMarks=92;

      if(mathMarks>90&&scienceMarks>90&&historyMarks>90){
          System.out.println("You got A+");
      }else {
          System.out.println("You need to work hard");
      }


    }
}
