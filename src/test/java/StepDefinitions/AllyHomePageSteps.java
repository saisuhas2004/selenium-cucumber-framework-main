package StepDefinitions;
import Utilities.TestContext;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import PageObjects.AllyHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AllyHomePageSteps {

    AllyHomePage allyHomePage;
    TestContext testContext;


    public AllyHomePageSteps(TestContext context) {
        testContext = context;
        allyHomePage = testContext.getPageObjectManager().getAllyHomePage();
    }

    @Given("AllyBank Navigates to Checking Bank page")
    public void AllyBankNavigatesToCheckingBankPage() throws InterruptedException {
        allyHomePage.clickOnCheckingAndSavingsButton();
    }


    @Given("user clicks Credit Card")
    public void userClicksCreditCard() {
        allyHomePage.clickOnCreditCardButton();
    }

    @Given("AllyBank Navigates to Investment and Retirement page")
    public void allybankNavigatesToInvestmentAndRetirementPage() {
        allyHomePage.clickOnInvestmentAndRetirementButton();
    }

    @Given("AllyBank Navigates to Auto page")
    public void allybankNavigatesToAutoPage() {
        allyHomePage.clickOnAutoButton();

    }

    @Given("user brings up the AllyBank HomePage")
    public void userBringsUpTheAllyBankHomePage() {
        allyHomePage.HomePageTitleIsDisplayed();
    }

    @When("user clicks Checking and Savings")
    public void userClicksCheckingAndSavings() {
        allyHomePage.clickOnCheckingAndSavingsButton();
    }

    @Then("User should be naviagtes to Checking and Savings Page")
    public void userShouldBeNaviagtesToCheckingAndSavingsPage() {

    }

    @Then("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle){
        String actualTitle = testContext.getDriverManager().getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user clicks Investment and Retirement Page")
    public void userClicksInvestmentAndRetirementPage() {
        allyHomePage.clickOnInvestmentAndRetirementButton();
    }

    @When("user clicks AllyBank Navigates to Auto Page")
    public void userClicksAllyBankNavigatesToAutoPage() {
        allyHomePage.clickOnAutoButton();
    }

    @When("user clicks AllyBank Navigates to About US Page")
    public void userClicksAllyBankNavigatesToAboutUSPage() {
        allyHomePage.clickOnAboutUS();
    }

    @When("user clicks AllyBank Navigates to Contact US Page")
    public void userClicksAllyBankNavigatesToContactUSPage() {
       allyHomePage.clickOnContactUS();
    }

    @When("user clicks AllyBank Navigates to Help Page")
    public void userClicksAllyBankNavigatesToHelpPage() {
       allyHomePage.clickOnHelp();
    }

    @When("user clicks AllyBank Navigates to Search")
    public void userClicksAllyBankNavigatesToSearch() {
      allyHomePage.clickOnSearch();
    }
}