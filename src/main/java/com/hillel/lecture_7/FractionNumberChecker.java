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
        Numbers.minus();
        Numbers.divide();
        Numbers.multiply();
    }
}
