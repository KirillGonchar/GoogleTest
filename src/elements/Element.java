package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static conf.TestManager.getDriver;

/**
 * Created by User on 10.11.2015.
 */
public abstract class Element {
    protected By by;

    public Element(By by){
        this.by = by;
    }

    protected WebElement composeWebElement(){
       return getDriver().findElement(by);
    }
}
