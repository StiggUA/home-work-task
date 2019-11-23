package com.hillel.Lecture_10;

public class Star extends Galactic {
    @Override
    public void name() {
        System.out.println(String.format("%s -> Hello! I am thr Sun!", this.getClass().getSimpleName()));
    }

    @Override
    public void starMove() {
        System.out.println(String.format("%s -> All planets move around me", this.getClass().getSimpleName()));
    }

    @Override
    public void speed() {
        System.out.println(String.format("%s -> My speed is 19.4 km / s " +
                "(relative to neighboring stars)", this.getClass().getSimpleName()));
    }

    public void satellite() {
        System.out.println(String.format("%s -> I haven't satellites", this.getClass().getSimpleName()));
    }

    @Override
    public void gravitation() {
        System.out.println(String.format("%s -> The speed of free fall on thw Sun is 274 m/s²", this.getClass().getSimpleName()));
    }

    @Override
    public void life() {
        System.out.println(String.format("%s -> I have no life...", this.getClass().getSimpleName()));
    }

    @Override
    public void weight() {
        System.out.println(String.format("%s -> I am the hardest thing in the Sun System. My weight is 1,9885⋅10(30)kg", this.getClass().getSimpleName()));
    }


}
