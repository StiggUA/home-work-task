package com.hillel.Lecture_11;

public class OperSystem {
    private String[] systems = {"iOS", "Android", "Windows Phone"};
    public String operSystem(String operSystem) throws IncorrectOs {
        for (String phones: systems) {
            if (phones.equalsIgnoreCase(operSystem)){
                return phones;
            }
//            else if (phones != operSystem(phones)){
//                return "Your operation system " + operSystem + " does not support this messenger.";
//            }
        }
        throw new IncorrectOs("Your operation system " + operSystem + " does not support this messenger.");
    }
}