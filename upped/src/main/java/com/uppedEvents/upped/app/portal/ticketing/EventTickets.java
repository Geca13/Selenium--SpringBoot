package com.uppedEvents.upped.app.portal.ticketing;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class EventTickets extends Base {

    @FindBy(xpath = "//*[text()='Event Tickets']")
    public WebElement eventHeader;

    @FindBy(xpath = "//*[text()='Tickets']")
    public WebElement ticketsNav;

    @FindBy(xpath = "//*[text()='Seating Plan']")
    public WebElement seatingPlanNav;

    @FindBy(xpath = "//*[text()='Analytics']")
    public WebElement analyticsNav;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsNav;
}
