package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */


public class NumberRotator {

    public static long rotate(long n) {
        String l = Long.toString(n);
        long result = 0;
        char[] arr = l.toCharArray();
        long[] longArray = new long[arr.length];
        for (int i = 0; i < 4; i++) {
            char temp = arr[i];
            for (int j = i + 1 ; j < arr.length; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length - 1] = temp;
            String charRes = String.valueOf(arr);
            long res = Long.parseLong(charRes);
            longArray[i] = res;
        }
        long max = longArray[0];
        for (int j = 0; j < longArray.length; j++){
             if (longArray[j] > max)
                 max = longArray[j];
             {
                 result = max;
             }
         }
         return result;
        }
    }

        /*for (int i = 0; i < 1; i++) {
            res = res.substring(1) + res.charAt(0);

            String res1 = res;
            res1 = res1.substring(3) + res1.charAt(1);
            String temp2 = res.charAt(2) + res1.substring(0);
            String res2 = res.charAt(0) + temp2.substring(0);

            String restemp1 = res2.substring(3) + res2.charAt(2);
            String restemp2 = restemp1.substring(1) + restemp1.charAt(0);
            String temp3 = res2.charAt(1) + restemp2.substring(0);
            String res3 = res2.charAt(0) + temp3.substring(0);

            String restemp3 = res3.substring(4) + res3.charAt(3);
            String restemp4 = restemp3.substring(1) + restemp3.charAt(0);
            String restemp5 = restemp4.substring(1) + restemp4.charAt(0);
            String temp4 = res3.charAt(2) + restemp5.substring(0);
            String temp5 = res3.charAt(1) + temp4.substring(0);
            String res4 = res3.charAt(0) + temp5.substring(0);

            long b = Long.parseLong(res2);
            long c = Long.parseLong(res3);
            long d = Long.parseLong(res4);

            if (a > b && a > c && a > d)
                result = a;
            else if (b > a && b > c && b > d)
                result = b;
            else if (c > a && c > b && c > d)
                result = c;
            else
                result = d;*/