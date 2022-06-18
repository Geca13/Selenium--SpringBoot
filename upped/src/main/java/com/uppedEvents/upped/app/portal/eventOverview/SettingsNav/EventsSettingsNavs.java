package com.uppedEvents.upped.app.portal.eventOverview.SettingsNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class EventsSettingsNavs extends Base {

    @FindBy(xpath = "//*[text()='Event Security']")
    public WebElement eventsSecuritySubNav;

    @FindBy(xpath = "//*[text()='Event Payments']")
    public WebElement eventsPaymentsSubNav;

    @FindBy(xpath = "//*[text()='Notifications']")
    public WebElement notificationsSubNav;

    @FindBy(xpath = "//*[text()='Donations']")
    public WebElement donationsSubNav;
}
