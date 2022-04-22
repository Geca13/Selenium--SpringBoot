package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfirmationPageElements extends Base {


    @FindBy(className = "box-container")
    public WebElement confirmAndShareTab;

    @FindBy(className = "title")
    public WebElement thankYouMessage;

    @FindBy(className = "subtitle")
    public WebElement confirmationMessage;

    @FindBy(xpath = "//*[text()='Share on Facebook']")
    public WebElement shareButton;

    @FindBy(className = "tickets-overlapping-container")
    public List<WebElement> ticketConfirmationContainer;

    @FindBy(className = "ticket-item")
    public List<WebElement> ticketItemContainer;

    @FindBy(className = "ticket-title")
    public List<WebElement> ticketName;

    @FindBy(className = "event-no-logo")
    public List<WebElement> eventNamesContainer;

    @FindBy(className = "shortname")
    public List<WebElement> eventShortname;

    @FindBy(className = "full-event-name")
    public List<WebElement> eventFullname;

    @FindBy(xpath = "//*[text()=' Back to Start ']")
    public WebElement backToStartButton;
}
