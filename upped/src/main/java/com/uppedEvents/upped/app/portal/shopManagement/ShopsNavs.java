package com.uppedEvents.upped.app.portal.shopManagement;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ShopsNavs extends Base {

    @FindBy(xpath = "//a[@class='wraper-title' and text()='Shops Management']")
    public WebElement header;

    @FindBy(xpath = "//a[@class='nav-link' and text()='Shops']")
    public WebElement shopNav;

    @FindBy(xpath = "//a[@class='nav-link' and text()='Applications']")
    public WebElement applicationsNav;

    @FindBy(xpath = "//a[@class='nav-link' and text()='Vendor SignUp Form']")
    public WebElement vendorNav;

    @FindBy(xpath = "//a[@class='nav-link' and text()='Shop Categories']")
    public WebElement shopCategoriesNav;

    public void isOnShopsPage(){
        this.elementIsClickable(shopCategoriesNav);
    }

    public void clickShopCategoriesNav(){
        this.isOnShopsPage();
        this.clickElement(shopCategoriesNav);

    }
}
