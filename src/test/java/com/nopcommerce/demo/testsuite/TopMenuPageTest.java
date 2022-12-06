package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.browserfactory.ManageBrowser;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuPageTest extends BaseTest {

    TopMenuPage object=new TopMenuPage();
   @Test
    public void verifyUserSholdClickOnAnyOptionFromTopMenu(){

       object.selectMenu("Computers");
    }


}
