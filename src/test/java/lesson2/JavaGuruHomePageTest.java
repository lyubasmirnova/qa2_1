package lesson2;
// test for home page openening

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaGuruHomePageTest {
    @Test
    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "C:/temp/geckodriver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.quit();
    }
}
