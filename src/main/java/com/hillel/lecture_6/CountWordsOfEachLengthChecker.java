package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
                int count = 0;
        String first = sentence.replace('.', ' ');
        String second = first.replace(',', ' ');
        String[] split = second.split(" ");

        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.length() == wordLength)
                count++;

           result = count;
        }
        return result;
        }
    }