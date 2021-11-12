package com.webstore.ui.pages.registerPage;

import com.webstore.ui.maps.registerMap.PersonalInfo;
import com.webstore.ui.pages.createAccount.ClickOnCreateAccount;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPageClass {
    public static WebDriver driver= ClickOnCreateAccount.driver();

    public static void title(){
        driver.findElement(PersonalInfo.title()).click();
    }
    public static void personalInfoFirstName(String personalInfoFirstName){
        driver.findElement(PersonalInfo.firstName()).sendKeys(personalInfoFirstName);
    }
    public static void personalInfolastName(String personalInfoLastname){
        driver.findElement(PersonalInfo.lastName()).sendKeys(personalInfoLastname);
    }
    public static AddressPageClass password(String password){
        driver.findElement(PersonalInfo.password()).sendKeys(password);
        return new AddressPageClass(driver);
    }
    
}
