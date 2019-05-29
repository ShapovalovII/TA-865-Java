
import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.byTa;
import static io.trueautomation.client.TrueAutomationHelper.ta;


public class InitialLocatorTest {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() throws InterruptedException {
        driver.get("https://zachet.com.ua/#job");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector(ta("Zachet:Zachet_Div_Initial", ".logo.top-menu"))).click();

        Thread.sleep(2000);


    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}