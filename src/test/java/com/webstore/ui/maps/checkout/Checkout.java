package com.webstore.ui.maps.checkout;

import org.openqa.selenium.By;

public class Checkout {
    public static By procedTocheckoutSelector1(){
        return  By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    }
    public static By procedTocheckoutSelector2(){
        return By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
    }
    public static By procedTocheckoutSelector3(){
        return By.cssSelector("#center_column > form > p > button > span");

    }

    public static By checkoutBtn(){
        return By.cssSelector("#cgv");
    }
    public static By procedTocheckoutSelector4(){
        return By.cssSelector("#form > p > button > span");

    }
    public static By payment(){
      return By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    }

    public  static By confirmOrder(){
        return By.cssSelector("#cart_navigation > button > span");
    }
    public static By orderConfrmationMessageSelector(){
        return By.cssSelector("#center_column > div > p > strong");
    }


}
