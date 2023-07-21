package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageTourism;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageFamilyStay;


    public String confirmResultMessageTourism(){
        Reporter.log("Get message for tourism visa" + resultMessageTourism.toString());
        CustomListeners.test.log(Status.PASS, "Get message for tourism visa");
        return getTextFromElement(resultMessageTourism);
    }

    public String getResultMessageHealthcare() {
        Reporter.log("Get message for Health Care visa" + resultMessageHealthCare.toString());
        CustomListeners.test.log(Status.PASS, "Get message for Health Care visa");
        return getTextFromElement(resultMessageHealthCare);
    }

    public void confirmResultHealthcare(String expectedMessage) {
        Reporter.log("Compare the health care visa message");
        Assert.assertTrue(expectedMessage.equals(getResultMessageHealthcare()));
        CustomListeners.test.log(Status.PASS, "Compare the health care visa message");
    }

    public String getResultMessageFamilyStay() {
        Reporter.log("Get message for family stay visa" + resultMessageFamilyStay.toString());
        CustomListeners.test.log(Status.PASS, "Get message for family stay visa");
        return getTextFromElement(resultMessageFamilyStay);
    }

    public void confirmResultFamilyStay(String expectedMessage) {
        Reporter.log("Compare the family stay visa message");
        Assert.assertTrue(expectedMessage.equals(getResultMessageFamilyStay()));
        CustomListeners.test.log(Status.PASS, "Compare the family stay visa message");
    }
}



