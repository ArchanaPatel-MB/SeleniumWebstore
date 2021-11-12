package com.webstore.ui.maps.registerMap;

import org.openqa.selenium.By;

public class Address {

      public static By firstName(){
            return By.cssSelector("#firstname");
      }
      public static By lastName(){
            return By.cssSelector("#lastname");
      }
      public static By address(){
            return By.cssSelector("#address1");
      }
      public static By city(){
            return By.cssSelector("#city");
      }
      public static By state(){return  By.cssSelector("#id_state");}
      public static By postalCode(){
            return By.cssSelector("#postcode");
      }
      public static By country(){
            return By.cssSelector("#id_country");
      }
}
