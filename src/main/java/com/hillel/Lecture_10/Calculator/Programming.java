package com.hillel.Lecture_10.Calculator;

public class Programming extends AbstractCalculator {

    public int cycleCount(int a) {
        for (int i = 0; i <= a; i++) {
            if (i == 0) {
                System.out.println(String.format("%s -> The final countdown", this.getClass().getSimpleName()));
                return a;
            }
            else if(i == a){
                System.out.println(String.format("%s -> Gooooooooooooo", this.getClass().getSimpleName()));
                return a;
            }
                else {
                System.out.println(String.format("%s -> " + (a - i) + "" , this.getClass().getSimpleName()));
                return a;
            }
        }

        return a;
    }
    public void random(int a) {
        int randomInt = (int)(a * Math.random());{
            System.out.println(String.format("%s -> The random number in given range is " + randomInt + "", this.getClass().getSimpleName()));
        }
    }
    public int stars(int a){
        for(int i = 0; i <  a; i++)
        {for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        return a;
    }

}
