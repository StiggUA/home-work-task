package com.hillel.Lecture_10.Calculator;

public class UsualCalc extends AbstractCalculator{
    @Override
    public void plus(double a, double b) {System.out.println(String.format("%s -> " + (a + b) + "",  this.getClass().getSimpleName()));}
    @Override
    public void minus(double a, double b) {System.out.println(String.format("%s -> " + (a - b) + "",  this.getClass().getSimpleName()));}
    @Override
    public void multiply(double a, double b) {System.out.println(String.format("%s -> " + (a * b) + "",  this.getClass().getSimpleName()));}
    @Override
    public void divide(double a, double b) {System.out.println(String.format("%s -> " + (a / b) + "",  this.getClass().getSimpleName()));}
}
