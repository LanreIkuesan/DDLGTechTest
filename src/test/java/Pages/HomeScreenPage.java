package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeScreenPage {
    @FindBy(how= How.ID, using = "vehicleReg")
    public static WebElement VehicleRegNo;

    @FindBy(how= How.NAME, using = "btnfind")
    public static WebElement FindCarButton;

    @FindBy(how= How.CLASS_NAME, using = ".result")
    public static WebElement Result;

    @FindBy(how= How.CLASS_NAME, using = ".resultDate")
    public static WebElement CoverStartDate;

    @FindBy(how= How.CLASS_NAME, using = ".resultDate")
    public static WebElement CoverEndDate;


    public void TypeRegNo(){VehicleRegNo.sendKeys("OV12UYY");}
    public void ClickFindVehicle(){FindCarButton.click();}
    public void VerifyResult(){Result.getText();}
    public void VerifyCoverStartDate(){CoverStartDate.getText();}
    public void VerifyCoverEndDate(){CoverEndDate.getText();}

}
