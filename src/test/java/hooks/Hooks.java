package hooks;

import base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @After("@valid")
    public void afterAll() {
        //initialize browser
        Baseclass baseclass = new Baseclass(driver);
        baseclass.quitBrowser();
    }
    @Before("@valid")
    public void beforeAll() {
        Baseclass baseclass = new Baseclass(driver);
        driver = baseclass.openBrowser();
        baseclass.openUrl("https://www.saucedemo.com/");

    }
}
