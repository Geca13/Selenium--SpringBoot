package com.uppedEvents.upped.app.micro.account;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyPurchasesScreen extends Base {

    @FindBy(className = "account-links")
    public List<WebElement> tabButtons;

    @FindBy(xpath = "//*[text()='My Purchases']")
    public WebElement myPurchasesCard;

    @FindBy(xpath = "//*[text()='My Wishlist']")
    public WebElement myWishlistButton;

    @FindBy(xpath = "//*[text()='My Wallet']")
    public WebElement myWalletButton;

    @FindBy(className = "search-text")
    public WebElement searchInput;

    @FindBy(className = "search-btn")
    public WebElement searchButton;

    @FindBy(className = "filter-btn")
    public WebElement filterButton;

    @FindBy(className = "card-header")
    public List<WebElement> eventPurchasesCard;

    @FindBy(className = "toggle-title")
    public List<WebElement> eventsNames;

    @FindBy(className = "fa-chevron-down")
    public List<WebElement> chevronDown;

    @FindBy(className = "fa-chevron-up")
    public List<WebElement> chevronUp;

    @FindBy(xpath = "//*[text()='All Purchases']")
    public List<WebElement> allPurchasesButtons;

    @FindBy(xpath = "//*[text()='Ticket']")
    public List<WebElement> ticketsButtons;

    @FindBy(xpath = "//*[text()='Food']")
    public List<WebElement> foodButtons;

    @FindBy(xpath = "//*[text()='Beverage']")
    public List<WebElement> beverageButtons;

    @FindBy(className = "box-container")
    public List<WebElement> myPurchasesTabs;

    @FindBy(className = "display")
    public List<WebElement> itemRow;

    @FindBy(className = "item-title")
    public List<WebElement> itemTitle;

    @FindBy(className = "product-title")
    public List<WebElement> productTitle;

    @FindBy(className = "product-price")
    public List<WebElement> productPrice;

    @FindBy(className = "product-time")
    public List<WebElement> productTime;

    @FindBy(className = "view-btn")
    public List<WebElement> viewReceiptButton;

    @FindBy(className = "close-btn")
    public WebElement closeButton;

    @FindBy(className = "heading")
    public WebElement receiptHeader;

    @FindBy(className = "sub-heading")
    public WebElement receiptSubHeader;

    @FindBy(className = "product-list")
    public List<WebElement> ticketsNames;

    @FindBy(className = "subtotal")
    public WebElement subtotal;

    @FindBy(className = "discount")
    public WebElement discount;

    @FindBy(className = "total")
    public WebElement total;

    @FindBy(className = "subtotal-section")
    public WebElement subtotalSection;

}


