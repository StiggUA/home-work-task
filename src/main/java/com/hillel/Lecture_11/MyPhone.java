package com.hillel.Lecture_11;

public class MyPhone {
    private String phone;
    private Messenger messanger;
    private ForTelegram telegram;
    private ForViber viber;
    private ForWhatsApp whatsApp;
    private SpecChat specialChat;
    private Status status;
    private VideoCall videoCall;
    private ViberOut viberOut;
    private ChatWithYourself chatWithYourself;


    public MyPhone(String phone, ForTelegram telegram) {
        this.phone = phone;
        this.messanger = telegram;
        this.telegram = telegram;
        this.chatWithYourself = telegram;
        this.specialChat = telegram;
    }

    public MyPhone(String phone, ForViber viber) {
        this.phone = phone;
        this.viber = viber;
        this.messanger = viber;
        this.viberOut = viber;
        this.videoCall = viber;
        this.specialChat = viber;
    }

    public MyPhone(String phone, ForWhatsApp whatsApp) {
        this.phone = phone;
        this.messanger = whatsApp;
        this.videoCall = whatsApp;
        this.status = whatsApp;
        this.whatsApp = whatsApp;
    }

    public void channel() {
        if (specialChat == null) {
            System.out.println("Your messenger does not allow to create channels");
        } else {
            System.out.println("My " + phone + " + my messenger can:");
            specialChat.createChannel();
        }
    }
    public void privateChat() {
        if (specialChat == null) {
            System.out.println("Your messenger does not allow using of private chats");
        } else {
            System.out.println("My " + phone + " + my messenger can:");
            specialChat.privateChat();
        }
    }

    public void contactImport() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.contactImport();
    }

    public void videoCalling() {
        if (videoCall == null) {
            System.out.println("Your messenger does not support videocalls");
        }

        else {System.out.println("My " + phone + " + my messenger can:");
        videoCall.videoCall();}
    }

    public void outCall() {
        if (viberOut == null) {
            System.out.println("Your messenger does not support calls outside");
        }
        else {System.out.println("My " + phone + " + my messenger can:");
        viberOut.callViberOut();}
    }

    public void status() {
        if (messanger == whatsApp) {
            System.out.println("My " + phone + " + my messenger can:");
            whatsApp.myStatus();
        } else {
            System.out.println("Your messenger does not support status setup");
        }
    }

    public void builtBrowser() {
        if (chatWithYourself == null) {
            System.out.println("Your messenger does not support opening links in messanger");
        }
        else
        {System.out.println("My " + phone + " + my messenger can:");
        chatWithYourself.builtInBrowser();}
    }

    public void chatWithYourself() {
        if (chatWithYourself == null) {
            System.out.println("Your messenger does not support chatting with yourself");
        }
        else {System.out.println("My " + phone + " + my messenger can:");
        chatWithYourself.chatWithYourself();}
    }

    public void addPeopleNearby() {
        if (chatWithYourself == null) {
            System.out.println("Your messenger does not support searching contacts nearby");
        }
        else
        {System.out.println("My " + phone + " + my messenger can:");
        chatWithYourself.addPeopleNearby();}
    }

    public void audioCall() {
        System.out.println("Looking at my " + phone);
        messanger.audioCall();
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
        messanger.takePhoto();
    }

    public void takeVideo() {
        System.out.println("My " + phone + " + my messenger can:");
        messanger.takeVideo();
    }
}