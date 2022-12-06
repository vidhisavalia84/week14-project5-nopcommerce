package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computertab =By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktopTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");


    public void clickOnComputer() {
        clickOnElement(computertab);
    }

    public void clickOnDesktop() {
        clickOnElement(desktopTab);
    }

    public void selectTextZtoAFromDropdown() {
       // selectOptionsByValue(By.id("products-orderby"), "6");
        List<WebElement> option = driver.findElements(By.id("products-orderby"));
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : option) {
            originalList.add(e.getText());

        }
        System.out.println(originalList);
        Collections.reverse(originalList);
        System.out.println(originalList);


        selectOptionsByValue(By.id("products-orderby"), "6");
    }
    public void verifyMessageThatProductAreDisplayedInDecendingOrder(){

    }
}
