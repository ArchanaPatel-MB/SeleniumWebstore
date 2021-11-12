package com.webstore.ui.pages.addItemToCart;
import com.webstore.ui.maps.addtoCart.*;
import com.webstore.ui.pages.registerPage.AdditionalInfoPageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dress {
    public  static WebDriver driver= AdditionalInfoPageClass.getDriver();
    public Dress(WebDriver driver) {
        this.driver=driver;
    }
    public static void clickOnDressBtn(){
        driver.findElement(Dresses.dressBtnSelector()).click();
    }
    public static void hoverAndAddDress() throws InterruptedException {
        WebElement hover = driver.findElement(Dresses.addDressInCartSelectr());
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        Thread.sleep(5000);
        driver.findElement(Dresses.addToCartBtn()).click();
        Thread.sleep(5000);
    }
    public  static Tshirt continueShopping(){
        driver.findElement(Dresses.continueShopping()).click();
        return new Tshirt(driver);
    }

}
