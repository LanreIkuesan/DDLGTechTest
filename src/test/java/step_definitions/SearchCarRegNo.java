package step_definitions;

import Base.TestBase;
import Pages.HomeScreenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class SearchCarRegNo extends TestBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the Home Screen$")
    public void i_am_on_the_Home_Screen() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("^I enter Car Registration Number$")
    public void i_enter_Car_Registration_Number() throws Throwable {
        HomeScreenPage page = PageFactory.initElements(driver, HomeScreenPage.class);
        page.TypeRegNo();

    }

    @When("^I click on Find Car$")
    public void i_click_on_Find_Car() throws Throwable {
        HomeScreenPage page = PageFactory.initElements(driver, HomeScreenPage.class);
        page.ClickFindVehicle();
        Thread.sleep(3000);

    }

    @Then("^I should get Car information$")
    public void i_should_get_Car_information() throws Throwable {
        String ExpectedMessage1 ="Result for : OV12UYY";
        String Actualmessage = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[1]")).getText();
        Assert.assertEquals(ExpectedMessage1, Actualmessage);
        System.out.print(Actualmessage);

        String ExpectedCoverStartDate ="09 FEB 2022 : 18 : 26";
        String ActualCoverStartDate = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[2]/span")).getText();
        Assert.assertEquals(ExpectedCoverStartDate, ActualCoverStartDate);
        System.out.print(ActualCoverStartDate);

        String ExpectedCoverEndDate ="19 FEB 2022 : 01 : 59";
        String ActualCovenEndDate = driver.findElement(By.xpath("//*[@id=\"page-container\"]/div[4]/div[3]/span")).getText();
        Assert.assertEquals(ExpectedCoverEndDate, ActualCovenEndDate);
        System.out.print(ActualCovenEndDate);

    }
}
