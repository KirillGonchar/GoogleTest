package pages;

import data.EmailData;
import elements.Button;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;

import java.util.List;

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
        EmailData emailData = new EmailData(address);
        receiverInput.type(emailData.getReceiversInString());
        subjectInput.type(emailData.getSubject());
        bodyInput.type(emailData.getBody());
        sendButton.click();
        waitInSeconds(5);
        getDriver().navigate().refresh();
        return this;
    }

    public boolean isEmailPresent(String... s) {
        email.waitForElement();
        return email.isPresent();
    }
}
