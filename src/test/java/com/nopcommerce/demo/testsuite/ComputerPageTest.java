package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {

    ComputerPage computerPage=new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        computerPage.clickOnComputer();
        computerPage.clickOnDesktop();
        computerPage.selectTextZtoAFromDropdown();

    }

}
