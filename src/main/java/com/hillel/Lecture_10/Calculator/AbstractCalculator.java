package com.hillel.Lecture_10.Calculator;

public abstract class AbstractCalculator {

    public void plus(double a, double b) {System.out.println(String.format("%s -> " + (a + b) + "",  this.getClass().getSimpleName()));}
    public void minus(double a, double b) {System.out.println(String.format("%s -> " + (a - b) + "",  this.getClass().getSimpleName()));}
    public void multiply(double a, double b) {System.out.println(String.format("%s -> " + (a * b) + "",  this.getClass().getSimpleName()));}
    public void divide(double a, double b) {System.out.println(String.format("%s -> " + (a /     b) + "",  this.getClass().getSimpleName()));}

}
