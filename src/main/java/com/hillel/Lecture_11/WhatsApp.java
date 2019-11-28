package com.hillel.Lecture_11;

public class WhatsApp extends ForWhatsApp {
    @Override
    public String sendTextMessage() {
        System.out.println("Send messages to all contacts using " + whatsapp);
        return "Send messages to all contacts using " + whatsapp;
    }

    @Override
    public void sendVideo() {
        System.out.println("Sending video file in " + whatsapp);
    }

    @Override
    public void sendPicture() {
        System.out.println("Sharing pictures via " + whatsapp);
    }
    @Override
    public void sendFile() {
        System.out.println("The file was sent by " + whatsapp);
    }

    @Override
    public void audioCall() {
        System.out.println("Hi! A call you via " + whatsapp + ". Nice to hear you");
    }
    @Override
    public void sendSticker() {
        System.out.println("Adding your own stickers and send via " + whatsapp);
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
    public void groupChat() {
        System.out.println("Sending a message to a few people in " + whatsapp);
    }
    @Override
    public String messageReceive() {
        System.out.println("You received incoming text message in " + whatsapp);
        return "You received incoming text message in " + whatsapp;
    }

    @Override
    public void messageSearch() {
        System.out.println("Searching your chat in " + whatsapp);
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
    public void contactImport() {
        System.out.println("All contacts in your messenger. " + whatsapp);
    }

    @Override
    public void profileSetting() {
        System.out.println("Set up profile in " + whatsapp);
    }

    @Override
    public String myStatus() {
        System.out.println("You can create your status using " + whatsapp);
        return "You can create your status using " + whatsapp;
    }

    @Override
    public void videoCall() {
        System.out.println(whatsapp + " can make a videocall");
    }
}
