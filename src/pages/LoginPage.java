package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;

import static conf.TestManager.getDriver;

/**
 * Created by User on 10.11.2015.
 */
public class LoginPage {
    private Button nextButton = new Button(By.id("next"));

    private TextInput loginInput = new TextInput(By.id("Email"));

    public LoginPage enterLogin(String login){
        loginInput.type(login);
        return this;
    }

    public PasswordPage pressNext(){
        nextButton.click();
        return new PasswordPage();
    }
}
