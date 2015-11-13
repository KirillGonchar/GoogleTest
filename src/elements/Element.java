package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static conf.TestManager.getDriver;
import static conf.TestManager.waitInSeconds;

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

    public boolean isPresent() {
        try{
            composeWebElement();
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

    public void waitForElement(){
        for(int i=0; i<20; i++){
            if(isPresent()){
                break;
            }else{
                waitInSeconds(1);
            }
        }
    }
}
