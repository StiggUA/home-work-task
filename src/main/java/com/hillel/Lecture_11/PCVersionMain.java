package com.hillel.Lecture_11;

public class PCVersionMain {

    public static String main(String[] args) {
        TelegramDesk telegramDesk = new TelegramDesk();
        TelegramWeb telegramWeb = new TelegramWeb();
        ViberDesktop viberDesktop = new ViberDesktop();
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        PcOS pcOS = new PcOS();
        String pc = "";
        MyPC myPC = new MyPC(viberDesktop);
        myPC.platform(viberDesktop);

        try{
            pc = pcOS.pcOS("mac");
            System.out.println(pc + ", Welcome to messenger");
            myPC.audioCall();
            myPC.channel();
            myPC.chatWithYourself();
            myPC.groupChat();
            myPC.messageReceive();
            myPC.messageSearch();
            myPC.messageShare();
            myPC.notifications();
            myPC.privateChat();
            myPC.profileSetting();
            myPC.sendFile();
            myPC.sendPicture();
            myPC.sendSticker();
            myPC.sendTextMessage();
            myPC.sendVideo();
            myPC.videoCalling();
            myPC.outCall();
        }
        catch (MyError error){
            System.err.println("The reason is " + error.getCause() + " error for this pc");
            System.err.println(error.getMessage());
            return error.getMessage();
        }
        finally {
            System.out.println("Have a nice day!");
            return "Have a nice day!";
        }
    }
}


