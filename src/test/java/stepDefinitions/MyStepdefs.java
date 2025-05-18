package stepDefinitions;

import base.Baseclass;
import base.Reusablefunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageFactory.Login;

public class MyStepdefs {

        WebDriver driver;
        // The caret symbol (^) is used to match the start of a string.
        // For example, the regular expression ^user is on home page$ will
        // only match the string "user is on home page" exactly.
        @Given("^user is on login page$")
        public void user_is_on_login_page() {
                        if (driver == null) {
            driver = new Baseclass(driver).openBrowser();
            new Baseclass(driver).openUrl("https://www.saucedemo.com/");
        }

        }

        @When("user enters username {string} and password {string}")
        public void userEntersUsernameAndPassword(String username, String password) {
                Login login = new Login(driver);
                Reusablefunctions.sendKeys(login.username, username);
                Reusablefunctions.sendKeys(login.password, password);
        }

        @And("user clicks on login button")
        public void userClicksOnLoginButton() {
                Login login = new Login(driver);
                Reusablefunctions.click(login.loginButton);
        }



}
