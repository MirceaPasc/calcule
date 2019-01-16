package org.fasttrackit;

import javax.sound.midi.Soundbank;

public class Calculations {




    public static double calculate(double firstNumber, double secondNumber) {
        System.out.println(firstNumber +  " + "  + secondNumber);

        double result = firstNumber + secondNumber;

        System.out.println("= " + result);
        return (result);
    }

    public static long calculate(long fisrtNumber, long secondNumber){
        System.out.println(fisrtNumber + " + " + secondNumber);

        long result = fisrtNumber + secondNumber;

        System.out.println("= " + result);
        return (result);

    }

    public static double calculate1(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " * "  + secondNumber);

        double result = firstNumber * secondNumber;

        System.out.println("= " + result);
        return (result);
    }

    public static long calculate1(long firstNumber, long secondNumber){
        System.out.println(firstNumber + " * " + secondNumber);

        long result = firstNumber * secondNumber;

        System.out.println("= " + result);
        return (result);
    }

}
