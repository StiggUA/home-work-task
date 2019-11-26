package com.hillel.Lecture_10.Calculator;

public abstract class AbstractCalculator {

    public double plus(double a, double b) {System.out.println(String.format("%s -> " + (a + b) + "",  this.getClass().getSimpleName()));
        return a;
    }
    public double minus(double a, double b) {System.out.println(String.format("%s -> " + (a - b) + "",  this.getClass().getSimpleName()));
        return a;
    }
    public double multiply(double a, double b) {System.out.println(String.format("%s -> " + (a * b) + "",  this.getClass().getSimpleName()));
        return a;
    }
    public double divide(double a, double b) {System.out.println(String.format("%s -> " + (a /     b) + "",  this.getClass().getSimpleName()));
        return a;
    }

}
