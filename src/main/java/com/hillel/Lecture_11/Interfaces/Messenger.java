package com.hillel.Lecture_11.Interfaces;

public interface Messenger {
    String sendTextMessage();
    String sendVideo();
    String sendPicture();
    String sendFile();
//    void audioCall();
    String sendSticker();
    void profileSetting();
    void groupChat();
    String messageReceive();
    void messageSearch();
    void messageShare();
    void notifications();
//    void contactImport();
//    void takePhoto();
//    void takeVideo();



    String telega = "Telegram";
    String viber = "Viber";
    String whatsapp = "WhatsApp";
    String telweb = "Telegram Web Version";
    String telDesk = "Telegram Desktop";
    String viberDesk = "Viber Desktop";
    String whatWeb = "WhatsApp Web Wersion";
}