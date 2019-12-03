package com.hillel.Lecture_11;

public class PcOS {
    private String[] systems = {"Mac", "Windows", "Linux"};
    public String pcOS(String pcOs) throws MyError {
        for (String systems: systems) {
            if (systems.equalsIgnoreCase(pcOs)){
                return systems;
            }
        }
        throw new MyError ("You can't use this messenger on " + pcOs + ".");
    }
}
