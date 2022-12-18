package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrHrTime {

    //PUNCH IN/OUT
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
    public WebElement punchInBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
    public WebElement punchInBtn2;


}
