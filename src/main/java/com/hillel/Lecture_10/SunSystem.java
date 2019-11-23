package com.hillel.Lecture_10;

public class SunSystem extends Galactic {

    @Override
    public void name() {
        System.out.println(String.format("%s -> Sun System!", this.getClass().getSimpleName()));
    }

    @Override
    public void starMove() {
        System.out.println(String.format("%s -> All planets move around each other", this.getClass().getSimpleName()));
    }
    @Override
    public void speed() {
        //Формулу можно не проверять, она кривая :)
        System.out.println(String.format("%s -> Planets move with the speed which may be counted by formula: Tc = (nVoSc)-1>5*10(21)c", this.getClass().getSimpleName()));
        System.out.println(String.format("%s -> Planets move veeery fast", this.getClass().getSimpleName()));
    }

    @Override
    public void gravitation() {
        System.out.println(String.format("%s -> Planets have gravitation between each other", this.getClass().getSimpleName()));
        System.out.println(String.format("%s -> The formula for counting is: F = g*((m1*m2)Math.sqrt(r))", this.getClass().getSimpleName()));
    }

    @Override
    public void life() {
        System.out.println(String.format("%s -> Depends on planet. Now I know only one planet has a life", this.getClass().getSimpleName()));
    }

    @Override
    public void weight() {
        System.out.println(String.format("%s -> The approximate weight of the solar system is 1 0014 M☉", this.getClass().getSimpleName()));
    }

    public void planets() {
        System.out.println(String.format("%s -> The four small inner planets, Mercury, Venus, Earth and Mars, +" +
                " are terrestrial planets and four outer planets are giant planets, being substantially +" +
                "more massive than the terrestrials: Jupiter, Saturn,  Uranus and Neptune.", this.getClass().getSimpleName()));
    }

    public void formOfPlanet() {
        System.out.println(String.format("%s -> All planets in the system have a spherical shape", this.getClass().getSimpleName()));
    }

}
