package com.hillel.lecture_6;

import io.qameta.allure.Step;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
       String result = "";

//       Matcher matcher = Pattern.compile(String.valueOf(letter)).matcher(text);
//
//       int counter = 0;
//       while (matcher.find()) {
//           counter++;
//       }

        int counter = 0;
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == letter)
                counter++;
        }
       result = "Character '" + letter + "' repeated " + counter  + " times";

       return result;
    }
}
