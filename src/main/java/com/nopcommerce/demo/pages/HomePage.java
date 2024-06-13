package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    String TopMenuLink1 = "//ul[@class='top-menu notmobile']//a[normalize-space()='";
    String TopMenuLink2 = "']";

    public void selectMenu(String menu){
        clickOnElement(findSingleElement(By.xpath(TopMenuLink1+menu+TopMenuLink2)));
    }

    public void mouseHoverTo(String menu){
        mouseHoverToElement(By.xpath(TopMenuLink1+menu+TopMenuLink2));
    }
    public void mouseHoverToAndClick(String menu){
        mouseHoverToElementAndClick(By.xpath(TopMenuLink1+menu+TopMenuLink2));
    }

   public String gettingCurrentURLOfPage(){
        return gettingCurrentUrl();
   }
}
