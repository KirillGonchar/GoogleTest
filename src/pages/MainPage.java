package pages;

import elements.Button;
import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

/**
 * Created by User on 10.11.2015.
 */
public class MainPage {
    private Button signInButton = new Button(By.id("gb_70"));

    public LoginPage clickLogIn(){
        signInButton.click();
        return new LoginPage();
    }

    public MainPage login(){
        clickLogIn().
                enterLogin("sergiitst4").
                pressNext().
                enterPassword().
                checkRememberMe().
                clickSignIn();
        return this;
    }

    public InboxPage getInboxPage(){
        getDriver().get("https://mail.google.com/");
        return new InboxPage();
    }

    public boolean isPresent() {
        return getDriver().getTitle().contains("Google");
    }
}
