package com.uppedEvents.upped.app.micro.account;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountPage extends Base {

    @FindBy(className = "title")
    public WebElement header;

    @FindBy(className = "profile-img")
    public WebElement imageAvatar;

    @FindBy(tagName = "h5")
    public WebElement fullName;

    @FindBy(className = "profile-field")
    public List<WebElement> profileData;

    @FindBy(className = "profile-actions")
    public List<WebElement> accountButtons;

    @FindBy(className = "account-card")
    public List<WebElement> accountCards;

    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfileButton;

    @FindBy(xpath = "//*[text()='Email Address']")
    public WebElement emailAddressLabel;

    @FindBy(xpath = "//*[text()='Phone Number']")
    public WebElement phoneNumberLabel;

    @FindBy(xpath = "//*[text()='Location']")
    public WebElement locationLabel;

    @FindBy(xpath = "//*[text()='Log off']")
    public WebElement logoffButton;

    @FindBy(className = "pr-0")
    public List<WebElement> cardsIcons;

    @FindBy(xpath = "//*[text()='My Purchases']")
    public WebElement myPurchasesButton;

    @FindBy(xpath = "//*[text()='My Wishlist']")
    public WebElement myWishlistButton;

    @FindBy(xpath = "//*[text()='My Wallet']")
    public WebElement myWalletButton;

    @FindBy(tagName = "p")
    public List<WebElement> cardsDescriptions;

    @FindBy(tagName = "h4")
    public List<WebElement> cardsTitles;


}
