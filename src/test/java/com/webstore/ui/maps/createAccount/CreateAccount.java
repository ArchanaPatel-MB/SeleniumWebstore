package com.webstore.ui.maps.createAccount;

import org.openqa.selenium.By;

public class CreateAccount {
     public static By elementToCreateAccount(){
         By element=By.cssSelector("#SubmitCreate > span");
         return element;
     }

     public static By createAccountConfirmationSelecotr(){
         return By.cssSelector("#account-creation_form > div:nth-child(1) > h3");
     }

}
