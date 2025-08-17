package StepDefinitions;
import PageObjects.HomePageMS;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


import io.cucumber.java.PendingException;

import java.util.List;

public class HomeStepsMS {
    HomePageMS homePageMS;
    TestContext testContext;

    public HomeStepsMS(TestContext context) {
        testContext = context;
        homePageMS = testContext.getPageObjectManager().getHomePageMS();
    }



    @Given("MS Login About page is displayed")
    public void goToMSLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        homePageMS.ClickOnAboutLink();

    }


    @Given("MS Login Services page is displayed")
    public void msLoginServicesPageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        homePageMS.ClickOnServicesLinkLink();
    }

    @Given("MS Login Quality page is displayed")
    public void msLoginQualityPageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
       homePageMS.ClickOnQualityLink();
    }

    @Given("MS Login LateBreakingNews page is displayed")
    public void msLoginLateBreakingNewsPageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
       homePageMS.ClickOnLateBreakingNewsLink();
    }

    @Given("MS Login JobOpening page is displayed")
    public void msLoginJobOpeningPageIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        homePageMS.ClickOnJobOpeningsLink();
    }

    @Given("MS Login ContactLink page is displayed")
    public void msLoginContactLinkPageIsDisplayed() {
      homePageMS.ClickOnContactLink();
    }

    @When("Navigates to Page page tittle with header")
    public void navigatesToPagePageTittleWithHeader(DataTable dataTable){
        List<String> dataRow = dataTable.row(1);
        String pageHeader = dataRow.get(0);
        System.out.println("(Header Expected Value==" + pageHeader+ ")(Header Actual Value ==" + homePageMS.getPageHeaderText()+")");
        Assert.assertEquals(homePageMS.getPageHeaderText(), pageHeader);

    }
}