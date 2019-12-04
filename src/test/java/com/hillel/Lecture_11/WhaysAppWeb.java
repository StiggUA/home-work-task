package com.hillel.Lecture_11;

import org.testng.annotations.Test;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;
import static junit.framework.Assert.assertEquals;

public class WhaysAppWeb {
    @Test
    public void groupChat() {
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        String result = whatsAppWeb.groupChat();
        assertEquals(result, "Sending a message to a few people in " + whatWeb);
    }
    @Test
    public void messageSearch() {
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        String result = whatsAppWeb.messageSearch();
        assertEquals(result, "Searching your chat in " + whatWeb);
    }
    @Test
    public void outCall() {
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        MyPC myPC = new MyPC(whatsAppWeb);
        String result = myPC.outCall();
        assertEquals(result, "Your messenger does not support calls outside");
    }
    @Test
    public void chatWithYourself() {
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        MyPC myPC = new MyPC(whatsAppWeb);
        String result = myPC.chatWithYourself();
        assertEquals(result, "Your messenger does not support chatting with yourself");
    }
    @Test
    public void eNum() {
        WhatsAppWeb whatsAppWeb = new WhatsAppWeb();
        MyPC myPC = new MyPC(whatsAppWeb);
        String result = myPC.platform(whatsAppWeb);
        assertEquals(result, "The " + Platform.WHATSAPP.name() + " works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
                + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone() +
                " , created by company "  + Platform.WHATSAPP.getMaker() + " download from " + Platform.WHATSAPP.getUrl());
    }
}
