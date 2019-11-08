package com.hillel.lecture_7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FractionNumberChecker {
    public static void main(String[] args) {
        FractionNumbers Numbers = new FractionNumbers(2, 2);
        System.out.println(Numbers);

        Numbers.number1 = 15;
        Numbers.number2 = 1.5;


        Numbers.plus();
        Numbers.minus_ab();
        Numbers.minus_ba();
        Numbers.divideOnA();
        Numbers.divideOnB();
        Numbers.multiply();



//        System.out.println("Enter a number a: ");
//        Scanner input = new Scanner(System.in);
//        double a = input.nextDouble();
//        System.out.println();
//        Scanner input2 = new Scanner(System.in);
//        double b = input.nextDouble();
//
//        Numbers.plus(a+b);
    }
}
