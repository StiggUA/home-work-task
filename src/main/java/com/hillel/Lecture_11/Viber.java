package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForViberMob;

public class Viber extends ForViberMob {
    @Override
    public String sendTextMessage() {
        System.out.println("Send messages to all contacts using " + viber);
        return "Send messages to all contacts using " + viber;}

    @Override
    public String sendVideo() {
        System.out.println("Sending video file in " + viber);
        return null;
    }

    @Override
    public String sendPicture() {
        System.out.println("Sharing pictures via " + viber);
        return null;
    }
    @Override
    public String sendFile() {
        System.out.println("The file was sent by " + viber);
        return null;
    }
    @Override
    public void audioCall() {
        System.out.println("Hi! A call you via " + viber + ". Nice to hear you");
    }

    @Override
    public String sendSticker() {
        System.out.println("Adding your own stickers and send via " + viber);
        return null;
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
    public String privateChat() {
        System.out.println("Oh yeeeah... It's a secret messages in " + viber);
        return null;
    }

    @Override
    public void createChannel() {
        System.out.println("Create channel and manage the whole world in " + viber);
    }

    @Override
    public String callViberOut() {
        System.out.println("Yes, " + viber + " able to call on mobile numbers");
        return null;
    }

    @Override
    public String videoCall() {
        System.out.println(viber + " can make a videocall");
        return null;
    }
}
