package com.webstore.ui.maps.createAccount;

import org.openqa.selenium.By;

public class SignIn {
    public static By getSelectorforSignIn(){
      By getSelectorForLogInBtn= By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
      return  getSelectorForLogInBtn;
    }
    public static By signInbtnConfirmationSelector(){
        return By.cssSelector("#create-account_form > h3");
    }
}
