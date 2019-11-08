package com.hillel.lecture_2;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    public double calculate9Formula(double x) {
        double result = 1.1d * Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - (3.0/ 8.0);
//        TODO implement formula 9
        return result;
    }

    public double calculate10Formula(double x) {
        double result = (1.0 / 3.0) * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt((Math.exp(0.12* x)));
//        TODO implement formula 10
        return result;
    }

    public double calculate11Formula(double x) {
        double result = (2.0*Math.PI*x) - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * (1 / ((Math.cbrt(Math.pow(x, 2))) + (1.0 / 7.0)));
//        TODO implement formula 11
        return result;
    }

    public double calculate12Formula(double x) {
        double result = Math.log((Math.sqrt(Math.abs(2 - x))) + 1.2) * (1 / (2 + Math.exp(-x))) + Math.cbrt(2 / x);
//        TODO implement formula 12
        return result;
    }

    public double calculate13Formula(double x) {
        double result = Math.pow(Math.exp(-2d + x), 1d/5d) * (1d / (Math.sqrt(Math.pow(x, 2d) + Math.pow(x, 4d) + Math.log(Math.abs(x - 3.14d)))));
//        TODO implement formula 13
        return result;
    }
}
