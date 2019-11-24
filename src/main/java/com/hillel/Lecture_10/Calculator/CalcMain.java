package com.hillel.Lecture_10.Calculator;


public class CalcMain {
    public static void main(String[] args) {
        UsualCalc usualCalc = new UsualCalc();
        usualCalc.plus(80, 3);
        usualCalc.multiply(25.2, 16);
        usualCalc.minus(-15.3, 80);
        usualCalc.divide(78, 3);

        Financial financial = new Financial();
        financial.plus(60, 3);
        financial.minus(855, 16);
        financial.multiply(-13.3, 80);
        financial.divide(98, 3);
        financial.discount(8000);
        financial.perpet(3000);
        financial.credit(7999);

        Accounting accounting = new Accounting();
        accounting.plus(60, 3);
        accounting.minus(855, 16);
        accounting.multiply(-13.3, 80);
        accounting.divide(98, 3);
        accounting.markUp(500);
        accounting.murkDown(240);
        accounting.VAT(1000);
        accounting.currency(1300);

        Engineer engineer = new Engineer();
        engineer.plus(60, 3);
        engineer.minus(55, 16);
        engineer.multiply(-13.3, 80);
        engineer.divide(98, 3);
        engineer.degrees(90);
        engineer.celsiusToFahrenheit(150);
        engineer.dayToSec(2);
        engineer.sin(10.0);
        engineer.sqrt(169);
        engineer.poundsToKilograms(7.5);

        Programming programming = new Programming();
        programming.plus(60, 23);
        programming.minus(38, 46);
        programming.multiply(-13.3, 180);
        programming.divide(98, 63);
        programming.cycleCount(5);
        programming.random(80);
        programming.stars(7);
    }
}
