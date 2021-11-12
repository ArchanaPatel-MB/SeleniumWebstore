package com.webstore.ui.pages.registerPage;

import com.webstore.ui.maps.registerMap.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressPageClass {
      public static WebDriver driver;
     public AddressPageClass(WebDriver driver){
         this.driver=driver;
     }
     public  static void addressfirstName(String addressFirstName){
         driver.findElement(Address.firstName()).sendKeys(addressFirstName);
     }
     public static void addresslastName(String addressLastName){
         driver.findElement(Address.lastName()).sendKeys(addressLastName);
     }
     public static void address(String address){
         driver.findElement(Address.address()).sendKeys(address);
     }
     public static void city(String city){
         driver.findElement(Address.city()).sendKeys(city);
     }

     public static void state(){
         Select state=new Select(driver.findElement(Address.state()));
         state.selectByIndex(3);
     }
     public static AdditionalInfoPageClass postalCode(String postalCode){
         driver.findElement(Address.postalCode()).sendKeys("12345");
         return  new AdditionalInfoPageClass(driver);
     }


}
