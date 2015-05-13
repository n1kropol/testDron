/**
 * Created by n1kropol on 13.05.2015.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;

public class forDron {
@Test
    public void test1(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
        driver.quit();
    }
    
}
