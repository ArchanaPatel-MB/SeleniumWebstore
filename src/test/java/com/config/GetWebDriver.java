package com.config;

import com.webstore.ui.pages.createAccount.ClickToSignIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebDriver {

       public static WebDriver getDriver() {
              System.setProperty("webdriver.chrome.driver", "chromedriver");
           WebDriver driver = new ChromeDriver();
              driver.get(" http://automationpractice.com/index.php");
             return driver;
       }

}
