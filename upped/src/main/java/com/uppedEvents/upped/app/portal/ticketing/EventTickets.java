package com.uppedEvents.upped.app.portal.ticketing;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.portal.ticketing.SettingsNav.SettingsNavs;
import com.uppedEvents.upped.app.portal.ticketing.SettingsNav.TaxesAndFeesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventTickets extends Base {

    @Autowired
    SettingsNavs settingsNavs;

    @Autowired
    TaxesAndFeesPage taxesAndFeesPage;

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

    public void navigateToTicketsSettings() throws InterruptedException {
        this.elementIsClickable(settingsNav);
        this.clickElement(settingsNav);
        Thread.sleep(2000);
    }
    public void navigateToTaxesAndFees(){
        this.settingsNavs.navigateToTaxesAndFeesPage();
    }
    public void setTaxesToTickets(String tax1, String tax2) throws InterruptedException {
        this.taxesAndFeesPage.setExcludedTaxesToTickets(tax1,tax2);
    }

    public void setFeesToTickets(String fee1, String fee2) throws InterruptedException {
        this.taxesAndFeesPage.setExcludedFeesToTickets(fee1,fee2);
    }
}
