package base;

import configReader.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

    WebDriver driver;

    public Baseclass(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver openBrowser() {
        String browser = new ConfigReader().getPropertyValue("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser not supported");
        }
        return driver;
    }
    //open the url
    public void openUrl(String url) {
        driver.get(url);
    }


}
