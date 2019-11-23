package com.hillel.Lecture_10.Galactic;

public class GalacticMain {
    public static void main(String[] args) {
        SunSystem sunSystem = new SunSystem();
        sunSystem.name();
        sunSystem.planets();
        sunSystem.formOfPlanet();
        sunSystem.gravitation();
        sunSystem.speed();
        sunSystem.weight();
        sunSystem.starMove();
        sunSystem.life();

        Star star = new Star();
        star.name();
        star.gravitation();
        star.speed();
        star.starMove();
        star.weight();
        star.satellite();
        star.life();

        Planet planet = new Planet();
        planet.name();
        planet.starMove();
        planet.weight();
        planet.speed();
        planet.gravitation();
        planet.satellite();
        planet.life();
        planet.people();
    }
}

