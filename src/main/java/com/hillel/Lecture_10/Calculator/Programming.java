package com.hillel.Lecture_10.Calculator;

public class Programming extends AbstractCalculator {

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
