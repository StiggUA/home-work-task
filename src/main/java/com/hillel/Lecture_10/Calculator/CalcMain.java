package com.hillel.Lecture_10.Calculator;


public class CalcMain {
    public static void main(String[] args) {
        UsualCalc usualCalc = new UsualCalc();
        usualCalc.plus(80, 3);
        usualCalc.multiply(25.2, 16);
        usualCalc.multiply(-15.3, 80);
        usualCalc.divide(78, 3);

        Financial financial = new Financial();
        financial.discount(8000);
        financial.perpet(3000);
        financial.credit(7999);

        Accounting accounting = new Accounting();
        accounting.markUp(500);
        accounting.murkDown(240);
        accounting.VAT(1000);
        accounting.currency(1300);

        Engineer engineer = new Engineer();
        engineer.degrees(90);
        engineer.celsiusToFahrenheit(150);
        engineer.dayToSec(2);
        engineer.sin(10.0);
        engineer.sqrt(169);
        engineer.poundsToKilograms(7.5);

        Programming programming = new Programming();
        programming.cycleCount(5);
        programming.random(80);
        programming.stars(7);
    }
}
