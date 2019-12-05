package com.hillel.Lecture_11;

public class PcOS {
    private String[] systems = {"Mac", "Windows", "Linux"};
    public String pcOS(String pcOs) throws MyError {
        for (String systems: systems) {
            if (systems.equalsIgnoreCase(pcOs)){
                return systems;
            }
//            else if (systems != pcOS(systems)) {
//                return "You can't use this messenger on " + pcOs + ".";
//            }
        }
        throw new MyError ("You can't use this messenger on " + pcOs + ".");
    }
}
