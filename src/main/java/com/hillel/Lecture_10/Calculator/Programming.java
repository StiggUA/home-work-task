package com.hillel.Lecture_10.Calculator;

import java.util.Scanner;

public class Programming extends AbstractCalculator {
    private Scanner random;

    @Override
    public void plus(double a, double b) {System.out.println(a + b);}
    @Override
    public void minus(double a, double b) {System.out.println(a - b); }
    @Override
    public void multiply(double a, double b) {System.out.println(a * b);}
    @Override
    public void divide(double a, double b) {System.out.println(a / b);}

    public void cycleCount(double a){
        for (int i = 0; i < a; i++) {
            System.out.println(String.format("%s -> This program works " + (a - i) + " times",  this.getClass().getSimpleName()));
        }
    }
    public void random(int a) {
        int randomInt = (int)(a * Math.random());{
            System.out.println(String.format("%s -> The random number in given range is " + randomInt + "", this.getClass().getSimpleName()));
        }
    }
    public void stars(int a){
        for(int i = 0; i<  a; i++)
        {for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
