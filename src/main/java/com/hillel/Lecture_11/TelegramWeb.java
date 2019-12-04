package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForTelegramWeb;

public class TelegramWeb extends ForTelegramWeb {
    @Override
    public String sendTextMessage() {
        System.out.println("I can send message from my " + telweb);
        return "I can send message from my " + telweb;
    }

    @Override
    public String sendVideo() {
        System.out.println("I can't take a video, but I can send video files in my " + telweb);
        return null;
    }

    @Override
    public String sendPicture() {
        System.out.println("I can't take a picture, but I can send photos from my " + telweb);
        return "I can't take a picture, but I can send photos from my " + telweb;
    }

    @Override
    public String sendFile() {
        System.out.println("My " + telweb + " allows me to send any files");
        return null;
    }

    @Override
    public String sendSticker() {
        System.out.println("Send stickers via " + telweb);
        return null;
    }

    @Override
    public void profileSetting() {
        System.out.println("Set up my profile in " + telweb);
    }

    @Override
    public void groupChat() {
        System.out.println("Sending a message to a few people in " + telweb);
    }

    @Override
    public String messageReceive() {
        return "All incoming message I can read in " + telweb;
    }

    @Override
    public void messageSearch() {
        System.out.println("Searching your chat in " + telweb);
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + telweb);
    }

    @Override
    public void notifications() {
        System.out.println("I know about all messages in " + telweb);
    }

    @Override
    public void chatWithYourself() {
        System.out.println("I can save messages in " + telweb);
    }
}
