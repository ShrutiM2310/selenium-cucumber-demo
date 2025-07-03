package stepDefenitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps extends BaseClass {

    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        BaseClass.driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(BaseClass.driver);
    }

    @When("I enter user credentials")
    public void i_enter_user_credentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @Then("I login successfully in the application")
    public void i_login_successfully_in_the_application() {
        loginPage.clickLogin();
    }

}