package com.hillel.Lecture_10.Calculator;

public class UsualCalc extends AbstractCalculator{
    @Override
    public void plus(double a, double b) {System.out.println(a + b);}
    @Override
    public void minus(double a, double b) {System.out.println(a - b); }
    @Override
    public void multiply(double a, double b) {System.out.println(a * b);}
    @Override
    public void divide(double a, double b) {System.out.println(a / b);}
}
