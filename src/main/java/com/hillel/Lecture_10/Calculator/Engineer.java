package com.hillel.Lecture_10.Calculator;

public class Engineer extends AbstractCalculator {
    @Override
    public void plus(double a, double b) {System.out.println(a + b);}
    @Override
    public void minus(double a, double b) {System.out.println(a - b); }
    @Override
    public void multiply(double a, double b) {System.out.println(a * b);}
    @Override
    public void divide(double a, double b) {System.out.println(a / b);}

    public void sqrt(double a){
        System.out.println(String.format("%s -> The squre root of " + a + " is " + Math.sqrt(a) + "",  this.getClass().getSimpleName()));
    }
    public void sin(double a){
        System.out.println(String.format("%s -> " + Math.sin(a) + " is a sinus of number " + a + "",  this.getClass().getSimpleName()));
    }
    public void dayToSec(int a){
        System.out.println(String.format("%s -> " + a * 86400 + " seconds in " + a + " days", this.getClass().getSimpleName()));
    }
    public  void celsiusToFahrenheit(double a){
        System.out.println(String.format("%s -> " + a * 9/5 + 32 + " Fahrenheit degrees", this.getClass().getSimpleName()));
    }
    public void degrees(double a){
        System.out.println(String.format("%s -> The sinus of " + a + " degrees equals to " + (Math.sin((Math.toRadians(a)))), this.getClass().getSimpleName()));
    }
    public void poundsToKilograms(double a){
        System.out.println(String.format("%s -> The weight of " + a + " pounds is " + a / 2.2046 + " kilos", this.getClass().getSimpleName()));
    }

}
