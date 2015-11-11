package tests;

import conf.TestManager;
import org.junit.*;

import static org.junit.Assert.assertTrue;

public class Login extends TestManager{

    @Test
    public void login(){
        mainPage.clickLogIn().
                enterLogin("sergiitst4").
                pressNext().
                enterPassword().
                checkRememberMe().
                clickSignIn();
        assertTrue("Incorrect page is displayed", mainPage.isPresent());
    }
}
