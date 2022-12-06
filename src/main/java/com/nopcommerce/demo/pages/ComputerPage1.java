package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import org.testng.Assert;
public class ComputerPage1 extends Utility {

    By computerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    public void clickOnComputerTab() {
        clickOnElement(computerMenu);
    }

    By desktopTab = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");

    public void clickOnDesktop() {
        clickOnElement(desktopTab);
    }

    By sortByPosition = By.xpath("//select[@id='products-orderby']");

   /* public void clickOnSortByPosition() {
        clickOnElement(sortByPosition);
    }*/

   // By selectPosition = By.xpath("//option[contains(text(),'Name: A to Z')]");
By selectPosition=By.id("products-orderby");
    public void selectOptionAtoZFromList() {

        selectOptionsByValue(selectPosition, "5");
    }

    By addToCart =By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    public void addToCartButton(){

        try{clickOnElement(addToCart);
        }catch (org.openqa.selenium.StaleElementReferenceException e){
            clickOnElement(addToCart);
        }
    }

    By verifyTextBuildYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");

    By sortProcessor = By.cssSelector("#product_attribute_1");
    public void clickOnProcessorfeildDropDown() {
        clickOnElement(sortProcessor);
    }

    By selectProcessor = By.xpath("//dd[@id='product_attribute_input_1']//option[2]");
//By.xpath("//option[@data-attr-value ='1']");
    public void selectProcessorFromDropDownList() {

        clickOnElement(selectProcessor);
    }

    By selectRam = By.xpath("//select[@data-attr ='2']");

    public void selectRamFromDropDownList() {
        clickOnElement(selectRam);
    }

    By select8Gb = By.xpath("//option[@data-attr-value ='5']");

    public void select8GBFromDropDown() {
        clickOnElement(select8Gb);
    }

    By selectHddRadio = By.xpath("//label[@for ='product_attribute_3_7']");

    public void selectHddRadioButton() {
        clickOnElement(selectHddRadio);
    }

    By selectOSradio = By.xpath("//input[@id ='product_attribute_4_9']");

    public void selectOSradioVistaPremiumButton() {
        clickOnElement(selectOSradio);
    }

    By selectMicrosoftOffice = By.xpath("//input[@id ='product_attribute_5_10']");

    By selectTotalCommander = By.xpath("//input[@id ='product_attribute_5_12']");

    public void setSelectTotalCommanderCheckBox() {

        clickOnElement(selectTotalCommander);
    }

    By verifyPrice = By.xpath("//span[@id ='price-value-1']");
    public String verifyMessage(){
       // Thread.sleep(1000);
       return getTextFromElement(verifyPrice);
    }

    By clickOnAddToCart = By.xpath("//button[@id ='add-to-cart-button-1']");

    public void clickAgainOnAddToCartButton() {
        clickOnElement(clickOnAddToCart);
    }

    By verifyTheMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//span[@class='close']");

    public void closeMessageTextButton() {
        clickOnElement(closeButton);
    }

    By verifyShoppingCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");////a[@class='ico-cart']

    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }

    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By clearText = By.xpath("//input[@value='1']");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }

    By sendTextToQuantity = By.xpath("//input[@value='1']");

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }

    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    By verifyTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");

    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }

    By clickOnCheckout = By.xpath("//button[@id='checkout']");

    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }

    By VerifyTextWelcome, PleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }

    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");

    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }

    By sendTextToLastName = By.id("BillingNewAddress_LastName");

    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }

    By sendTextToEmail = By.id("BillingNewAddress_Email");

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }

    By sendTextToCompany = By.id("BillingNewAddress_Company");

    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectOptionsByValue(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    // Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
    //        country.selectByVisibleText("United Kingdom");
    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");

    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));

    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }

    By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }

    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }

    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");

    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }

    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }

    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }

    By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }

    By clickOnMasterCard = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    public void selectMasterCardFromCreditCardDropdown() {
        selectOptionByIndex(By.id("CreditCardType"), 1);
    }

    By cardholdername = By.id("CardholderName");

    public void sendTextTOCardHolderName(String name) {

        sendTextToElement(cardholdername, name);
    }

    By cardNumber = By.id("CardNumber");

    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }
    By cardCode = By.id("CardCode");

    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectOptionsByValue(By.id("ExpireMonth"), "5");
        selectOptionsByValue(By.id("ExpireYear"), "2024");
    }


By continueButton2=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
public void clickOnContinueButton2(){
    clickOnElement(continueButton2);
}
By conform=By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
public void clickOnConformButton(){
    clickOnElement(conform);
}
By continueButton3=By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");
public void clickOnContinueButton3(){
    clickOnElement(continueButton3);
}

}
