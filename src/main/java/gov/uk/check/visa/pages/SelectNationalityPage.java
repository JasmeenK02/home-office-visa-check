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

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(tagName = "select")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectNationality(String nationality){
        try{
            driver.findElement(By.tagName("select")).click();

        }catch (StaleElementReferenceException e) {
        }

        Reporter.log("Select nationality from dropdown list" + nationalityDropDownList.toString());
        CustomListeners.test.log(Status.PASS, "Select Nationality from DropDownList");



       // selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }
    public void clickNextStepButton(){
        try{
            driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

        }catch (StaleElementReferenceException e) {
        }

        Reporter.log("click on continue button" + nextStepButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");

       // clickOnElement(nextStepButton);
    }
}
