package com.hillel.Lecture_10.Galactic;

public class Planet extends AbstractGalactic {
    @Override
    public void name() {
        System.out.println(String.format("%s -> Earth", this.getClass().getSimpleName()));
    }

    @Override
    public void starMove() {
        System.out.println(String.format("%s -> The Earth revolves around the sun", this.getClass().getSimpleName()));
    }

    @Override
    public void speed() {
        System.out.println(String.format("%s -> The Earth moves with the speed 29,783 km/s", this.getClass().getSimpleName()));
    }

    public void satellite() {
        System.out.println(String.format("%s -> The satellite of the Earth is Moon", this.getClass().getSimpleName()));
    }

    @Override
    public void gravitation() {
        System.out.println(String.format("%s -> The speed of free fall on thw Sun is 9.8 m/s²", this.getClass().getSimpleName()));
    }

    @Override
    public void life() {
        System.out.println(String.format("%s -> There are 7,53 billion people", this.getClass().getSimpleName()));
    }

    @Override
    public void weight() {
        System.out.println(String.format("%s -> The weight of the Earth is 5,972E24 kg", this.getClass().getSimpleName()));
    }

    public void people() {
        System.out.println(String.format("%s -> We will colonize all the planets! Ha-ha-ha", this.getClass().getSimpleName()));
    }
}
