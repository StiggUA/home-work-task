package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForViberMob;

public class Viber extends ForViberMob {
    @Override
    public String sendTextMessage() {
        System.out.println("Send messages to all contacts using " + viber);
        return "Send messages to all contacts using " + viber;}

    @Override
    public void sendVideo() {
        System.out.println("Sending video file in " + viber);
    }

    @Override
    public void sendPicture() {
        System.out.println("Sharing pictures via " + viber);
    }
    @Override
    public void sendFile() {
        System.out.println("The file was sent by " + viber);
    }
    @Override
    public void audioCall() {
        System.out.println("Hi! A call you via " + viber + ". Nice to hear you");
    }

    @Override
    public void sendSticker() {
        System.out.println("Adding your own stickers and send via " + viber);
    }

    @Override
    public void takePhoto() {
        System.out.println("Use your camera to take a picture. Yours " + viber);
    }

    @Override
    public void takeVideo() {
        System.out.println("Use " + viber + " for sending videos");
    }

    @Override
    public void groupChat() {
        System.out.println("Sending a message to a few people in " + viber);
    }
    @Override
    public String messageReceive() {
        System.out.println("You received incoming text message in " + viber);
        return "You received incoming text message in " + viber;}

    @Override
    public void messageSearch() {
        System.out.println("Searching your chat in " + viber);
    }

    @Override
    public void messageShare() {
        System.out.println("Message sharing from " + viber);
    }

    @Override
    public void notifications() {
        System.out.println("You have a new message in " + viber);
    }

    @Override
    public void contactImport() {
        System.out.println("All contacts in your messenger. " + viber);
    }

    @Override
    public void profileSetting() {
        System.out.println("Set up profile in " + viber);
    }

    @Override
    public void privateChat() {
        System.out.println("Oh yeeeah... It's a secret messages in " + viber);
    }

    @Override
    public void createChannel() {
        System.out.println("Create channel and manage the whole world in " + viber);
    }

    @Override
    public void callViberOut() {
        System.out.println("Yes, " + viber + " able to call on mobile numbers");
    }

    @Override
    public void videoCall() {
        System.out.println(viber + " can make a videocall");
    }
}
