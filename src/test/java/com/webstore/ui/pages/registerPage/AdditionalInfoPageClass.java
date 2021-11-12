package com.webstore.ui.pages.registerPage;

import com.webstore.ui.pages.addItemToCart.Dress;
import com.webstore.ui.pages.registerPage.AdditionalInfoPageClass.*;
import com.webstore.ui.maps.registerMap.AdditionalInfo;
import org.openqa.selenium.WebDriver;

public class AdditionalInfoPageClass {
          public static WebDriver driver;
          public AdditionalInfoPageClass(WebDriver driver){
              this.driver=driver;
          }
          public static void contactNumber(String contactNumber){
              driver.findElement(AdditionalInfo.contactNumber()).sendKeys("1234567890");
          }
          public static void aliasAddress(String aliasAddress){
              driver.findElement(AdditionalInfo.aliasAddress()).sendKeys("parashurampur");
          }
          public static void submit() throws InterruptedException {
              driver.findElement(AdditionalInfo.submit()).click();
              Thread.sleep(6000);
          }

          public static String registrationConfirmation(){
            return  driver.findElement(AdditionalInfo.registrationConfirmationSelector()).getText();
          }
          public static WebDriver getDriver(){
              return  driver;
          }
}
