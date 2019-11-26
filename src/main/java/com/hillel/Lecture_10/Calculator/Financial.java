package com.hillel.Lecture_10.Calculator;

public class Financial extends AbstractCalculator {

    public double discount(double a) {
        if (a < 1000) {
            System.out.println(String.format("%s -> Discount is " + (a / 100 * 10) + " dollars", this.getClass().getSimpleName()));
        } else System.out.println(String.format("%s -> Discount is " + (a / 100 * 15) + " dollars", this.getClass().getSimpleName()));
        return (a / 100 * 15);
    }
    public double perpet(double a){
        if (a <= 1000 ){
            System.out.println(String.format("%s -> You have to pay " + a / 12 + " dollars per month", this.getClass().getSimpleName()));
            return Math.abs(a / 12);
        }
        else if (a > 1000 && a < 3000){
            System.out.println(String.format("%s -> You have to pay " + a / 24 + " dollars per month", this.getClass().getSimpleName()));
            return Math.abs(a / 24);
        }
        else
        {
            System.out.println(String.format("%s -> You have to pay " + a / 36 + " dollars per month", this.getClass().getSimpleName()));
            return Math.abs(a / 36);
        }

    }
    public double credit(double a, double b){
        System.out.println(String.format("%s -> After insurance pay and percent your credit pay is " +
                (a + (a/100*b) + (a / 100 * 12)) + " dollars", this.getClass().getSimpleName()));
        return (a + (a/100*b) + (a / 100 * 12));
    }
}
