package com.hillel.Lecture_11;

import org.testng.annotations.Test;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;
import static junit.framework.Assert.assertEquals;

public class ViberDeskTest {
    @Test
    public void callViberOut() {
        ViberDesktop viberDesktop = new ViberDesktop();
        String result = viberDesktop.callViberOut();
        assertEquals(result, viberDesk + " allows me to call on any number");
    }
    @Test
    public void privateChat() {
        ViberDesktop viberDesktop = new ViberDesktop();
        String result = viberDesktop.privateChat();
        assertEquals(result, "Oh yeeeah... It's a secret messages in " + viberDesk);
    }
    @Test
    public void chatWithYourself() {
        ViberDesktop viberDesktop = new ViberDesktop();
        MyPC myPC = new MyPC(viberDesktop);
        String result = myPC.chatWithYourself();
        assertEquals(result, "Your messenger does not support chatting with yourself");
    }
    @Test
    public void groupChat() {
        ViberDesktop viberDesktop = new ViberDesktop();
        String result = viberDesktop.groupChat();
        assertEquals(result, "Sending a message to a few people in " + viberDesk);
    }
    @Test
    public void eNUm() {
        ViberDesktop viberDesktop = new ViberDesktop();
        MyPC myPC = new MyPC(viberDesktop);
        String result = myPC.platform(viberDesktop);
        assertEquals(result, "The " + Platform.VIBER.name() + " works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
                + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWindowsPhone() + " , created by company "  + Platform.VIBER.getMaker() +
                " downloaded from " + Platform.VIBER.getUrl());
    }
}
