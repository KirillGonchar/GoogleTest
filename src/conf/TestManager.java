package conf;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;

/**
 * Created by User on 10.11.2015.
 */
public class TestManager {
    private static WebDriver driver;
    private String baseUrl = "https://www.google.com/";
    protected MainPage mainPage;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        getDriver().get(baseUrl);
        mainPage = new MainPage();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
