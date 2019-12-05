package com.hillel.Lecture_11;

public class MessengerMain {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        Viber viber = new Viber();
        WhatsApp whatsApp = new WhatsApp();
        OperSystem phoneModels = new OperSystem();
        String phones = "";
        MyPhone myPhone = new MyPhone("Nokia", viber);
        myPhone.platform(viber);
        try {
            phones = phoneModels.operSystem("io");
            System.out.println(phones + ", Welcome to messenger");
            myPhone.channel();
            myPhone.contactImp();
            myPhone.videoCalling();
            myPhone.status();
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
            myPhone.messageReceive();
            myPhone.addPeopleNearby();
            myPhone.status();
        } catch (IncorrectOs error) {
            error.getCause();
            System.err.println(error.getMessage());
            System.err.println("Buy another phone. Good bye!");
        } finally {
            System.out.println("Hasta la vista, baby");
        }
        }
}
