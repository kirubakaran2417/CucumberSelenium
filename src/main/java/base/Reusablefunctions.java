package base;

import org.openqa.selenium.WebElement;

public class Reusablefunctions {



    public static void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void click(WebElement element) {
        element.click();
    }
}
