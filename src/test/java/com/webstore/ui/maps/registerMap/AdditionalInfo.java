package com.webstore.ui.maps.registerMap;

import org.openqa.selenium.By;

public class AdditionalInfo {
    public static By contactNumber(){
        return By.cssSelector("#phone_mobile");
    }
    public static By aliasAddress(){
        return By.cssSelector("#alias");
    }
    public static By submit(){
        return By.cssSelector("#submitAccount > span");
    }

    public static By registrationConfirmationSelector(){
        return By.cssSelector("#center_column > h1");
    }

}
