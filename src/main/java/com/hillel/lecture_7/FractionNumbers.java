package com.hillel.lecture_7;

public class FractionNumbers {
    public double number1;
    public double number2;

    public double getNumber1() {
        return number1;
    }

    public double getSecondNumber() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setSecondNumber(double number2) {
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

    public void plus(){
        System.out.println(number1 + number2);
    }
    public void minus (){
        System.out.println(number1 - number2);
    }

    public void multiply(){
        System.out.println(number1 * number2);
    }
    public void divide(){
        System.out.println(number1 / number2);
    }
}


