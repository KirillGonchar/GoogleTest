package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextInput;
import org.openqa.selenium.By;


/**
 * Created by User on 10.11.2015.
 */
public class PasswordPage {
    private TextInput passwordInput = new TextInput(By.id("Passwd"));

    private Button signInButton = new Button(By.id("signIn"));

    private Checkbox rememberMeCheckbox = new Checkbox(By.id("PersistentCookie"));

    public PasswordPage enterPassword(){
        passwordInput.waitForElement();
        passwordInput.type("Password_989");
        return this;
    }

    public PasswordPage checkRememberMe(){
        rememberMeCheckbox.check();
        return this;
    }

    public MainPage clickSignIn(){
        signInButton.click();
        return new MainPage();
    }
}
