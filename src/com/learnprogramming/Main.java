package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double myValuesTotal = (firstVariable + secondVariable) * 100;
        System.out.println("Sum multiplied by 100 = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("Remainder from thirdVariable = " + theRemainder);

        boolean isNoRemainder = (theRemainder==0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder.");
        }
        }

    }

