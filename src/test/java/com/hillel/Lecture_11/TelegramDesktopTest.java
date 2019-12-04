package com.hillel.Lecture_11;

import org.testng.annotations.Test;

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
}
