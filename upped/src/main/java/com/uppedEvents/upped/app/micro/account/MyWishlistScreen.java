package com.uppedEvents.upped.app.micro.account;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyWishlistScreen extends Base {

    @FindBy(tagName = "account-links")
    public List<WebElement> accountTabs;

    @FindBy(xpath = "//*[text()='My Purchases']")
    public WebElement myPurchasesCard;

    @FindBy(xpath = "//*[text()='My Wishlist']")
    public WebElement myWishlistButton;

    @FindBy(xpath = "//*[text()='My Wallet']")
    public WebElement myWalletButton;

    @FindBy(className = "event-card")
    public List<WebElement> eventCards;

    @FindBy(tagName = "wishlist-btn")
    public List<WebElement> removeToWishlist;

    @FindBy(xpath = "//*[text()='Read More']")
    public List<WebElement> readMoreButton;

    @FindBy(className = "no-records")
    public WebElement noRecordsMessage;

    @FindBy(id = "allEvents")
    public WebElement allEvents;
}
