package com.hillel.Lecture_11;

public class PCVersionMain {

    private static Object MyPC;
    private static Object TelegramDesk;
    private static Object TelegramWeb;
    private static Object ViberDesktop;

    public static void main(String[] args) {
        TelegramDesk telegramDesk = new TelegramDesk();
        TelegramWeb telegramWeb = new TelegramWeb();
        ViberDesktop viberDesktop = new ViberDesktop();
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        MyPC myPC = new MyPC(whatsAppWeb);
        myPC.platform(whatsAppWeb);

        myPC.audioCall();
        myPC.channel();
        myPC.chatWithYourself();
        myPC.groupChat();
        myPC.messageReceive();
        myPC.messageSearch();
        myPC.messageShare();
        myPC.notifications();
        myPC.outCall();
        myPC.privateChat();
        myPC.profileSetting();
        myPC.sendFile();
        myPC.sendPicture();
        myPC.sendSticker();
        myPC.sendTextMessage();
        myPC.sendVideo();
        myPC.videoCalling();
    }
}


