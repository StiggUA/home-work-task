package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */

/**
 * Написать программу, которая бы решала квадратное уравнение вида a x2+b x+c = 0
 * Переменный a, b, c можно задать вручную. Программа должна учитывать варианты:
 * 1) когда a=0
 * 2) когда дискриминант < 0 - решений нет
 * 3) когда дискриминант = 0 - тогда х1 == х2
 * 4) когда дискриминант > 0 - тогда в уравнении два корня
 */

public class QuadraticEquationChecker {


    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double discriminant = (b * b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
        } else if (discriminant < 0) {
            result = "No roots on the set of real numbers!";
        } else if (discriminant == 0) {
            x1 = -b / (2.0 * a);
            x2 = -b / (2.0 * a);
            result = "Two real, identical roots: [x1 && x2] = -0.6666666666666666";
        } else {
            result = "Discriminant: " + discriminant + ", x1: " + x1 + ", x2: " + x2;
        }

        return result;
    }

}
