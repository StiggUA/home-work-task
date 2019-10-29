package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */

/**
 * Написать программу, которая бы решала уравнение вида a x + b = 0
 * Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести
 * значение “х”. Программа должна также учитывать варианты, когда или а = 0 или b = 0
 */

public class LinearEquationChecker {

    public int linearEquation(int a, int b) {

//        TODO implements result
        int result = 0;
        int c = 0;
        if (a != 0 && b != 0) {
            result = (c - b) / a;
        }
        else if (a == 0 || b == 0) {
            System.out.println("Деление на 0");
        }
            return result;
        }
    }

