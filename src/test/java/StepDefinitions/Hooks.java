package StepDefinitions;

import Managers.FileReaderManager;
import Utilities.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.util.concurrent.TimeUnit;

public class Hooks {

    TestContext testContext;
    WebDriver webDriver;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void setUp(Scenario scenario) {
        webDriver = testContext.getDriverManager().getDriver();
        if (scenario.getSourceTagNames().contains("@MSMedicaid")) {

            webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl("url"));
        }
        else if (scenario.getSourceTagNames().contains("@AllyBank")){
            webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl("Allyurl"));

        }
        webDriver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    }
/*
    // Capture screenshot after each step
    @AfterStep
    public void afterEachStep(Scenario scenario) {
        if (webDriver != null) {
            byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot after step");
        }
    }
    */

    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        else{
            if (webDriver != null) {
                byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot after step");
            }
        }
        testContext.getDriverManager().closeDriver();
    }
}
