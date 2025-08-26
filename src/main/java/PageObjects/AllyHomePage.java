package PageObjects;

import Enums.Context;
import Utilities.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import java.util.List;

public class AllyHomePage {
    TestContext testContext;

    public AllyHomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }


    @FindBy(xpath = " //*[@name='Ally']")
    private WebElement homePageTitle;

    @FindBy(xpath = "//*[@data-allytmln='checkingSavingMenu']")
    private WebElement checkingAndSavingsButton;

    @FindBy(xpath = "//*[@data-allytmln='creditCardsMenu']")
    private WebElement creditCardButton;

    @FindBy(xpath = "//*[@data-allytmln='investMenu']")
    private WebElement investmentAndRetirementButton;


    @FindBy(xpath = "//*[@data-allytmln='autoMenu']")
    private WebElement autoButton;

    @FindBy(xpath = "//*[@data-allytmln='aboutUsTopNav']")
    private WebElement aboutUs;

    @FindBy(xpath = "//*[@data-allytmln='contactUsTopNav']")
    private WebElement contactUs;

    @FindBy(xpath = "//*[@data-allytmln='helpTopNav']")
    private WebElement help;

    @FindBy(xpath = "//*[@data-allytmln='searchTopNav']")
    private WebElement search;

    @FindBy(xpath = "//*[@data-allytmln='searchTopNav']")
    private WebElement enterTextOnSearchBox;

    @FindBy(tagName = "a")
    private WebElement tagName;

    public void HomePageTitleIsDisplayed() {
        homePageTitle.getText();
    }
    public void clickOnCheckingAndSavingsButton() {
        checkingAndSavingsButton.click();
    }

    public void clickOnCreditCardButton() {
        creditCardButton.click();
    }

    public void clickOnInvestmentAndRetirementButton() {
        investmentAndRetirementButton.click();
    }

    public void clickOnAutoButton() {
        autoButton.click();
    }

    public void clickOnAboutUS() {
        aboutUs.click();
    }

    public void clickOnContactUS() {
        contactUs.click();
    }

    public void clickOnHelp() {
        help.click();
    }

    public void clickOnSearch() {
        search.click();
    }



    public void validateBrokenLinks() {
        List<WebElement> links = testContext.getDriverManager().getDriver().findElements(By.tagName("a"));
        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            System.out.println(links);

           }
    }



}

