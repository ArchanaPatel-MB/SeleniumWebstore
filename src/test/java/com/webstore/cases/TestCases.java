package com.webstore.cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import  com.webstore.ui.pages.*;
public class TestCases {

    @Test
    public void scrolldownAndSelectItem(){
        SelectingDress selectDress=new SelectingDress();
        selectDress.clickOkItem();


    }

}
