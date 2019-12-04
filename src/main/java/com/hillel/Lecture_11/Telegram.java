package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForTelegramMob;

public class Telegram extends ForTelegramMob {
    @Override
    public String chatWithYourself() {
        System.out.println("In " + telega + " I can send messages to myself ");
        return "In " + telega + " I can send messages to myself";
    }

    @Override
    public String addPeopleNearby() {
        System.out.println("Searching people near you in contacts. Your " + telega);
        return "Searching people near you in contacts. Your " + telega;
    }

    @Override
    public String builtInBrowser() {
        System.out.println(telega + "opens webpages in builtin browser");
        return telega + " opens webpages in builtin browser";
    }

    @Override
    public String sendTextMessage() {
        System.out.println("Send messages to all contacts using " + telega);
        return "Send messages to all contacts using " + telega;
    }

    @Override
    public String sendVideo() {
        System.out.println("Sending video file in " + telega);
        return null;
    }

    @Override
    public String sendPicture() {
        System.out.println("Sharing pictures via " + telega);
        return null;
    }

    @Override
    public String sendFile() {
        System.out.println("The file was sent by " + telega);
        return null;
    }

    @Override
    public void audioCall() {
        System.out.println("Hi! A call you via " + telega + ". Nice to hear you");
    }

    @Override
    public String sendSticker() {
        System.out.println("Adding your own stickers and send via " + telega);
        return null;
    }

    @Override
    public void takePhoto() {
        System.out.println("Use your camera to take a picture. Yours " + telega);
    }

    @Override
    public void takeVideo() {
        System.out.println("Use " + telega + " for sending videos");
    }

    @Override
    public String groupChat() {
        System.out.println("Sending a message to a few people in " + telega);
        return null;
    }

    @Override
    public String messageReceive() {
        System.out.println("You received incoming text message in " + telega);
        return "You received incoming text message in " + telega;
    }

    @Override
    public String messageSearch() {
        System.out.println("Searching your chat in " + telega);
        return null;
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + telega);
    }

    @Override
    public void notifications() {
        System.out.println("You have a new message in " + telega);
    }

    @Override
    public String contactImport() {
        System.out.println("All contacts in your messanger. " + telega);
        return null;
    }

    @Override
    public String profileSetting() {
        System.out.println("Set up profile in " + telega);
        return null;
    }

    @Override
    public String privateChat() {
        System.out.println("Oh yeeeah... It's a secret messages in " + telega);
        return "Oh yeeeah... It's a secret messages in " + telega;
    }

    @Override
    public void createChannel() {
        System.out.println("Create channel and manage the whole world in " + telega);
    }
}
