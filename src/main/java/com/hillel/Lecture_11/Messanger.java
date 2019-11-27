package com.hillel.Lecture_11;

public interface Messanger {
    String sendTextMessage();
    void sendVideo();
    void sendPicture();
    void sendFile();
    void audioCall();
    void sendSticker();
    void takePhoto();
    void takeVideo();
    void groupChat();
    String messageReceive();
    void messageSearch();
    void messageShare();
    void notifications();
    void contactImport();
    void profileSetting();


    String telega = "Telegram";
    String viber = "Viber";
    String whatsapp = "WhatsApp";
}