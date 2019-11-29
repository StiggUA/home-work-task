package com.hillel.Lecture_11;

public enum Platform {
    TELEGRAM("Telegram","Desktop", "iOS", "Android", "Windows Phone", "Web", "https://telegram.org/"),
    VIBER("Rakuten","Desktop", "iOS", "Android", "Windows Phone", null, "https://www.viber.com/"),
    WHATSAPP("WhatsApp",null, "iOS", "Android", "Windows Phone", "Web","https://www.whatsapp.com/");

    private String maker;
    private String desktop;
    private String ios;
    private String android;
    private String windowsPhone;
    private String web;
    private String url;

    Platform(String maker, String desktop, String ios, String android, String windowsPhone, String web, String url) {
        this.maker = maker;
        this.desktop = desktop;
        this.ios = ios;
        this.android = android;
        this.windowsPhone = windowsPhone;
        this.web = web;
        this.url = url;
    }
    public String getDesktop() {
        return desktop;
    }
    public String getMaker() {
        return maker;
    }
    public String getIos() {
        return ios;
    }
    public String getAndroid() {
        return android;
    }
    public String getWindowsPhone() {
        return windowsPhone;
    }
    public String getWeb() {
        return web;
    }
    public String getUrl(){return url;}
}
