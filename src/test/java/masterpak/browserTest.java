package masterpak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserTest {

    @Parameters({"URL"})
    @Test
    public void browserOpen(String URL){
        String root = System.getProperty("user.dir");
        System. setProperty("webdriver.chrome.driver", root +"\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.quit();
    }
}
