package masterpak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browserTest {


    @Test
    //@Parameters({"URL"})
    public void browserOpen1(){
        String root = System.getProperty("user.dir");
        System. setProperty("webdriver.chrome.driver", root +"\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://mail.google.com/mail/u/0/#inbox");

        driver.quit();
    }

    @Test
    //@Parameters({"URL"})
    public void browserOpen2(){
        String root = System.getProperty("user.dir");
        System. setProperty("webdriver.chrome.driver", root +"\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.quit();
    }
}
