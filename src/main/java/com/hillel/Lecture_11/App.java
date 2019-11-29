package com.hillel.Lecture_11;

public enum App {
    ANDROID("Play Market"),
    IOS("App Store");

    private String source;

    App(String play) {
        this.source = play;
    }
    public String getsource() {
        return source;
    }
}
