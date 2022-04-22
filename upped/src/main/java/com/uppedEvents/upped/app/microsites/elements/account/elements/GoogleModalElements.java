package com.uppedEvents.upped.app.microsites.elements.account.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class GoogleModalElements extends Base {

    @FindBy(xpath = "//*[text()='uppedevents.com']")
    public WebElement uppedEventsUrl;

    @FindBy(id = "identifierId")
    public WebElement googleEmailInput;

    @FindBy(className = "VfPpkd-vQzf8d")
    public WebElement googleNextButton;

    @FindBy(className = "wLBAL")
    public WebElement userEmail;

    @FindBy(name = "password")
    public WebElement userPassword;

    @FindBy(className = "VfPpkd-muHVFf-bMcfAe")
    public WebElement showPasswordCheckbox;
}
