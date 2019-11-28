package com.hillel.Lecture_11;

public class MessengerMain {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        WhatsApp whatsApp = new WhatsApp();
        MyPhone myPhone = new MyPhone("Nokia", whatsApp);

        myPhone.channel();
        myPhone.contactImport();
        myPhone.videoCalling();
        myPhone.status();
        myPhone.addPeopleNearby();
        myPhone.audioCall();
        myPhone.builtBrowser();
        myPhone.chatWithYourself();
        myPhone.groupChat();
        myPhone.messageSearch();
        myPhone.messageShare();
        myPhone.notifications();
        myPhone.outCall();
        myPhone.privateChat();
        myPhone.profileSetting();
        myPhone.sendFile();
        myPhone.sendPicture();
        myPhone.sendSticker();
        myPhone.sendTextMessage();
        myPhone.sendVideo();
        myPhone.takePhoto();
        myPhone.takeVideo();
    }

}
