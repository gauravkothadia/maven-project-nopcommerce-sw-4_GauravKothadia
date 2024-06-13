package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;


public class ComputersPage extends Utility {

    By desktopLink = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");

    public void clickOnDesktopLink(){
        clickOnElement(desktopLink);
    }
}
