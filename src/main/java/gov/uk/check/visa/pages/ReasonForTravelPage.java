package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;






    public void selectReasonForVisit(String string){

        try{
            driver.findElement(By.xpath("//div[@class='gem-c-radio govuk-radios__item']")).click();

        }catch (StaleElementReferenceException e) {
        }
        //clickOnElement(tourism);

        Reporter.log("Select reason  for visit");
        CustomListeners.test.log(Status.PASS, "Select reason  for visit");
    }

    public void clickNextStepButton(){

        Reporter.log("Click on Continue button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue button");
    }

}
