package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    WorkTypePage workTypePage;
    DurationOfStayPage durationOfStayPage;



    @BeforeTest(alwaysRun = true)
    public void inIT(){
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        workTypePage = new WorkTypePage();
        durationOfStayPage = new DurationOfStayPage();
    }






    @Test(groups = {"Smoke", "Sanity", "Regression"})
    public void anAustralianComingToUKForTourism(){


     // Click on start button
        startPage.acceptAllCookies();
        startPage.clickOnStartButton();
    //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality("Australia");
    //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit("Tourism");
    //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
    //	verify result 'You will not need a visa to come to the UK'
        resultPage.confirmResultMessageTourism();
    }

    @Test(groups = {"Regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        //	Click on start button
        startPage.clickOnStartButton();

        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality("Chile");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit("Chile");

        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();

        //	Select intendent to stay for 'longer than 6 months'
        durationOfStayPage.selectLengthOfStay("longer than 6 months");

        //	Click on Continue button
        durationOfStayPage.clickNextStepButton();

        //	Select have planning to work for 'Health and care professional'
        workTypePage.selectJobType("Health and care professional");

        //	Click on Continue button
        workTypePage.clickNextStepButton();

        //	verify result 'You need a visa to work in health and care'
        resultPage.confirmResultHealthcare("You need a visa to work in health and care");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        //	Click on start button
        startPage.clickOnStartButton();

        //	Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality("Colombia");

        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();

        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit("Colombia");

        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();

        //	Select state My partner of family member have uk immigration status 'yes'


        //	Click on Continue button

        //	verify result 'You’ll need a visa to join your family or partner in the UK'
        resultPage.confirmResultFamilyStay("You may need a visa");
    }
}
