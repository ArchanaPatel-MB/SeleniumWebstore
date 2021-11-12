package com.webstore.ui.pages.createAccount;

import com.config.GetWebDriver;
import com.webstore.ui.maps.createAccount.SignIn;
import org.openqa.selenium.WebDriver;

public class ClickToSignIn  {

    public static WebDriver driver=GetWebDriver.getDriver();

    public static  void clickBtn()  {
        driver.findElement(SignIn.getSelectorforSignIn()).click();
       }

       public static String signInBtnConfirmation(){
      return driver.findElement(SignIn.signInbtnConfirmationSelector()).getText();

       }
       public static WebDriver getDriver(){
           return driver;
       }
}
