package com.uppedEvents.upped.app.portal.partnerManagement;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class PartnersPage extends Base {

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addPartnerButton;

    @FindBy(tagName = "table")
    public WebElement partnersTable;
}
