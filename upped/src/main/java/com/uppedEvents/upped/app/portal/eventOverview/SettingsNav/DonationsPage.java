package com.uppedEvents.upped.app.portal.eventOverview.SettingsNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class DonationsPage extends Base {


    @FindBy(xpath = "//textarea[@type='text']")
    public WebElement donationsInput;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(className = "form-check-input")
    public WebElement donationsCheckbox;

}
