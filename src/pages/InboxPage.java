package pages;

import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;

import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;

/**
 * Created by User on 13.11.2015.
 */
public class InboxPage {

    private Button composeButton = new Button(By.className("T-I-KE"));
    private Button sendButton = new Button(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"));
    private Button email = new Button(By.xpath("//span[@email='sergiitst4@gmail.com']"));

    private TextInput receiverInput = new TextInput(By.xpath("//textarea[@aria-label='Кому']"));
    private TextInput subjectInput = new TextInput(By.className("aoT"));
    private TextInput bodyInput = new TextInput(By.xpath("//div[@aria-label='Текст повідомлення']"));

    public InboxPage sendEmail(String address) {
        composeButton.waitForElement();
        composeButton.click();
        sendButton.waitForElement();
        receiverInput.type(address);
        subjectInput.type("Subject");
        bodyInput.type("Body");
        sendButton.click();
        waitInSeconds(5);
        getDriver().navigate().refresh();
//        getDriver().switchTo().activeElement().submit();
//        getDriver().switchTo().defaultContent();
        return this;
    }

    public boolean isEmailPresent(String s) {
        email.waitForElement();
        return email.isPresent();
    }
}
