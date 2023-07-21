package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {

    //nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
    //  and 'void clickNextStepButton()'

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectJobType(String job) {
        Reporter.log("Select the ob type" + selectJobTypeList.toString());
        clickOnElement(selectJobTypeList);
        CustomListeners.test.log(Status.PASS, "click on select reason for visit");
    }

    public void clickNextStepButton() {
        Reporter.log("Click on continue button on reason for visit page" + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button on reason for visit page");
    }
}
