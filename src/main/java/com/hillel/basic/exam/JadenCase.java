package com.hillel.basic.exam;

import com.google.common.base.Strings;
import org.apache.velocity.tools.view.VelocityLayoutServlet;

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * <p>
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * <p>
 * Example:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {
        String result = "";
        if (phrase == null){
            return null;}
        else if (phrase.equals("")){
            return null;
        }
        char array[] = phrase.toCharArray();
        if (phrase != null)
            array[0] = Character.toUpperCase(array[0]);
            for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
                String str = new String(array);
                result = str;
            }
        }
       return result;
    }
}

