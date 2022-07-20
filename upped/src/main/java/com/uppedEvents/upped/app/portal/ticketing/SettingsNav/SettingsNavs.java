package com.uppedEvents.upped.app.portal.ticketing.SettingsNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SettingsNavs extends Base {

    @Autowired
    TaxesAndFeesPage taxesAndFeesPage;

    @FindBy(xpath = "//*[text()='General Settings']")
    public WebElement generalSettingsSub;

    @FindBy(xpath = "//*[text()='Refund Rules']")
    public WebElement refundRulesSub;

    @FindBy(xpath = "//*[text()='Taxes & Fees']")
    public WebElement taxesAndFeesSub;

    @FindBy(xpath = "//*[text()='Ticket Terms']")
    public WebElement termsSub;

    @FindBy(xpath = "//*[text()='Ticket Questions']")
    public WebElement questionsSub;

    @FindBy(xpath = "//*[text()='Event Capacity']")
    public WebElement capacitySub;

    @FindBy(xpath = "//*[text()='Ticket Permissions']")
    public WebElement permissionsSub;

    public void navigateToTaxesAndFeesPage() {
        this.elementIsClickable(taxesAndFeesSub);
        this.clickElement(taxesAndFeesSub);
        this.taxesAndFeesPage.isOnTaxesAndFeesSubNav();
    }
}
