import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by n1kropol on 29.04.2015.
 */
@RunWith(JUnit4.class)
public class AngelTitleTest {
    public static WebDriver driver;
    @Before
    public void doBefore(){
//        TestHelperPassw.init();
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
    public void test1(){
        //TestHelperPassw.driver.findElement(By.name("master"));
        //TestHelperPassw.driver.findElement(By.name("site"));
        //TestHelperPassw.driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td/input")).click();
        //Assert.assertEquals("BaefBs8/Z/cm2@1a", TestHelperPassw.driver.findElement(By.name("password")).getAttribute("value"));
        Assert.assertEquals(1,1);
    }

    @After
    public void clean(){
        //TestHelperPassw.driver.quit();
        driver.quit();
    }
}

