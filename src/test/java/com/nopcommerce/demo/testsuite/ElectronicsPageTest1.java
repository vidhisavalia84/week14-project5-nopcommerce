package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.browserfactory.ManageBrowser;
import com.nopcommerce.demo.pages.ElectronicsPage1;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest1 extends BaseTest {
    ElectronicsPage1 electronicsPage1 = new ElectronicsPage1();


    @Test
    public void verifyThatProductAddedSuccessfullyAndPlaceOrderSucceessfully() {
        electronicsPage1.mousehoverOnElectronicsTab();
        electronicsPage1.mousehoverOnCellphoneAndClickOnCellphone();
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='page-title']/h1")), "Cell phones", "User is unable to navigate");
        electronicsPage1.clickOnListViewTab();
        electronicsPage1.clickOnNokiaLumia1020Cellphone();
        Assert.assertEquals(electronicsPage1.getNokiaLumia1020Message(), "Nokia Lumia 1020");
        Assert.assertEquals(electronicsPage1.verifyPrice$349(), "$349.00");
        electronicsPage1.clearTextOfElement();
        electronicsPage1.addQuantityOf2();
        electronicsPage1.clickOnAddToCartButton();
        Assert.assertEquals(electronicsPage1.verifyMessage(), "The product has been added to your shopping cart");
        electronicsPage1.clickOnCrossButton();
        electronicsPage1.mouseHoverOnShoppingCart();
        electronicsPage1.clickOnGoToCartButton();
        Assert.assertEquals(electronicsPage1.verifyMessageShoppinCart(), "Shopping cart");
        Assert.assertEquals(electronicsPage1.verifyMessageText2(), "(2)");
        Assert.assertEquals(electronicsPage1.verifyTotal$698(), "$698.00");
        electronicsPage1.mouseHoverOnTermsOfServiceButtonAndClick();
        electronicsPage1.clickOnCheckOutButton();
        Assert.assertEquals(electronicsPage1.VerifyPleaseSignIn(),"Welcome, Please Sign In!");
        electronicsPage1.clickOnRegister();
        Assert.assertEquals(electronicsPage1.verifyRegisterText(),"Register");

        electronicsPage1.clickOnGenderButton();
        electronicsPage1.enterFirstName("Krishna");
        electronicsPage1.enterLasttName("vara");
        electronicsPage1.enterBirthDate();
        electronicsPage1.enterBirthMonth();
        electronicsPage1.enterBirthYear();
        electronicsPage1.enterEmail("Krish12304@gmail.com");
        electronicsPage1.enterCompanyName("Prime");
        electronicsPage1.enterPassword("abc123");
        electronicsPage1.enterConformPassword("abc123");
        electronicsPage1.clickOnRegisterButton();
        Assert.assertEquals(electronicsPage1.verifyRegistrationMessage(),"Your registration completed");

        electronicsPage1.clickContinue1();
        Assert.assertEquals(electronicsPage1.verifyShoppingCartText1(),"Shopping cart");
        electronicsPage1.clickOnTermsofService1();
        electronicsPage1.clickOnCheckOut1();
electronicsPage1.selectCountry();
electronicsPage1.enterCity("Delhi");
electronicsPage1.enterAddress1("123  BillRoad");
electronicsPage1.enterAddress2("Dell Area");
electronicsPage1.enterZipCode("356501");
electronicsPage1.enterPhoneNumber("07856985689");
electronicsPage1.enterFaxNumber("563214");
electronicsPage1.clickOnContinue2();
electronicsPage1.clickOn2ndDayAirButton();
electronicsPage1.clickOnContinue3();
electronicsPage1.selectRadioButton();
electronicsPage1.clickOnContinue4();
electronicsPage1.selectVisaFromCreditCardDropDown();

electronicsPage1.enterCardHolderName("Krish");
electronicsPage1.enterCardNumber("1111222233334444");
electronicsPage1.selectExpireMonth("3");
electronicsPage1.selectExpireYear("2025");
electronicsPage1.enterCardCode("506");
electronicsPage1.clickOnContinue5();
Assert.assertEquals(electronicsPage1.verifymessageCreditCard(),"Credit Card");
Assert.assertEquals(electronicsPage1.verifymessage2ndDayAir(),"2nd Day Air");
Assert.assertEquals(electronicsPage1.verifymessage698(),"$698.00");
electronicsPage1.conformTransaction();
Assert.assertEquals(electronicsPage1.verifyMessageThankYou(),"Thank you");
Assert.assertEquals(electronicsPage1.verifyMessageSuccessful(),"Your order has been successfully processed!");
electronicsPage1.clickOnContinue6();
Assert.assertEquals(electronicsPage1.verifyMessageWelcomeToOurStore(),"Welcome to our store");
Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");













    }
}