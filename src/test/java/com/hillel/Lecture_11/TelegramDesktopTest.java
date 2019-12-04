package com.hillel.Lecture_11;

import org.testng.annotations.Test;
import com.hillel.Lecture_11.PcOS;
import com.hillel.Lecture_11.OperSystem;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;
import static junit.framework.Assert.assertEquals;

public class TelegramDesktopTest {
    @Test
    public void sendVideo() {
        TelegramDesk telegramDesk = new TelegramDesk();
        String result = telegramDesk.sendVideo();
        assertEquals(result, "I can't take a video, but I can send video files in my " + telDesk);
    }
    @Test
    public void sendFile() {
        TelegramDesk telegramDesk = new TelegramDesk();
        String result = telegramDesk.sendFile();
        assertEquals(result, "My " + telDesk + " allows me to send any files");
    }
    @Test
    public void sendSticker() {
        TelegramDesk telegramDesk = new TelegramDesk();
        String result = telegramDesk.sendSticker();
        assertEquals(result, "Send stickers via " + telDesk);
    }
    @Test
    public void videoCalling() {
        TelegramDesk telegramDesk = new TelegramDesk();
        MyPC myPC = new MyPC(telegramDesk);
        String result = myPC.videoCalling();
        assertEquals(result, "No video calls in your messenger");
    }
    @Test
    public void outCall() {
        TelegramDesk telegramDesk = new TelegramDesk();
        MyPC myPC = new MyPC(telegramDesk);
        String result = myPC.outCall();
        assertEquals(result, "Your messenger does not support calls outside");
    }
    @Test
    public void eNum() {
        TelegramDesk telegramDesk = new TelegramDesk();
        MyPC myPC = new MyPC(telegramDesk);
        String result = myPC.platform(telegramDesk);
        assertEquals(result, "The " + Platform.TELEGRAM.name() + " works at: " + Platform.TELEGRAM.getAndroid() + ", " + Platform.TELEGRAM.getIos()
                + ", " + Platform.TELEGRAM.getDesktop() + ", " + Platform.TELEGRAM.getWeb() + ", " + Platform.TELEGRAM.getWindowsPhone() +
                ", " + "created by company "  + Platform.TELEGRAM.getMaker() + " downloaded from " + Platform.TELEGRAM.getUrl());
    }
//    @Test
//    public void error(){
//        OperSystem operSystem = new OperSystem();
//        PCVersionMain pcVersionMain = new PCVersionMain();
//        PcOS pcOS = new PcOS();
//        String result = MyError;
//        assertEquals(result, "You can't use this messenger on " + pcOS + ".");
//    }

}
