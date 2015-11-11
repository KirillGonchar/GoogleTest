package elements;

import org.openqa.selenium.By;

/**
 * Created by User on 10.11.2015.
 */
public class Checkbox extends Element {

    public Checkbox(By by) {
        super(by);
    }

    public void check(){
        if(!composeWebElement().isSelected()){
          composeWebElement().click();
        }else{
            return;
        }
    }
}
