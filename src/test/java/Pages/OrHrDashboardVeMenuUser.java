package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrHrDashboardVeMenuUser {
    @FindBy(className = "oxd-icon-button oxd-main-menu-button")
     WebElement leftMenuArrowButton;

    // MENU BUTTONS \\ //Bu menu butun sayfalarda kullanilabiliyor

        @FindBy(className = "oxd-input oxd-input--active")
         public WebElement search;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
        public WebElement adminBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")
        public WebElement pimBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]")
        public WebElement leaveBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[4]")
        public WebElement timeBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[5]")
        public WebElement recruitmentBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]")
        public WebElement myInfoBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[7]")
        public WebElement performanceBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]")
        public WebElement dashboardBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[9]")
        public WebElement directoryBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[10]")
        public WebElement maintenanceBtn;

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[11]")
        public WebElement buzzBtn;

    //SOL MENU ELEMENTLERI SONU

    //DASHBOARD ELEMENTLERI

        //time at work
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button")
            public WebElement timeAtWorkClockBtn;

        //My Actions
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/button")
            public WebElement leaveReqs;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/button")
            public WebElement timesheetApp;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/button")
            public WebElement pendingRev;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[4]/button")
            public WebElement candidateInterview;

        //Quick Launch
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/button")
            public WebElement assignLeave;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[2]/button")
            public WebElement leaveList;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[3]/button")
            public WebElement timeSheets;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[4]/button")
            public WebElement appyLeave;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[5]/button")
            public WebElement myLeave;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[6]/button")
            public WebElement myTimesheet;

        //Employees on leave butonu
            @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[4]/div/div[1]/i")
            public WebElement empSetting;


    ///KULLANICI

        @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li")
        public WebElement userDropdown;

            //Dropdown
            @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")
            public WebElement dropDownAbout;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[2]/a")
            public WebElement dropDownSupport;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")
            public WebElement dropDownChangePass;

            @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
            public WebElement dropDownLogOut;


}
