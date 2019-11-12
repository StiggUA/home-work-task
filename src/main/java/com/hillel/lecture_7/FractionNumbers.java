package com.hillel.lecture_7;

public class FractionNumbers {
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public FractionNumbers() {
    }

    public FractionNumbers(double number1, double number2) {
    this.number1 = number1;
    this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Default number are: " + number1 + " and " + number2;
    }

    public double plus(){
        return number1 + number2;
    }
    public double minus (){
        return number1 - number2;
    }

    public double multiply(){
        return number1 * number2;
    }
    public double divide(){
        return number1 / number2;
    }
}


