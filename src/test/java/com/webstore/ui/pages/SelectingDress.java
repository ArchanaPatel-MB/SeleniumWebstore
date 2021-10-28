package com.webstore.ui.pages;

import com.webstore.cases.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.webstore.ui.maps.*;
import  com.config.GetWebDriver;
public class SelectingDress {
       public void clickOkItem(){
           WebDriver driver= GetWebDriver.getDriver();
           SelectItem sd=new SelectItem();
           JavascriptExecutor jse=(JavascriptExecutor)driver;
          WebElement item= driver.findElement(sd.returnSelectedItem());
           jse.executeScript("arguments[0].scrollIntoView()",item);
           item.click();
       }
}
