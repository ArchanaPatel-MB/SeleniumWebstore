package com.webstore.ui.pages.createAccount;

import com.webstore.ui.maps.createAccount.SignInEmail;
import org.openqa.selenium.WebDriver;

public class SendEmailTosignIn {

     public static WebDriver driver=ClickToSignIn.getDriver();


    public static void sendEmail(String email){
         driver.findElement(SignInEmail.getEmailLoactor()).sendKeys(email);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
