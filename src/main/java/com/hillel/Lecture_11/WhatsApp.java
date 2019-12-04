package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForWhatsAppMob;

public class WhatsApp extends ForWhatsAppMob {
    @Override
    public String sendTextMessage() {
        System.out.println("Send messages to all contacts using " + whatsapp);
        return "Send messages to all contacts using " + whatsapp;
    }

    @Override
    public String sendVideo() {
        System.out.println("Sending video file in " + whatsapp);
        return null;
    }

    @Override
    public String sendPicture() {
        System.out.println("Sharing pictures via " + whatsapp);
        return null;
    }
    @Override
    public String sendFile() {
        System.out.println("The file was sent by " + whatsapp);
        return null;
    }

    @Override
    public void audioCall() {
        System.out.println("Hi! A call you via " + whatsapp + ". Nice to hear you");
    }
    @Override
    public String sendSticker() {
        System.out.println("Adding your own stickers and send via " + whatsapp);
        return null;
    }

    @Override
    public void takePhoto() {
        System.out.println("Use your camera to take a picture. Yours " + whatsapp);
    }

    @Override
    public void takeVideo() {
        System.out.println("Use " + whatsapp + " for sending videos");
    }

    @Override
    public String groupChat() {
        System.out.println("Sending a message to a few people in " + whatsapp);
        return null;
    }
    @Override
    public String messageReceive() {
        System.out.println("You received incoming text message in " + whatsapp);
        return "You received incoming text message in " + whatsapp;}

    @Override
    public String messageSearch() {
        System.out.println("Searching your chat in " + whatsapp);
        return null;
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + whatsapp);
    }

    @Override
    public void notifications() {
        System.out.println("You have a new message in " + whatsapp);
    }

    @Override
    public String contactImport() {
        System.out.println("All contacts in your messenger. " + whatsapp);
        return "All contacts in your messenger. " + whatsapp;
    }

    @Override
    public String profileSetting() {
        System.out.println("Set up profile in " + whatsapp);
        return "Set up profile in " + whatsapp;
    }

    @Override
    public String myStatus() {
        System.out.println("You can create your status using " + whatsapp);
        return "You can create your status using " + whatsapp;}

    @Override
    public String videoCall() {
        System.out.println(whatsapp + " can make a videocall");
        return null;
    }
}
