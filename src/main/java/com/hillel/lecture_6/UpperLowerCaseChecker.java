package com.hillel.lecture_6;

import io.qameta.allure.Step;

import java.io.BufferedReader;
import java.util.Scanner;

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
        char[] arr = sentence.toCharArray();
        boolean cap = true;
        for (int i = 0; i<arr.length; i++){
            if (cap == true && !Character.isWhitespace(arr[i])) {
                arr[i] =  Character.toUpperCase(arr[i]);
                cap = false;
            }
            else if (arr[i] == '.') {
                    cap = true;
            }
        }
        String s = new String(arr);
        result = s;

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        char array[] = sentence.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        String st = new String(array);
        result = st;


        return result;
    }
}
