package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketingScreenElements extends Base {

    @FindBy(className = "information-title")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[text()='Tickets']")
    public WebElement ticketsTab;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginTab;

    @FindBy(xpath = "//*[text()='Extras']")
    public WebElement extrasTab;

    @FindBy(xpath = "//*[text()='Pay']")
    public WebElement payTab;

    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement confirmTab;

    @FindBy(xpath = "//*[text()=' Back to Event Info ']")
    public WebElement backToEventInfoButton;

    @FindBy(className = "mini-total")
    public List<WebElement> summaryElements;

    @FindBy(className = "grand-total")
    public WebElement totalContainer;

    @FindBy(className = "message-text")
    public WebElement loginInfoMessage;

    @FindBy(className = "login-link")
    public WebElement loginLink;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextButton;

    @FindBy(className = "fa-info-circle")
    public List<WebElement> infoIcons;

    @FindBy(id = "ngb-tooltip-1")
    public WebElement taxesTooltip;

    @FindBy(id = "ngb-tooltip-11")
    public WebElement feesTooltip;

    @FindBy(className = "tooltip-inner")
    public List<WebElement> summaryTooltips;

    @FindBy(tagName = "input")
    public List<WebElement> inputs;

    @FindBy(xpath = "//*[text()='Discount Code ']")
    public WebElement discountLabel;

    @FindBy(xpath = "//*[text()='Apply']")
    public WebElement applyButton;

    @FindBy(className = "fa-times")
    public WebElement closeBtn;
}
