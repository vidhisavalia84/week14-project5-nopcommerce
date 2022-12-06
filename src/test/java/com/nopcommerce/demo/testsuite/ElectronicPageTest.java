package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicPageTest extends BaseTest {

    ElectronicsPage electronicsPage=new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        electronicsPage.mousehoverOnElectronicsTab();
        electronicsPage.mousehoverOnCellphoneAndClickOnCellphone();
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='page-title']/h1")),"Cell phones","User is unable to navigate");
    }



}
