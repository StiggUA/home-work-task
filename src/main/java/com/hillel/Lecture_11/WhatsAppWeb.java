package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForWhatsAppWeb;

public class WhatsAppWeb extends ForWhatsAppWeb {
    @Override
    public String sendTextMessage() {
        System.out.println("I can send message from my " + whatWeb);
        return "I can send message from my " + whatWeb;
    }

    @Override
    public String sendVideo() {
        System.out.println("I can't take a video, but I can send video files in my " + whatWeb);
        return null;
    }

    @Override
    public String sendPicture() {
        System.out.println("I can't take a picture, but I can send photos from my " + whatWeb);
        return null;
    }

    @Override
    public String sendFile() {
        System.out.println("My " + whatWeb + " allows me to send any files");
        return null;
    }

    @Override
    public String sendSticker() {
        System.out.println("Send stickers via " + whatWeb);
        return null;
    }

    @Override
    public void profileSetting() {
        System.out.println("Set up my profile in " + whatWeb);
    }

    @Override
    public void groupChat() {
        System.out.println("Sending a message to a few people in " + whatWeb);
    }

    @Override
    public String messageReceive() {
        return "All incoming message I can read in " + whatWeb;
    }

    @Override
    public void messageSearch() {
        System.out.println("Searching your chat in " + whatWeb);
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + whatWeb);
    }

    @Override
    public void notifications() {
        System.out.println("I know about all messages in " + whatWeb);
    }
}
