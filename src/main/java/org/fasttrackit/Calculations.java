package org.fasttrackit;

public class Calculations {




    public static double calculate(double firstNumber, double secondNumber) {
        System.out.println(firstNumber +  " + "  + secondNumber);

        double result = firstNumber + secondNumber;

        System.out.println("= " + result);
        return (result);

    }

    public static double calculate1(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " * "  + secondNumber);

        double result = firstNumber * secondNumber;

        System.out.println("= " + result);
        return (result);

    }
    
}
