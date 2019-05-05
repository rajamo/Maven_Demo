package masterpak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserTest {


    @Test
    @Parameters({"URL"})
    public void browserOpen(String url){
        String root = System.getProperty("user.dir");
        System. setProperty("webdriver.chrome.driver", root +"\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.get(url);
        driver.quit();
    }
}
