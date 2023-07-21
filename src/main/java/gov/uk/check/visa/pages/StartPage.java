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

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startButton;






    public void acceptAllCookies(){
        try{
        driver.findElement(By.xpath("//button[contains(text(),'Accept additional cookies')]")).click();

    }catch (StaleElementReferenceException e) {
    }

        CustomListeners.test.log(Status.PASS, "Accept All Cookies");
        Reporter.log("Accept all cookies" + acceptAllCookies.toString());
    }

    public void clickOnStartButton() {
        try{
            driver.findElement(By.xpath("//a[normalize-space()='Start now']")).click();

        }catch (StaleElementReferenceException e) {
        }

        CustomListeners.test.log(Status.PASS, "Click on start button");
        Reporter.log("Click on Start button" + startButton.toString());




        // clickOnElement(startButton);
    }


}
