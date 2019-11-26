package com.hillel.Lecture_10.Calculator;

public class Engineer extends AbstractCalculator {

    public double sqrt(double a){
        System.out.println(String.format("%s -> The squre root of " + a + " is " + Math.sqrt(a) + "",  this.getClass().getSimpleName()));
        return Math.sqrt(a);
    }
    public double sin(double a){
        System.out.println(String.format("%s -> " + Math.sin(a) + " is a sinus of number " + a + "",  this.getClass().getSimpleName()));
        return Math.sin(a);
    }
    public double dayToSec(int a){
        System.out.println(String.format("%s -> " + a * 86400 + " seconds in " + a + " days", this.getClass().getSimpleName()));
        return a * 86400;
    }
    public double celsiusToFahrenheit(double a){
        System.out.println(String.format("%s -> " + a * 9/5 + 32 + " Fahrenheit degrees", this.getClass().getSimpleName()));
        return (a * 9/5 + 32);
    }
    public double degrees(double a){
        System.out.println(String.format("%s -> The sinus of " + a + " degrees equals to " + (Math.sin((Math.toRadians(a)))), this.getClass().getSimpleName()));
        return (Math.sin((Math.toRadians(a))));
    }
    public double poundsToKilograms(double a){
        System.out.println(String.format("%s -> The weight of " + a + " pounds is " + a / 2.2046 + " kilos", this.getClass().getSimpleName()));
        return a / 2.2046;
    }

}
