package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        String result = "";
        if (a == b || c == b || a == c) {
            result = "Isosceles triangle!";
        }

        else if (a > b || a < c || a > c || c < b || c > b || b > a){
            result = "No isosceles triangle!";
        }

        return result;
    }
}
