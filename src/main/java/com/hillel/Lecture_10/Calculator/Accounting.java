package com.hillel.Lecture_10.Calculator;

public class Accounting extends AbstractCalculator{

    public void markUp(long a){
        System.out.println(String.format("%s -> The murk up price is " +(a + (a / 100 * 20)) + " USD", this.getClass().getSimpleName()));
    }
    public void murkDown(long a){
        System.out.println(String.format("%s -> The price without mark up is " + (a/120*100) + " USD", this.getClass().getSimpleName()));
    }
    public void VAT(long a){
        System.out.println(String.format("%s -> The sum with VAT is " + a / 100 * 19.5 + " USD", this.getClass().getSimpleName()));
    }
    public void currency(long a){
        System.out.println(String.format("%s -> " + (a * 24.2) + " hrivnas", this.getClass().getSimpleName()));
    }
}
