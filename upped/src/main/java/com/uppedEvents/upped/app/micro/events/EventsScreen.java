package com.uppedEvents.upped.app.micro.events;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventsScreen extends Base {

    @FindBy(tagName = "nav")
    public WebElement navbar;

    @FindBy(id = "topEvents")
    public WebElement eventsContainer;

    @FindBy(className = "main-logo")
    public WebElement logo;

    @FindBy(xpath = "//*[text()='What\'s Upped?']")
    public WebElement whatsUpped ;

    @FindBy(xpath = "//*[text()='Support']")
    public WebElement support ;

    @FindBy(xpath = "//*[text()=' Account ']")
    public WebElement accountDropdown ;

    @FindBy(id = "navbarDropdown")
    public WebElement accountDropdownButton;

    @FindBy(className = "dropdown-menu")
    public WebElement accountDropdownElement;

    @FindBy(className = "fa-user-circle")
    public WebElement userIcon;

    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement signUp ;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn ;

    @FindBy(className = "banner-container")
    public WebElement bannerImage ;

    @FindBy(className = "image-text")
    public WebElement bannerText ;

    @FindBy(xpath = "//*[text()=' Top Events ']")
    public WebElement topEventsHeader ;

    @FindBy(xpath = "//*[text()='Qa Purchase ']")
    public WebElement eventName;

    @FindBy(tagName = "event-card")
    public List<WebElement> eventCards;

    @FindBy(tagName = "shortname")
    public List<WebElement> eventShortName;

    @FindBy(className = "footer")
    public WebElement footer;

    @FindBy(className = "contact-us")
    public WebElement contactUs;

    @FindBy(className = "contact-detail")
    public WebElement contactDetails;

    @FindBy(className = "fa-facebook")
    public WebElement facebookIcon;

    @FindBy(className = "fa-instagram")
    public WebElement instagramIcon;

    @FindBy(className = "fa-twitter")
    public WebElement twitterIcon;

    @FindBy(className = "fa-bookmark")
    public WebElement eventBookmark;

    @FindBy(className = "fa-chevron-right")
    public WebElement nextEventsButton;

    @FindBy(className = "fa-chevron-left")
    public WebElement previousEventsButton;

    @FindBy(xpath = "//*[text()='Read More']")
    public WebElement readMoreButton;

    @Value("${microsites.url}")
    private String micrositesUrl;



    public void openMicrositesPage(){
        this.driver.get(micrositesUrl);
    }








}
