package com.hillel.Lecture_11;
import com.hillel.Lecture_11.Interfaces.Messenger;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class WhatsAppMobTest {
    @Test
    public void messageReceive() {
        WhatsApp whatsApp = new WhatsApp();
        String result = whatsApp.contactImport();
        assertEquals(result, "All contacts in your messenger. " + Messenger.whatsapp);
    }
    @Test
    public void profileSetting() {
        WhatsApp whatsApp = new WhatsApp();
        String result = whatsApp.profileSetting();
        assertEquals(result, "Set up profile in " + Messenger.whatsapp);
    }
    @Test
    public void addPeopleNearby() {
        WhatsApp whatsApp = new WhatsApp();
        MyPhone myPhone = new MyPhone("iPhone", whatsApp);
        String result = myPhone.addPeopleNearby();
        assertEquals(result, "Your messenger does not support searching contacts nearby");
    }
    @Test
    public void builtInBrowser() {
        WhatsApp whatsApp = new WhatsApp();
        MyPhone myPhone = new MyPhone("iPhone", whatsApp);
        String result = myPhone.builtBrowser();
        assertEquals(result, "Your messenger does not support opening links in messanger");
    }
    @Test
    public void eNum() {
        WhatsApp whatsApp = new WhatsApp();
        MyPhone myPhone = new MyPhone("iPhone", whatsApp);
        String result = myPhone.platform(whatsApp);
        assertEquals(result, "The " + Platform.WHATSAPP.name() + " works at: " + Platform.WHATSAPP.getAndroid() + ", " + Platform.WHATSAPP.getIos()
                + ", " + Platform.WHATSAPP.getWeb() + ", " + Platform.WHATSAPP.getWindowsPhone() +
                " , created by company "  + Platform.WHATSAPP.getMaker() + " download from " + App.ANDROID.getsource() + " for Android" +
                " or from " + App.IOS.getsource() + " for iOS devices");
    }
}
