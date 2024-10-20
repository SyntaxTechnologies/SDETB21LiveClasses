package org.example.class3;

public class E8LogicalOperator {
    public static void main(String[] args) {

       // Not !
       String country="korea";

       if(!(country.equals("Korea")||country.equals("Iran"))){
           System.out.println("You can come and visit USA");
       }

       if(country.equals("UK")||country.equals("France")||country.equals("Spain")){
           System.out.println("You are allowed");
       }

    }
}
