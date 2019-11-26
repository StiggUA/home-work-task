package com.hillel.Lecture_10.Calculator;

public class UsualCalc extends AbstractCalculator{
    @Override
    public double plus(double a, double b) {System.out.println(String.format("%s -> " + (a + b) + "",  this.getClass().getSimpleName()));
        return a+b;
    }
    @Override
    public double minus(double a, double b) {System.out.println(String.format("%s -> " + (a - b) + "",  this.getClass().getSimpleName()));
        return a-b;}
    @Override
    public double multiply(double a, double b) {System.out.println(String.format("%s -> " + (a * b) + "",  this.getClass().getSimpleName()));
        return a*b;}
    @Override
    public double divide(double a, double b) {System.out.println(String.format("%s -> " + (a / b) + "",  this.getClass().getSimpleName()));
        return a/b;}
}
