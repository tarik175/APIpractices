package testcaseler;

import Pages.OrHrDashboardVeMenuUser;
import Pages.OrHrLogin;
import Pages.OrHrTime;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class OrHrTest {

    WebDriver driver;
    WebDriverWait waitexp;
    OrHrLogin loginpage=new OrHrLogin();
    OrHrDashboardVeMenuUser dashboard=new OrHrDashboardVeMenuUser();

    OrHrTime punch=new OrHrTime();




    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        waitexp= new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

    }






    @Given("user logged in")
    public void user_logged_in() throws InterruptedException {
        loginpage.orHrlogin();
        Thread.sleep(2000);


    }
    @When("user is in dashboard and clicks clock icon")
    public void user_is_in_dashboard_and_clicks_clock_icon() throws InterruptedException {
        dashboard.timeAtWorkClockBtn.click();
        Thread.sleep(2000);
    }
    @And("user fills in the info and presses punch in")
    public void user_fills_in_the_info_and_presses_punch_in() throws InterruptedException {
        punch.punchInBtn.click();
        Thread.sleep(2000);
    }
    @Then("Goes back to dashboard")
    public void goes_back_to_dashboard() {
        dashboard.dashboardBtn.click();
    }
    @And("clicks leave list")
    public void clicks_leave_list() {
        waitexp.until(elementToBeClickable(dashboard.leaveList));
        dashboard.leaveList.click();
    }
    @Then("approve any on the list, go back to dashboard")
    public void approve_on_the_list_go_back_to_dashboard(Integer int1) throws InterruptedException {
        WebElement approve=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[9]/div/button[1]"));
        waitexp.until(elementToBeClickable(approve));
        approve.click();
        Thread.sleep(1000);
        dashboard.dashboardBtn.click();
        Thread.sleep(2000);
    }
    @And("click on assign leave")
    public void click_on_assign_leave() {
        dashboard.assignLeave.click();
    }
    @Then("give yourself a leave")
    public void give_yourself_a_leave() {
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input"));
    }
    @Then("logout")
    public void logout() {
        dashboard.userDropdown.click();
        dashboard.dropDownLogOut.click();
    }



}
