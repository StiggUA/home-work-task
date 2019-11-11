package com.hillel.lecture_7;

public class FractionNumberChecker {
    public static void main(String[] args) {
        FractionNumbers Numbers = new FractionNumbers(2, 2);
        System.out.println(Numbers);

       // Numbers.number1 = 15; - проверка попытки использовния приватных полей
       // Numbers.number2 = 1.5; - проверка попытки использовния приватных полей

        Numbers.setNumber1(15);
        Numbers.setNumber2(2);

        Numbers.plus();
        Numbers.minus();
        Numbers.divide();
        Numbers.multiply();
    }
}