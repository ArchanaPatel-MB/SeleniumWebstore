package com.webstore.ui.maps.addtoCart;

import org.openqa.selenium.By;

public class Tshirts {
    public static By TshirtsBtnSelector(){
        return By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    }
    public static By hoverSelector(){
        return By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
    }
    public static By addTocart(){
        return By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    }
    public static By addingItemConfirmationMessage(){
        return By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2");
    }
}
