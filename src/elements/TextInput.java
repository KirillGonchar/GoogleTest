package elements;

import org.openqa.selenium.By;

/**
 * Created by User on 10.11.2015.
 */
public class TextInput extends Element {

    public TextInput(By by) {
        super(by);
    }

    public void type(String input){
        composeWebElement().clear();
        composeWebElement().sendKeys(input);
    }
}
