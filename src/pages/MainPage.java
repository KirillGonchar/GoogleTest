package pages;

import elements.Button;
import org.openqa.selenium.By;

import static conf.TestManager.getDriver;
import static conf.TestManager.getUsername;
import static conf.TestManager.waitInSeconds;

/**
 * Created by User on 10.11.2015.
 */
public class MainPage {
    private Button signInButton = new Button(By.id("gb_70"));
    private Button addOnsButton = new Button(By.id("gbwa"));
    private Button confirmation = new Button(By.xpath("//a[@title='No thanks']"));
    private Button gmailButton = new Button(By.xpath("//span[text()='Gmail']"));

    public LoginPage clickLogIn(){
        signInButton.click();
        return new LoginPage();
    }

    public MainPage login(){
        clickLogIn().
                enterLogin(getUsername()).
                pressNext().
                enterPassword().
                checkRememberMe().
                clickSignIn();
        return this;
    }

    public InboxPage getInboxPage(){
        waitInSeconds(1);
        if(confirmation.isPresent()){
            confirmation.click();
        }
        addOnsButton.click();
        gmailButton.waitForElement();
        gmailButton.click();
        return new InboxPage();
    }

    public boolean isPresent() {
        return getDriver().getTitle().contains("Google");
    }
}
