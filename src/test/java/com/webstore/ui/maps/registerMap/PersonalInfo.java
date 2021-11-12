package com.webstore.ui.maps.registerMap;

import org.openqa.selenium.By;

public class PersonalInfo {
       public static By title(){
              return By.cssSelector("#id_gender2");
       }
       public static By firstName(){
              return By.cssSelector("#customer_firstname");
       }
       public static By lastName(){
              return By.cssSelector("#customer_lastname");
       }
       public static By password(){
              return By.cssSelector("#passwd");
       }

}
