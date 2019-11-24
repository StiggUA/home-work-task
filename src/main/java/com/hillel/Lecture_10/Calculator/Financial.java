package com.hillel.Lecture_10.Calculator;

public class Financial extends AbstractCalculator {

    public void discount(double a) {
        if (a < 1000) {
            System.out.println(String.format("%s -> Discount is " + (a / 100 * 10) + " dollars", this.getClass().getSimpleName()));
        } else System.out.println(String.format("%s -> Discount is " + (a / 100 * 15) + " dollars", this.getClass().getSimpleName()));
    }
    public void perpet(double a){
        if (a <= 1000 ){
            System.out.println(String.format("%s -> You have to pay " + a / 12 + " dollars per month", this.getClass().getSimpleName()));
        }
        else if (a > 1000 && a < 3000){
            System.out.println(String.format("%s -> You have to pay " + a / 24 + " dollars per month", this.getClass().getSimpleName()));
        }
        else
        {
            System.out.println(String.format("%s -> You have to pay " + a / 36 + " dollars per month", this.getClass().getSimpleName()));
        }
    }
    public void credit(double a){
        System.out.println(String.format("%s -> After insurance pay and percent your credit pay is " +
                (a + (a/100*5) + (a / 100 * 12)) + " dollars", this.getClass().getSimpleName()));
    }
}
