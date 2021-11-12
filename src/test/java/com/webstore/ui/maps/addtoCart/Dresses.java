package com.webstore.ui.maps.addtoCart;

import org.openqa.selenium.By;

public class Dresses {
         public static By dressBtnSelector(){
             return By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
         }
         public static By addDressInCartSelectr(){
             return By.cssSelector("#center_column > ul > li:nth-child(2) > div");
         }
         public static By addToCartBtn(){
             return By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
         }
         public static By continueShopping(){
             return By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span");
         }
}
