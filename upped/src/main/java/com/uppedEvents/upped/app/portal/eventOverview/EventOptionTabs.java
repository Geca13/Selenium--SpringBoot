package com.uppedEvents.upped.app.portal.eventOverview;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class EventOptionTabs extends Base {

    @FindBy(xpath = "//*[text()='Menus']")
    public WebElement menusTab;

    @FindBy(xpath = "//*[text()='Ticketing']")
    public WebElement ticketingTab;

    @FindBy(xpath = "//*[text()='Transaction Center']")
    public WebElement transactionCenterTab;

    @FindBy(xpath = "//*[text()='Map and Agenda']")
    public WebElement mapAndAgendaTab;

    @FindBy(xpath = "//*[text()='Shop Management']")
    public WebElement shopManagementTab;

    @FindBy(xpath = "//*[text()='Partner Management']")
    public WebElement partnerManagementTab;

    @FindBy(xpath = "//*[text()='Find Events']")
    public WebElement findEventsTab;

    @FindBy(xpath = "//*[text()='Vendor Events']")
    public WebElement vendorEventsTab;

    @FindBy(xpath = "//*[text()='Requested Events']")
    public WebElement requestedEventsTab;

    @FindBy(xpath = "//*[text()='Staff Management']")
    public WebElement staffManagementTab;

    @FindBy(xpath = "//*[text()='Event Marketing']")
    public WebElement eventMarketingTab;

    @FindBy(xpath = "//*[text()='Customer Engagements']")
    public WebElement customerEngagementsTab;

    @FindBy(xpath = "//*[text()='Upped Support']")
    public WebElement uppedSupportTab;

    @FindBy(xpath = "//*[text()='Resolution Center']")
    public WebElement resolutionCenterTab;

    @FindBy(xpath = "//*[text()='Promotions']")
    public WebElement promotionsTab;

    @FindBy(xpath = "//*[text()='General Details']")
    public WebElement generalDetailsNav;

    @FindBy(xpath = "//*[text()='Design']")
    public WebElement designNav;

    @FindBy(xpath = "//*[text()='Primary Contact']")
    public WebElement primaryContactNav;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsNav;

    @FindBy(xpath = "//*[text()='Attendees']")
    public WebElement attendeesNav;

    @FindBy(xpath = "//*[text()='Groupings']")
    public WebElement groupingsNav;

    @FindBy(xpath = "//*[text()='Logs']")
    public WebElement logsNav;

    @FindBy(xpath = "//*[text()='Analytics']")
    public WebElement analyticsNav;

    public void navigateToEventSettings() throws InterruptedException {

    }
}
