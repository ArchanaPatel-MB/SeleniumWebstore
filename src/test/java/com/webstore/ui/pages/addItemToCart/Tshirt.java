package com.webstore.ui.pages.addItemToCart;

import com.webstore.ui.maps.addtoCart.Dresses;
import com.webstore.ui.maps.addtoCart.Tshirts;
import com.webstore.ui.pages.checkout.CheckoutToPayment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tshirt {
    public static WebDriver driver;
    public Tshirt(WebDriver driver) {
        this.driver=driver;
    }
    public static void clickOnTshirtBtn(){
        driver.findElement(Tshirts.TshirtsBtnSelector()).click();
    }
    public static void hoverAndAddTshirt() throws InterruptedException {
        WebElement hover = driver.findElement(Tshirts.hoverSelector());
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        Thread.sleep(10000);
        driver.findElement(Tshirts.addTocart()).click();
    }

    public static String itemAddedConfirmationMessage(){
        return driver.findElement(Tshirts.addingItemConfirmationMessage()).getText();
    }

    public  static WebDriver driver(){
        return driver;
    }
}
