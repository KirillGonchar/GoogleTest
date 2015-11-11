package elements;

import org.openqa.selenium.By;


/**
 * Created by User on 10.11.2015.
 */
public class Button extends Element{

    public Button(By by){
        super(by);
    }

    public void click(){
        composeWebElement().click();
    }


}
