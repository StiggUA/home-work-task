package com.hillel.Lecture_11;
import com.hillel.Lecture_11.Interfaces.Messenger;
import org.testng.annotations.Test;
import static com.hillel.Lecture_11.Interfaces.Messenger.*;
import static junit.framework.Assert.assertEquals;

public class ViberMobTest {
    @Test
    public void messageReceive() {
        Viber viber = new Viber();
        String result = viber.messageReceive();
        assertEquals(result, "You received incoming text message in " + Messenger.viber);
    }

    @Test
    public void callViberOut() {
        Viber viber = new Viber();
        String result = viber.callViberOut();
        assertEquals(result, "Yes, " + Messenger.viber + " able to call on mobile numbers");
    }

    @Test
    public void videoCall() {
        Viber viber = new Viber();
        String result = viber.videoCall();
        assertEquals(result, Messenger.viber + " can make a videocall");
    }

    @Test
    public void status() {
        Viber viber = new Viber();
        MyPhone myPhone = new MyPhone("iPhone", viber);
        String result = myPhone.status();
        assertEquals(result, "Your messenger does not support status setup");
    }
    @Test
    public void builtInBrowser() {
        Viber viber = new Viber();
        MyPhone myPhone = new MyPhone("iPhone", viber);
        String result = myPhone.builtBrowser();
        assertEquals(result, "Your messenger does not support opening links in messanger");
    }
    @Test
    public void eNum() {
        Viber viber = new Viber();
        MyPhone myPhone = new MyPhone("iPhone", viber);
        String result = myPhone.platform(viber);
        assertEquals(result, "The " + Platform.VIBER.name() + " works at: " + Platform.VIBER.getAndroid() + ", " + Platform.VIBER.getIos()
                + ", " + Platform.VIBER.getDesktop() + ", " + Platform.VIBER.getWindowsPhone() + " , created by company "  + Platform.VIBER.getMaker() +
                " downloaded from " + Platform.VIBER.getUrl() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices");
    }
}
