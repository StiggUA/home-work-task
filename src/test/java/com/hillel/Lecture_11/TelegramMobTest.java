package com.hillel.Lecture_11;

import org.testng.annotations.Test;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;
import static junit.framework.Assert.assertEquals;

public class TelegramMobTest {
    @Test
    public void chatWithYourself() {
        Telegram telegram = new Telegram();
        MyPhone myPhone = new MyPhone("iPhone", telegram);
        String result = telegram.chatWithYourself();
        assertEquals(result, "In " + telega + " I can send messages to myself");
    }
    @Test
    public void addPeopleNearby() {
        Telegram telegram = new Telegram();
        MyPhone myPhone = new MyPhone("iPhone", telegram);
        String result = telegram.addPeopleNearby();
        assertEquals(result, "Searching people near you in contacts. Your " + telega);
    }
    @Test
    public void builtInBrowser() {
        Telegram telegram = new Telegram();
        String result = telegram.builtInBrowser();
        assertEquals(result, telega + "opens webpages in builtin browser");
    }
    @Test
    public void messageReceive() {
        Telegram telegram = new Telegram();
        String result = telegram.messageReceive();
        assertEquals(result, "You received incoming text message in " + telega);
    }
    @Test
    public void privateChat() {
        Telegram telegram = new Telegram();
        String result = telegram.privateChat();
        assertEquals(result, "Oh yeeeah... It's a secret messages in " + telega);
    }
    @Test
    public void status() {
        Telegram telegram = new Telegram();
        MyPhone myPhone = new MyPhone("iPhone", telegram);
        String result = myPhone.status();
        assertEquals(result, "Your messenger does not support status setup");
    }
    @Test
    public void viberOut() {
        Telegram telegram = new Telegram();
        MyPhone myPhone = new MyPhone("iPhone", telegram);
        String result = myPhone.outCall();
        assertEquals(result, "Your messenger does not support calls outside");
    }
}
