package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePageMS {

    public HomePageMS(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//a[text()='About']")
    private WebElement aboutLink;

    @FindBy(xpath = "//a[text()='Services']")
    private WebElement ServicesLink;

    @FindBy(xpath = "//a[text()='Quality']")
    private WebElement QualityLink;

    @FindBy(xpath = "//a[text()='Late Breaking News']")
    private WebElement LateBreakingNewsLink;

    @FindBy(xpath = "//a[text()='Job Openings']")
    private WebElement JobOpeningsLink;

    @FindBy(xpath = "//a[text()='Contact']")
    private WebElement ContactLink;

    @FindBy(xpath = "//h1")
    private WebElement pageHeaderText;


    public void ClickOnAboutLink(){
        aboutLink.click();
    }

    public void ClickOnServicesLinkLink(){
        ServicesLink.click();
    }


    public void ClickOnQualityLink(){
        QualityLink.click();
    }

    public void ClickOnLateBreakingNewsLink(){
        LateBreakingNewsLink.click();
    }

    public void ClickOnJobOpeningsLink(){
        JobOpeningsLink.click();
    }

    public void ClickOnContactLink(){
        ContactLink.click();
    }

    public String getPageHeaderText(){
         return  pageHeaderText.getText();
    }
}


