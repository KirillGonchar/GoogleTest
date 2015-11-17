package tests;

import conf.TestManager;
import org.junit.Test;
import pages.InboxPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 13.11.2015.
 */
public class Email extends TestManager {

    @Test
    public void firstEmail(){
        InboxPage inbox = mainPage.login().getInboxPage();
        inbox.sendEmail("sergiitst4@gmail.com");
        assertTrue(inbox.isEmailPresent("sergiitst4@gmail.com"));
    }
}
