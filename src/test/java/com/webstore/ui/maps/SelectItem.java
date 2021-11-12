package com.webstore.ui.maps;

import org.openqa.selenium.By;

public class SelectItem {

   public  By returnSelectedItem() {
       By selectedItem = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.last-item-of-tablet-line.last-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
       return selectedItem;
   }
}
