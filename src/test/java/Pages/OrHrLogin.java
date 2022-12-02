package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrHrLogin {

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(className = "oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    public WebElement forgotPass;


    public void orHrlogin(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();


    }




}
