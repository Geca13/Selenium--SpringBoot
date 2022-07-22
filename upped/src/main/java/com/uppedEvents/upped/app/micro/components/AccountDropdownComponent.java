package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDropdownComponent extends Base {


    @FindBy(className = "dropdown-item")
    public List<WebElement> dropdownItems;

    @FindBy(className = "fa-user")
    public WebElement profileIcon;

    @FindBy(className = "fa-receipt")
    public WebElement receiptIcon;

    @FindBy(className = "fa-calendar-week")
    public WebElement myEventsIcon;

    @FindBy(className = "fa-file-invoice-dollar")
    public WebElement paymentInfoIcon;

    @FindBy(className = "fa-sign-out-alt")
    public WebElement logoutIcon;

    @FindBy(xpath = "//*[text()='Profile']")
    public WebElement profileItem;

    @FindBy(xpath = "//*[text()='Receipts']")
    public WebElement receiptsItem;

    @FindBy(xpath = "//*[text()='My Events']")
    public WebElement myEventsItem;

    @FindBy(xpath = "//*[text()='Payment Info']")
    public WebElement paymentInfoItem;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutItem;
}
