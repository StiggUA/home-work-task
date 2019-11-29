package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForViberDesk;

public class ViberDesktop extends ForViberDesk {
    @Override
    public String sendTextMessage() {
        System.out.println("I can send message from my " + viberDesk);
        return "I can send message from my " + viberDesk;
    }

    @Override
    public void sendVideo() {
        System.out.println("I can't take a video, but I can send video files in my " + viberDesk);
    }

    @Override
    public void sendPicture() {
        System.out.println("I can't take a picture, but I can send photos from my " + viberDesk);
    }

    @Override
    public void sendFile() {
        System.out.println("My " + viberDesk + " allows me to send any files");
    }

    @Override
    public void sendSticker() {
        System.out.println("Send stickers via " + viberDesk);
    }

    @Override
    public void profileSetting() {
        System.out.println("Set up my profile in " + viberDesk);
    }

    @Override
    public void groupChat() {
        System.out.println("Sending a message to a few people in " + viberDesk);
    }

    @Override
    public String messageReceive() {
        return "All incoming message I can read in " + viberDesk;
    }

    @Override
    public void messageSearch() {
        System.out.println("Searching your chat in " + viberDesk);
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + viberDesk);
    }

    @Override
    public void notifications() {
        System.out.println("I know about all messages in " + viberDesk);
    }

    @Override
    public void privateChat() {
        System.out.println("Oh yeeeah... It's a secret messages in " + viberDesk);
    }

    @Override
    public void createChannel() {
        System.out.println("Create channel and manage the whole world in " + viberDesk);
    }

    @Override
    public void audioCall() {
        System.out.println("Make calls in " + viberDesk);
    }

    @Override
    public void callViberOut() {
        System.out.println(viberDesk + " allows me to call on any number");
    }

    @Override
    public void videoCall() {
        System.out.println(viberDesk + " makes video calls");
    }
}
