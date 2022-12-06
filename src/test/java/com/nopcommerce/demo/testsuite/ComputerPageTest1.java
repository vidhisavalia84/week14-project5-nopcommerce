package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage1;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest1 extends BaseTest {
    ComputerPage1 computerPage1 = new ComputerPage1();

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {
        computerPage1.clickOnComputerTab();
        computerPage1.clickOnDesktop();
        //computerPage1.clickOnSortByPosition();
        computerPage1.selectOptionAtoZFromList();
        driver.manage().timeouts().getImplicitWaitTimeout();
        computerPage1.addToCartButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]")), "Build your own computer");
       // computerPage1.clickOnProcessorfeildDropDown();
        computerPage1.selectProcessorFromDropDownList();
        computerPage1.selectRamFromDropDownList();
        computerPage1.select8GBFromDropDown();
        computerPage1.selectHddRadioButton();
        computerPage1.selectOSradioVistaPremiumButton();
        computerPage1.setSelectTotalCommanderCheckBox();
      //  String s1=getTextFromElement(By.id("price-value-1"));
       // Assert.assertEquals(computerPage1.verifyMessage(),"$1,475.00");
        computerPage1.clickAgainOnAddToCartButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")), "The product has been added to your shopping cart");
        computerPage1.closeMessageTextButton();
        //Assert.assertEquals(getTextFormAlert(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"),"");
        computerPage1.mouseHoverOnElementShoppingCart();
        computerPage1.clickOnGoToCart();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        computerPage1.mouseHoverOnElementShoppingCart();
        computerPage1.clickOnGoToCart();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        computerPage1.clearTextInQuantityField();
        computerPage1.sendTextToQuantityField();
        computerPage1.clickOnUpdateShoppingCartButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//tbody/tr[1]/td[6]/span[1]")), "$2,950.00");
        computerPage1.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage1.clickOnCheckOutButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")), "Welcome, Please Sign In!");
        computerPage1.clickOnCheckOutAsGuest();
        computerPage1.sendTextToFirstNameField("Krishna");
        computerPage1.sendTextToLastNameField("vara");
        computerPage1.sendTextToEmailField("Krish@gmail.com");
        computerPage1.sendTextToCompanyField("Prime");
        computerPage1.selectCountryFromDropDownList();
        computerPage1.sendTextToCityField("London");
        computerPage1.sendTextToAddressLine1("12 block, om nagar");
        computerPage1.sendTextToAddressLine2("Amreli");
        computerPage1.sendTextToPostcode("HA3 9UY");
        computerPage1.sendTextToPhoneNumberField("07896542535");
        computerPage1.clickOnContinueButton();
        computerPage1.clickOnNextDayAirButton();
        computerPage1.clickOnContinueButtonAgain();
        computerPage1.clickOnCreditCardButton();
        computerPage1.selectClickOnContinue1();
        computerPage1.selectMasterCardFromCreditCardDropdown();
        computerPage1.sendTextTOCardHolderName("Krish");
        computerPage1.sendTextTOCardNumber("1111222233334444");
        computerPage1.sendTextToCardCode("406");
        computerPage1.selectMonthAndYearForCreditCardExpireData();

        computerPage1.clickOnContinueButton2();
        Assert.assertEquals(getTextFromElement(By.xpath("//li[@class='payment-method']/span[2]")), "Credit Card");
        Assert.assertEquals(getTextFromElement(By.xpath("//li[@class='shipping-method']//span[2]")), "Next Day Air");
        Assert.assertEquals(getTextFromElement(By.xpath("//tr[@class='order-total']/td[2]/span/strong")), "$2,950.00");
        computerPage1.clickOnConformButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]")), "Thank you");
        Assert.assertEquals(getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")), "Your order has been successfully processed!");
        computerPage1.clickOnContinueButton3();
Assert.assertEquals(getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")),"Welcome to our store");
    }


}
