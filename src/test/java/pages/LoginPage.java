package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="user-name")
    WebElement username_input;

    @FindBy(name="password")
    WebElement password_input;

    @FindBy(id="login-button")
    WebElement login_button;

    public void enterUsername(String username){
        username_input.sendKeys(username);
    }

    public void enterPassword(String password){
        password_input.sendKeys(password);
    }

    public void clickLogin(){
        login_button.click();
    }

}
