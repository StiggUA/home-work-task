package com.hillel.Lecture_11;

import com.hillel.Lecture_11.Interfaces.*;

public class MyPC {
    private TelegramWeb telegramWeb;
    private TelegramDesk telegramDesk;
    private ViberDesktop viberDesktop;
    private WhatsAppWeb whatsAppWeb;
    private Messenger messenger;
    private SpecChat specialChat;
    private VideoCall videoCall;
    private ViberOut viberOut;
    private ChatSelfWebDesk chatSelfWebDesk;

    public MyPC(TelegramWeb telegramWeb) {
        this.telegramWeb = telegramWeb;
        this.messenger = telegramWeb;
        this.chatSelfWebDesk = telegramWeb;
    }
    public MyPC(TelegramDesk telegramDesk) {
        this.telegramDesk = telegramDesk;
        this.messenger = telegramDesk;
        this.chatSelfWebDesk = telegramDesk;
        this.specialChat = telegramDesk;
    }
    public MyPC(ViberDesktop viberDesktop) {
        this.viberDesktop = viberDesktop;
        this.messenger = viberDesktop;
        this.viberOut = viberDesktop;
        this.videoCall = viberDesktop;
        this.specialChat = viberDesktop;
    }
    public MyPC(WhatsAppWeb whatsAppWeb) {
        this.whatsAppWeb = whatsAppWeb;
        this.messenger = whatsAppWeb;
    }

    public void platform(TelegramDesk telegramDesk) {
        System.out.println("The " + Platform.TELEGRAM.name() + " works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
                + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone());
        System.out.println("Created by company "  + Platform.TELEGRAM.getMaker());
        System.out.println("Downloaded from " + Platform.TELEGRAM.getUrl());
    }
    public void platform(TelegramWeb telegramWeb) {
        System.out.println("The " + Platform.TELEGRAM.name() + " works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
                + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone());
        System.out.println("Created by company "  + Platform.TELEGRAM.getMaker());
        System.out.println("Downloaded from " + Platform.TELEGRAM.getUrl());
    }

    public void platform(ViberDesktop viberDesktop) {
        System.out.println("The " + Platform.VIBER.name() + " works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
                + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWindowsPhone());
        System.out.println("Created by company "  + Platform.VIBER.getMaker());
        System.out.println("Downloaded from " + Platform.VIBER.getUrl());
    }

    public void platform(WhatsAppWeb whatsAppWeb) {
        System.out.println("The " + Platform.WHATSAPP.name() + " works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
                + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone());
        System.out.println("Created by company "  + Platform.WHATSAPP.getMaker());
        System.out.println("Downloaded from " + Platform.WHATSAPP.getUrl());}

    public void channel() {
        if (specialChat == null) {
            System.out.println("Your messenger does not allow to create channels");
        } else {
            specialChat.createChannel();
        }
    }
    public void privateChat() {
        if (specialChat == null) {
            System.out.println("Your messenger does not allow using of private chats");
        } else {
            specialChat.privateChat();
        }
    }
    public void videoCalling() {
        if (videoCall == null) {
            System.out.println("Your messenger does not support videocalls");
        }
        else {
            videoCall.videoCall();}
    }

    public void outCall() {
        if (viberOut == null) {
            System.out.println("Your messenger does not support calls outside");
        }
        else {
            viberOut.callViberOut();}
    }


    public void chatWithYourself() {
        if (chatSelfWebDesk == null) {
            System.out.println("Your messenger does not support chatting with yourself");
        }
        else {
            chatSelfWebDesk.chatWithYourself();}
    }

    public void audioCall() {
        if (specialChat == null){
            System.out.println("Your messenger does not allow you to call");
        }
        else {
        specialChat.audioCall();}
    }

    public void sendTextMessage() {
        messenger.sendTextMessage();
    }

    public void groupChat() {
        messenger.groupChat();
    }

    public void messageSearch() {
        messenger.messageSearch();
    }

    public void messageShare() {
        messenger.messageShare();
    }

    public void notifications() {
        messenger.notifications();
    }

    public void profileSetting() {
        messenger.profileSetting();
    }

    public void sendFile() {
        messenger.sendFile();
    }

    public void sendPicture() {
        messenger.sendPicture();
    }

    public void sendSticker() {
        messenger.sendSticker();
    }

    public void sendVideo() {
        messenger.sendVideo();
    }

    public void messageReceive(){
        messenger.messageReceive();
    }
}

//    public static void platform(Platform platform){
//        switch (platform){
//            case TELEGRAM:
//            System.out.println("This messenger works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
//                    + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone());
//            System.out.println("Created by company "  + Platform.TELEGRAM.getMaker());
//            case VIBER:
//                System.out.println("This messenger works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
//                        + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWeb() + ", " + Platform.VIBER.getWindowsPhone());
//                System.out.println("Created by company "  + Platform.VIBER.getMaker());
//            case WHATSAPP:
//                System.out.println("This messenger works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
//                        + ", " + Platform.WHATSAPP.getDesktop() + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone());
//                System.out.println("Created by company "  + Platform.WHATSAPP.getMaker());}
//        }
