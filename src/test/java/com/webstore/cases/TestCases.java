package com.webstore.cases;

import com.webstore.ui.pages.addItemToCart.Dress;
import com.webstore.ui.pages.addItemToCart.Tshirt;
import com.webstore.ui.pages.checkout.CheckoutToPayment;
import com.webstore.ui.pages.createAccount.ClickOnCreateAccount;
import com.webstore.ui.pages.createAccount.ClickToSignIn;
import com.webstore.ui.pages.createAccount.SendEmailTosignIn;
import com.webstore.ui.pages.registerPage.AdditionalInfoPageClass;
import com.webstore.ui.pages.registerPage.AddressPageClass;
import com.webstore.ui.pages.registerPage.PersonalInfoPageClass;
import com.webstore.ui.utils.ExcelUtils;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCases {


    @Test(priority=1)
    public void signInBtn() throws InterruptedException {
        ClickToSignIn.clickBtn();
        Thread.sleep(2000);
        Assert.assertEquals(ClickToSignIn.signInBtnConfirmation(),"CREATE AN ACCOUNT");
    }

    @DataProvider(name = "email")
    public Object[][] email() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("src/test/resources/Data/seleniumWebStore.xlsx","Sheet2");
        return testObjArray;
    }


    @Test(priority=2, dataProvider = "email")
    public void sendKeyForEmail(String email) throws InterruptedException {
        System.out.println(email);
        SendEmailTosignIn.sendEmail(email);
        Thread.sleep(3000);
    }

    @Test(priority=3)
    public void createAccount() throws InterruptedException {
        ClickOnCreateAccount.click();
        Thread.sleep(10000);
        Assert.assertEquals(ClickOnCreateAccount.textForEmailConfirmation(),"YOUR PERSONAL INFORMATION");

    }

    @DataProvider(name = "Authentication")
    public Object[][] Authentication() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("src/test/resources/Data/seleniumWebStore.xlsx","Sheet1");
        return testObjArray;
    }

        @Test(priority = 4,dataProvider = "Authentication")
        public void register (String personalInfoFirstName, String personalInfoLastname, String password,
                              String addressFirstName, String addressLastName, String address, String city,
                              String postalCode, String contactNumber, String aliasAddress)
                throws InterruptedException {
            PersonalInfoPageClass.title();
            PersonalInfoPageClass.personalInfoFirstName(personalInfoFirstName);
            PersonalInfoPageClass.personalInfolastName(personalInfoLastname);
            PersonalInfoPageClass.password(password);
            AddressPageClass.addressfirstName(addressFirstName);
            AddressPageClass.addresslastName(addressLastName);
            AddressPageClass.address(address);
            AddressPageClass.city(city);
            AddressPageClass.state();
            AddressPageClass.postalCode(postalCode);
            AdditionalInfoPageClass.contactNumber(contactNumber);
            AdditionalInfoPageClass.aliasAddress(aliasAddress);
            AdditionalInfoPageClass.submit();
            Thread.sleep(10000);
            Assert.assertEquals(AdditionalInfoPageClass.registrationConfirmation(),"MY ACCOUNT");
        }
        @Test(priority = 5)
        public void addTocart () throws InterruptedException {
            Dress.clickOnDressBtn();
            Dress.hoverAndAddDress();
            Thread.sleep(2000);
            Dress.continueShopping();
            Tshirt.clickOnTshirtBtn();
            Tshirt.hoverAndAddTshirt();
            Thread.sleep(3000);
            Assert.assertEquals(Tshirt.itemAddedConfirmationMessage(),"Product successfully added to your shopping cart");
        }
        @Test(priority = 6)
        public void checkout () {
            CheckoutToPayment.proceedToCheckOut1();
            CheckoutToPayment.proceedToCheckOut2();
            CheckoutToPayment.proceedToCheckOut3();
            CheckoutToPayment.checkout();
            CheckoutToPayment.proceedToCheckOut4();
            CheckoutToPayment.payment();
            CheckoutToPayment.confirmOrder();
            Assert.assertEquals(CheckoutToPayment.orderConfirmationMessage(),"Your order on My Store is complete.");
        }
    }
