package com.webstore.ui.pages.checkout;

import com.webstore.ui.maps.checkout.Checkout;
import com.webstore.ui.pages.addItemToCart.Tshirt;
import org.openqa.selenium.WebDriver;

public class CheckoutToPayment {
    public static WebDriver driver= Tshirt.driver();

    public static void proceedToCheckOut1(){
        driver.findElement(Checkout.procedTocheckoutSelector1()).click();
    }
    public static void proceedToCheckOut2(){
        driver.findElement(Checkout.procedTocheckoutSelector2()).click();
    }
    public static void proceedToCheckOut3(){
        driver.findElement(Checkout.procedTocheckoutSelector3()).click();
    }
    public static void checkout(){
        driver.findElement(Checkout.checkoutBtn()).click();
    }
    public static void proceedToCheckOut4(){
        driver.findElement(Checkout.procedTocheckoutSelector4()).click();
    }
    public static void payment(){
        driver.findElement(Checkout.payment()).click();
    }
    public static void confirmOrder(){
        driver.findElement(Checkout.confirmOrder()).click();
    }
    public static String orderConfirmationMessage(){
       return driver.findElement(Checkout.orderConfrmationMessageSelector()).getText();
    }


}
