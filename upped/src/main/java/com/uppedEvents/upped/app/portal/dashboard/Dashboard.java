package com.uppedEvents.upped.app.portal.dashboard;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.portal.portalModals.CreateNewEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dashboard extends Base {

    @Autowired
    MyEventsTab eventsTab;
    @Autowired
    CreateNewEvent newEvent;

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

    @FindBy(id = "createEventSide")
    public WebElement createEventButton;

    @FindBy(className = "Dashboard")
    public WebElement dashboardHeader;


    public void isOnDashboardPage(){
        this.elementIsClickable(myEventsTab);


    }
    public void goToMyEventsPage(String eventName) throws InterruptedException {
        this.isOnDashboardPage();
        this.clickElement(myEventsTab);
        this.eventsTab.isOnMyEventsPage(eventName);
    }
    public void createNewEvent(String eventName){
        this.isOnDashboardPage();
        this.clickElement(createEventButton);
        this.newEvent.createEvent(eventName);
    }


}
