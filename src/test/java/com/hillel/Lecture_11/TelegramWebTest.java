package com.hillel.Lecture_11;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;

public class TelegramWebTest {
    @Test
    public void sendTextMessage() {
        TelegramWeb telegramWeb = new TelegramWeb();
        String result = telegramWeb.sendTextMessage();
        assertEquals(result, "I can send message from my " + telweb);
    }
    @Test
    public void messageReceive() {
        TelegramWeb telegramWeb = new TelegramWeb();
        String result = telegramWeb.messageReceive();
        assertEquals(result, "All incoming message I can read in " + telweb);
    }
    @Test
    public void sendPicture() {
        TelegramWeb telegramWeb = new TelegramWeb();
        String result = telegramWeb.sendPicture();
        assertEquals(result, "I can't take a picture, but I can send photos from my " + telweb);
    }
    @Test
    public void videoCalling() {
        TelegramWeb telegramWeb = new TelegramWeb();
        MyPC myPC = new MyPC(telegramWeb);
        String result = myPC.videoCalling();
        assertEquals(result, "No video calls in your messenger");
    }
    @Test
    public void outCall() {
        TelegramWeb telegramWeb = new TelegramWeb();
        MyPC myPC = new MyPC(telegramWeb);
        String result = myPC.outCall();
        assertEquals(result, "Your messenger does not support calls outside");
    }
}
