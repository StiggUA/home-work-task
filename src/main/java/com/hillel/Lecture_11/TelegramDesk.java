package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForTelegramDesk;

public class TelegramDesk extends ForTelegramDesk {
    @Override
    public String sendTextMessage() {
        System.out.println("I can send message from my " + telDesk);
        return "I can send message from my " + telDesk;
    }

    @Override
    public String sendVideo() {
        System.out.println("I can't take a video, but I can send video files in my " + telDesk);
        return "I can't take a video, but I can send video files in my " + telDesk;
    }

    @Override
    public String sendPicture() {
        System.out.println("I can't take a picture, but I can send photos from my " + telDesk);
        return "I can't take a picture, but I can send photos from my " + telDesk;
    }

    @Override
    public String sendFile() {
        System.out.println("My " + telDesk + " allows me to send any files");
        return "My " + telDesk + " allows me to send any files";
    }

    @Override
    public String sendSticker() {
        System.out.println("Send stickers via " + telDesk);
        return "Send stickers via " + telDesk;
    }

    @Override
    public String profileSetting() {
        System.out.println("Set up my profile in " + telDesk);
        return "Set up my profile in " + telDesk;
    }

    @Override
    public String groupChat() {
        System.out.println("Sending a message to a few people in " + telDesk);
        return "Sending a message to a few people in " + telDesk;
    }

    @Override
    public String messageReceive() {
        return "All incoming message I can read in " + telDesk;
    }

    @Override
    public String messageSearch() {
        System.out.println("Searching your chat in " + telDesk);
        return "Searching your chat in " + telDesk;
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + telDesk);
    }

    @Override
    public void notifications() {
        System.out.println("I know about all messages in " + telDesk);
    }

    @Override
    public String privateChat() {
        System.out.println("Oh yeeeah... It's a secret messages in " + telDesk);
        return "Oh yeeeah... It's a secret messages in " + telDesk;
    }

    @Override
    public void createChannel() {
        System.out.println("Create channel and manage the whole world in " + telDesk);
    }

    @Override
    public void audioCall() {
        System.out.println("Make calls in " + telDesk);
    }

    @Override
    public String chatWithYourself() {
        System.out.println("I can save messages in " + telDesk);
        return "I can save messages in " + telDesk;
    }
}
