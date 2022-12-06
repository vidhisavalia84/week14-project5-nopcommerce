package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsPage1 extends Utility {
    By electonicTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellphonee = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    public void mousehoverOnElectronicsTab() {
        mouseHoverToElement(electonicTab);
    }

    public void mousehoverOnCellphoneAndClickOnCellphone() {
        mouseHoverToElementAndClick(cellphonee);
    }

    By listTab = (By.xpath("//a[contains(text(),'List')]"));

    public void clickOnListViewTab() {
        clickOnElement(listTab);
    }

    By nokiaLumia1020 = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");

    public void clickOnNokiaLumia1020Cellphone() {
        try {
            driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]")).click();
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            clickOnElement(nokiaLumia1020);
        }
    }

    public String getNokiaLumia1020Message() {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
    }

    By verifyPrice$349 = By.xpath("//span[@id='price-value-20']");

    public String verifyPrice$349() {
        return getTextFromElement(verifyPrice$349);
    }

    By quantity = By.cssSelector("#product_enteredQuantity_20");

    public void clearTextOfElement() {

        Actions actions = new Actions(driver);
        WebElement quantity1 = driver.findElement(quantity);
        quantity1.clear();
    }

    public void addQuantityOf2() {
        sendTextToElement(quantity, "2");
    }

    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    By verifyMessage = By.xpath("//p[@class='content']");

    public String verifyMessage() {
        return getTextFromElement(verifyMessage);
    }

    By crossButton = By.xpath("//span[@class='close']");

    public void clickOnCrossButton() {
        clickOnElement(crossButton);
    }

    By shoppingCart = By.xpath("//a[@href='/cart'and@class='ico-cart']");

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    By gotoCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    public void clickOnGoToCartButton() {
        clickOnElement(gotoCartButton);
    }

    By messageShoppinCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    //Shopping cart
    public String verifyMessageShoppinCart() {
        return getTextFromElement(messageShoppinCart);
    }

    By messageText2 = By.xpath("//span[contains(text(),'(2)')]");

    //(2)
    public String verifyMessageText2() {
        return getTextFromElement(messageText2);
    }

    By total$698 = By.xpath("//table[@class='cart-total']/tbody/tr[4]/td[2]");

    //$698.00
    public String verifyTotal$698() {
        return getTextFromElement(total$698);
    }

    By termsOfServiceButton = By.id("termsofservice");

    public void mouseHoverOnTermsOfServiceButtonAndClick() {
        mouseHoverToElementAndClick(termsOfServiceButton);
    }

    By checkOut = By.xpath("//button[@id='checkout']");

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }

    By pleaseSignIn = By.xpath("//div[@class='page-title']/h1");

    public String VerifyPleaseSignIn() {
        return getTextFromElement(pleaseSignIn);
    }

    By register = By.xpath("//a[contains(text(),'Register')]");

    public void clickOnRegister() {
        clickOnElement(register);
    }

    By registerText = By.xpath("//h1[contains(text(),'Register')]");

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    By genderButton = By.id("gender-female");

    public void clickOnGenderButton() {
        clickOnElement(genderButton);
    }

    By firstName = By.id("FirstName");

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    By lastName = By.id("LastName");

    public void enterLasttName(String name) {
        sendTextToElement(lastName, name);
    }

    By birthDate = By.xpath("//select[@name='DateOfBirthDay']");

    public void enterBirthDate() {
        selectOptionsByValue(birthDate, "10");
    }

    By month = By.xpath("//select[@name='DateOfBirthMonth']");

    public void enterBirthMonth() {
        selectOptionsByValue(month, "2");
    }

    By year = By.xpath("//select[@name='DateOfBirthYear']");

    public void enterBirthYear() {
        selectOptionsByValue(year, "1928");
    }

    By email = By.xpath("//input[@id='Email']");

    public void enterEmail(String emailaddress) {
        sendTextToElement(email, emailaddress);
    }

    By company = By.xpath("//input[@id='Company']");

    public void enterCompanyName(String companyName) {
        sendTextToElement(company, companyName);
    }

    By password = By.xpath("//input[@id='Password']");

    public void enterPassword(String passwordText) {
        sendTextToElement(password, passwordText);
    }

    By conformPassword = By.xpath("//input[@id='ConfirmPassword']");

    public void enterConformPassword(String password) {
        sendTextToElement(conformPassword, password);
    }

    By registerButton = By.xpath("//button[@id='register-button']");

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    By registrationMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    public String verifyRegistrationMessage() {
        return getTextFromElement(registrationMessage);
    }

    By continue1 = By.xpath("//a[contains(text(),'Continue')]");

    public void clickContinue1() {
        clickOnElement(continue1);
    }

    By shoppingCart1 = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCartText1() {
        return getTextFromElement(shoppingCart1);
    }

    By termasOfService = By.id("termsofservice");

    public void clickOnTermsofService1() {
        clickOnElement(termasOfService);
    }

    By checkout1 = By.id("checkout");

    public void clickOnCheckOut1() {
        clickOnElement(checkout1);
    }

    By selectCountry = By.id("BillingNewAddress_CountryId");

    public void selectCountry() {
        selectOptionsByValue(selectCountry, "12");
    }

    By city = By.id("BillingNewAddress_City");

    public void enterCity(String name) {
        sendTextToElement(city, name);
    }

    By address1 = By.id("BillingNewAddress_Address1");

    public void enterAddress1(String add1) {
        sendTextToElement(address1, add1);
    }

    By address2 = By.id("BillingNewAddress_Address2");

    public void enterAddress2(String add2) {
        sendTextToElement(address2, add2);
    }


    By zipcode = By.id("BillingNewAddress_ZipPostalCode");

    public void enterZipCode(String zip) {
        sendTextToElement(zipcode, zip);
    }

    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String num) {
        sendTextToElement(phoneNumber, num);
    }

    By faxNumber = By.id("BillingNewAddress_FaxNumber");

    public void enterFaxNumber(String num) {
        sendTextToElement(faxNumber, num);
    }

    By continue2 = By.name("save");

    public void clickOnContinue2() {
        clickOnElement(continue2);
    }

    By dayAir = By.id("shippingoption_2");

    public void clickOn2ndDayAirButton() {
        clickOnElement(dayAir);
    }

    By continue3 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickOnContinue3() {
        clickOnElement(continue3);
    }

    By creitCardBtn = By.id("paymentmethod_1");

    public void selectRadioButton() {
        clickOnElement(creitCardBtn);
    }

    By continue4 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void clickOnContinue4() {
        clickOnElement(continue4);
    }

    By visa = By.id("CreditCardType");

    public void selectVisaFromCreditCardDropDown() {
        selectOptionsByValue(By.id("CreditCardType"), "visa");
    }

    By cardHolderName = By.id("CardholderName");

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String name) {
        sendTextToElement(cardNumber, name);
    }

    By expireMonth = By.id("ExpireMonth");

    public void selectExpireMonth(String name) {
        selectOptionsByValue(expireMonth, name);
    }

    By expireYear = By.id("ExpireYear");

    public void selectExpireYear(String name) {
        selectOptionsByValue(expireYear, name);
    }

    By cardCode = By.id("CardCode");

    public void enterCardCode(String num) {
       sendTextToElement(cardCode,num);
    }

    By continue5 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void clickOnContinue5() {
        clickOnElement(continue5);
    }

    By messageCreditCard = By.xpath("//li[@class='payment-method']/span[2]");

    //Credit Car
    public String verifymessageCreditCard() {
        return getTextFromElement(messageCreditCard);
    }

    By message2ndDayAir = By.xpath("//li[@class='shipping-method']/span[2]");

    //2nd Day Air
    public String verifymessage2ndDayAir() {
        return getTextFromElement(message2ndDayAir);
    }

    By message698 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    //$698.00
    public String verifymessage698() {
        return getTextFromElement(message698);
    }

    By conform = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public void conformTransaction() {
        clickOnElement(conform);
    }
 By thankyou=By.xpath("//h1[contains(text(),'Thank you')]");
    //Thank you
    public String verifyMessageThankYou(){
        return getTextFromElement(thankyou);
    }
    By successfulMessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    //Your order has been successfully processed!
    public String verifyMessageSuccessful(){
        return getTextFromElement(successfulMessage);
    }

    By continue6=By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public void clickOnContinue6(){
        clickOnElement(continue6);
    }
    By lastMessage=By.xpath("//h2[contains(text(),'Welcome to our store')]");
    //
    public String verifyMessageWelcomeToOurStore(){
        return getTextFromElement(lastMessage);
    }
    By logout=By.xpath("//a[@class='ico-logout']");
    public void clickOnLogout(){
        clickOnElement(logout);
    }



















}
