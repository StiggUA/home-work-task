package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {


    public String checkNumber(int number) {

//        TODO implements result
        String result = "Even Number";
        if (number % 2 == 0);
        else {
            result = "Odd Number";
        }
        System.out.println(result +
                " BYE");
        return result;
    }
}
