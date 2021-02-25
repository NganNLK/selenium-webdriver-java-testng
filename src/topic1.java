import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class topic1 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @Test
    public void validateURL() {
        String loginUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginUrl, "http://demo.guru99.com/v4");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}