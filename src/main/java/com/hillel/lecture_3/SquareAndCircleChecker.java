package com.hillel.lecture_3;

import org.omg.CORBA.MARSHAL;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {


    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        //if (2 * circleArea >= Math.PI * squareArea){
        if ((2*Math.sqrt(circleArea/Math.PI)) <= Math.sqrt(squareArea)){
            result = "The circle is in the square";
        }
        else if ((2*Math.sqrt(circleArea/Math.PI)) == Math.sqrt(squareArea)){
            result = "The circle is in the square";
        }
        else {
            result = "The circle is not in the square";
        }

        return result;
    }

    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        if (Math.sqrt(squareArea) >= Math.sqrt(circleArea * Math.PI)) {
            result = "The square is in the circle";
        }
        else if (Math.sqrt(squareArea) == Math.sqrt(circleArea * Math.PI)) {
            result = "The square is in the circle";
        }
        else if (squareArea * 2 == circleArea){
            result = "The square is in the circle";
        }
        else {result = "The square is not in the circle";}

        return result;
    }

}
