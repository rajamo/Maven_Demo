package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        PropertiesUti po = new PropertiesUti();
        String va = po.proper();
        if (va.equals("chrome"))
        {

            String root = System.getProperty("user.dir");
            System. setProperty("webdriver.chrome.driver", root +"\\Driver\\chromedriver.exe");
            WebDriver obj = new ChromeDriver();
            ExcelUti exl = new ExcelUti();
            String url = exl.getvalueStr(1,1);
            obj.get(url);
            //Logger Log = LogManager.getLogger(Google.class);
           // Log.info("info-Browser launched");
            obj.quit();
        }
        else {

            System.out.println("Not Chrome");
        }



    }


}
