package com.uppedEvents.upped.app.portal.shopManagement;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.portal.eventModules.MenuSchedulerPage;
import com.uppedEvents.upped.app.portal.eventModules.MenusPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopsPage extends Base {

    @Autowired
    MenusPage menus;

    @Autowired
    MenuSchedulerPage scheduler;


    @FindBy(id = "dropdownBasic1")
    public WebElement addShopDropdown;

    @FindBy(xpath = "//a[@class='dropdown-item' and text()='Add Vendor Partner']")
    public WebElement addVendor;

    @FindBy(xpath = "//a[@class='dropdown-item' and text()='Add Shop']")
    public WebElement addShop;

    @FindBy(xpath = "//a[@class='text-second']")
    public WebElement shopEditIcon;

    @FindBy(xpath = "//a[@class='text-danger']")
    public List<WebElement> deleteShopIcon;

    @FindBy(xpath = "//a/i[@class='icon-menu']")
    public List<WebElement> shopMenuIcon;

    @FindBy(xpath = "//a[text()=' View Details ']")
    public WebElement detailsMenuOption;

    @FindBy(xpath = "//a[text()=' Edit Menu ']")
    public WebElement editMenuIcon;
}
