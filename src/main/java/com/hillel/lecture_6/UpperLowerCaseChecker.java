package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        String upper = word.toUpperCase();
        result = upper;

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        String lower = word.toLowerCase();
        result = lower;
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
//        char[] array = sentence.toCharArray();
//        array[0] = Character.toUpperCase(array[0]);
//        String first = Character.toString(array[0]);
//        result = first;

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
       // String letter =

        return result;
    }
}
