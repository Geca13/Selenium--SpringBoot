package com.uppedEvents.upped.app.portal.dashboard;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;


@Component
public class Dashboard extends Base {

    @FindBy(id = "tab-welcome")
    public WebElement welcomeTab;

    @FindBy(id = "tab-myevent")
    public WebElement myEventsTab;

    @FindBy(xpath = "//*[text()='Find Events']")
    public WebElement findEventsTab;

    @FindBy(xpath = "//*[text()='Vendor Events']")
    public WebElement vendorEventsTab;

    @FindBy(xpath = "//*[text()='Requested Events']")
    public WebElement requestedEventsTab;

    @FindBy(className = "event-listing-dropdown")
    public WebElement myEventsFilterDropdown;

    @FindBy(className = "Messages")
    public WebElement messagesButton;

    @FindBy(className = "createEventSide")
    public WebElement createEventButton;

    @FindBy(className = "Dashboard")
    public WebElement dashboardHeader;}
