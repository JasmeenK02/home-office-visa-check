package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    //create methods 'void selectLengthOfStay(String moreOrLess)'
    // (Note: use switch statement for select moreOrLess stay) and 'void clickNextStepButton()'

    public void selectLengthOfStay(String moreOrLess) {
        Reporter.log("Select duration of stay");
        switch (moreOrLess) {
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            default:
                break;
        }
        CustomListeners.test.log(Status.PASS, "selectLengthStay" + moreOrLess);
    }

    public void clickNextStepButton() {
        Reporter.log("Click on continue button on duration page" + nextStepButton);
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "clickOnNextStepButton");
    }


}
