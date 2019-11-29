package com.hillel.Lecture_11.AbstractClasses;

import com.hillel.Lecture_11.Interfaces.Messenger;
import com.hillel.Lecture_11.Interfaces.MobileVersion;
import com.hillel.Lecture_11.Interfaces.StatusWhatsAppMob;
import com.hillel.Lecture_11.Interfaces.VideoCall;

public abstract class ForWhatsAppMob implements Messenger, VideoCall, StatusWhatsAppMob, MobileVersion {
}
