package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electonicTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellphonee = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    public void mousehoverOnElectronicsTab() {
        mouseHoverToElement(electonicTab);
    }

    public void mousehoverOnCellphoneAndClickOnCellphone() {
        mouseHoverToElementAndClick(cellphonee);
    }


}
