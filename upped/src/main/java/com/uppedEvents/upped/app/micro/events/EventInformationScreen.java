package com.uppedEvents.upped.app.micro.events;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventInformationScreen extends Base {

    @FindBy(className = "information-title")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[text()=' Buy Tickets ']")
    public WebElement buyTicketsButton;

    @FindBy(xpath = "//*[text()=' Add to Wishlist ']")
    public WebElement addToWishlistButton;

    @FindBy(xpath = "//*[text()=' Details ']")
    public WebElement detailsTab;

    @FindBy(xpath = "//*[text()=' Photos ']")
    public WebElement photosTab;

    @FindBy(xpath = "//*[text()=' Shops ']")
    public WebElement shopsTab;

    @FindBy(xpath = "//*[text()=' Location ']")
    public WebElement locationTab;

    @FindBy(className = "featured-image")
    public WebElement featuredImage;

    @FindBy(className = "shortname")
    public WebElement shortName;

    @FindBy(className = "full-event-name")
    public WebElement fullEventName;

    @FindBy(className = "event-info")
    public List<WebElement> eventInfo;

    @FindBy(className = "eventTags")
    public List<WebElement> eventTags;

    @FindBy(className = "line-straight")
    public List<WebElement> verticalLine;

    @FindBy(id = "pills-tabContent")
    public WebElement tabContent;


}
