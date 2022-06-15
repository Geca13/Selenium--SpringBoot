package com.uppedEvents.upped.app.portal.partnerManagement;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class PartnerNavs extends Base {

    @FindBy(xpath = "//*[text()='Partners']")
    public WebElement partnersNav;

    @FindBy(xpath = "//*[text()='Contracts']")
    public WebElement contractsNav;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsNav;

    @FindBy(xpath = "//*[text()='Application']")
    public WebElement applicationNav;
}
