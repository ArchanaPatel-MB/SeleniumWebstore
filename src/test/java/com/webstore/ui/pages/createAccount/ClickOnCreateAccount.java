package com.webstore.ui.pages.createAccount;

import com.webstore.ui.maps.createAccount.CreateAccount;
import com.webstore.ui.pages.registerPage.PersonalInfoPageClass;
import org.openqa.selenium.WebDriver;

public class ClickOnCreateAccount {

   public static WebDriver driver=SendEmailTosignIn.getDriver();

    public static void click(){
        driver.findElement(CreateAccount.elementToCreateAccount()).click();
    }
    public static String textForEmailConfirmation(){
       return driver.findElement(CreateAccount.createAccountConfirmationSelecotr()).getText();
    }

    public static  WebDriver driver(){
        return driver;
    }


}
