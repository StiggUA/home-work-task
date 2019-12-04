package com.hillel.Lecture_11;

import com.hillel.Lecture_11.AbstractClasses.ForTelegramMob;
import com.hillel.Lecture_11.AbstractClasses.ForViberMob;
import com.hillel.Lecture_11.AbstractClasses.ForWhatsAppMob;
import com.hillel.Lecture_11.Interfaces.*;

public class MyPhone {
    private String phone;
    private Messenger messanger;
    private ForTelegramMob telegram;
    private ForViberMob viber;
    private ForWhatsAppMob whatsApp;
    private SpecChat specialChat;
    private StatusWhatsAppMob status;
    private VideoCall videoCall;
    private ViberOut viberOut;
    private ChatWithYourself chatWithYourself;
    private MobileVersion mobileVersion;
    private TelegramWeb telegramWeb;
    private TelegramDesk telegramDesk;
    private ViberDesktop viberDesktop;
    private WhatsAppWeb whatsAppWeb;

    public MyPhone(String phone, ForTelegramMob telegram) {
        this.phone = phone;
        this.messanger = telegram;
        this.telegram = telegram;
        this.chatWithYourself = telegram;
        this.specialChat = telegram;
        this.mobileVersion = telegram;
    }

    public MyPhone(String phone, ForViberMob viber) {
        this.phone = phone;
        this.viber = viber;
        this.messanger = viber;
        this.viberOut = viber;
        this.videoCall = viber;
        this.specialChat = viber;
        this.mobileVersion = viber;
    }

    public MyPhone(String phone, ForWhatsAppMob whatsApp) {
        this.phone = phone;
        this.messanger = whatsApp;
        this.videoCall = whatsApp;
        this.status = whatsApp;
        this.whatsApp = whatsApp;
        this.mobileVersion = whatsApp;
    }


    public String platform(Telegram telegram) {
        System.out.println("The " + Platform.TELEGRAM.name() + " works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
                + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone());
        System.out.println("Created by company "  + Platform.TELEGRAM.getMaker());
        System.out.println("Download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices");
        return "The " + Platform.TELEGRAM.name() + " works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
                + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone() +
                ", created by company "  + Platform.TELEGRAM.getMaker() + " download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices";
    }

    public String platform(Viber viber) {
        System.out.println("The " + Platform.VIBER.name() + " works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
                + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWindowsPhone());
        System.out.println("Created by company "  + Platform.VIBER.getMaker());
        System.out.println("Download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices");
        return "The " + Platform.VIBER.name() + " works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
                + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWindowsPhone() + " , created by company "  + Platform.VIBER.getMaker() +
                " downloaded from " + Platform.VIBER.getUrl() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices";
    }

    public String platform(WhatsApp whats) {
        System.out.println("The " + Platform.WHATSAPP.name() + " works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
                + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone());
        System.out.println("Created by company "  + Platform.WHATSAPP.getMaker());
        System.out.println("Download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices");
        return "The " + Platform.WHATSAPP.name() + " works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
                + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone() +
                " , created by company "  + Platform.WHATSAPP.getMaker() + " download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices";
    }

    public void channel() {
        try{
            specialChat.createChannel();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println(e.getStackTrace());
            System.err.println("Your messenger does not allow to create channels");
        }
//        if (specialChat == null) {
//            System.out.println("Your messenger does not allow to create channels");
//        } else {
//            System.out.println("My " + phone + " + my messenger can:");
//            specialChat.createChannel();
//        }
    }
    public void privateChat() {
        try{
            specialChat.privateChat();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
            System.err.println("Your messenger does not allow using of private chats");
        }
//        if (specialChat == null) {
//            System.out.println("Your messenger does not allow using of private chats");
//        } else {
//            System.out.println("My " + phone + " + my messenger can:");
//            specialChat.privateChat();
//        }
    }

    public void contactImp() {
        System.out.println("My " + phone + " + my messenger can:");
        mobileVersion.contactImport();
    }

    public void videoCalling() {
        try{
            videoCall.videoCall();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println("Your messenger does not support video calls");
        }
//        if (videoCall == null) {
//            System.out.println("Your messenger does not support videocalls");
//        }
//        else {System.out.println("My " + phone + " + my messenger can:");
//        videoCall.videoCall();}
    }

    public String outCall() {
        try{
            viberOut.callViberOut();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println(e.getClass());
            System.err.println(e.getStackTrace());
            System.err.println("Your messenger does not support calls outside");
        }
        if (viberOut == null) {
            System.out.println("Your messenger does not support calls outside");
            return "Your messenger does not support calls outside";
        }
        else {System.out.println("My " + phone + " + my messenger can:");
        viberOut.callViberOut();
        return "My " + phone + " + my messenger can:";}
    }

    public String status() {
        try {
            whatsApp.myStatus();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println("Your messenger does not support status setup");
        }
        if (messanger == whatsApp) {
            System.out.println("My " + phone + " + my messenger can:");
            whatsApp.myStatus();
            return "My " + phone + " + my messenger can:";
        } else {
            return "Your messenger does not support status setup";
        }

    }

    public String builtBrowser() {
        try {
            return chatWithYourself.builtInBrowser();

        } catch (Exception ex) {
            System.err.println(ex.getCause());
            System.err.println("Your messenger does not support opening links in messanger");
            return "Your messenger does not support opening links in messanger";
        }
//        if (chatWithYourself == null) {
//            System.out.println("Your messenger does not support opening links in messanger");
//        }
//        else
//        {System.out.println("My " + phone + " + my messenger can:");
//        chatWithYourself.builtInBrowser();}
    }

    public void chatWithYourself() {
        try {
            chatWithYourself.chatWithYourself();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println("Your messenger does not support chatting with yourself");
        }
//        if (chatWithYourself == null) {
//            System.out.println("Your messenger does not support chatting with yourself");
//        }
//        else {System.out.println("My " + phone + " + my messenger can:");
//        chatWithYourself.chatWithYourself();}
    }

    public String addPeopleNearby() {
        try{
            return chatWithYourself.addPeopleNearby();
        }
        catch (Exception e){
            System.err.println(e.getCause());
            System.err.println("Your messenger does not support searching contacts nearby");
            return "Your messenger does not support searching contacts nearby";
        }
        finally {
            System.out.println("That's all functionality of your messenger");
        }
//        if (chatWithYourself == null) {
//            System.out.println("Your messenger does not support searching contacts nearby");
//        }
//        else
//        {System.out.println("My " + phone + " + my messenger can:");
//        chatWithYourself.addPeopleNearby();}
        }

    public void audioCall() {
        System.out.println("Looking at my " + phone);
        mobileVersion.audioCall();
    }

    public void sendTextMessage() {
        System.out.println("Message sent from my " + phone);
        messanger.sendTextMessage();
    }

    public void groupChat() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.groupChat();
    }

    public void messageSearch() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.messageSearch();
    }

    public void messageShare() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.messageShare();
    }

    public void notifications() {
        System.out.println("My " + phone + " gets some notification");
        messanger.notifications();
    }

    public void profileSetting() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.profileSetting();
    }

    public void sendFile() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.sendFile();
    }

    public void sendPicture() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.sendPicture();
    }

    public void sendSticker() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.sendSticker();
    }

    public void sendVideo() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.sendVideo();
    }

    public void takePhoto() {
        System.out.println("My " + phone + " + my messenger can:");
        mobileVersion.takePhoto();
    }

    public void takeVideo() {
        System.out.println("My " + phone + " + my messenger can:");
        mobileVersion.takeVideo();
    }
    public void messageReceive(){
        messanger.messageReceive();
    }
}