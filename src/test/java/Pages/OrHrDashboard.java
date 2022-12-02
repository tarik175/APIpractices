package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrHrDashboard {
    @FindBy(className = "oxd-icon-button oxd-main-menu-button")
    protected WebElement leftMenuArrowButton;

    // MENU BUTTONS \\

    @FindBy(className = "oxd-input oxd-input--active")
    protected WebElement search;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
    protected WebElement adminBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")
    protected WebElement pimBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]")
    protected WebElement leaveBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[4]")
    protected WebElement timeBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")
    protected WebElement recruitmentBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")
    protected WebElement myInfoBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")
    protected WebElement performanceBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[9]")
    protected WebElement directoryBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[10]")
    protected WebElement maintenanceBtn;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[11]")
    protected WebElement buzzBtn;






}
