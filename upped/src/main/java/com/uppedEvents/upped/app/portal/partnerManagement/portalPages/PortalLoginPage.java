package com.uppedEvents.upped.app.portal.partnerManagement.portalPages;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PortalLoginPage extends Base {

    @Value("${portal.url}")
    private String portalUrl;

    @Value("${portal.email}")
    private String portalEmail;

    @Value("${portal.password}")
    private String portalPassword;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(css = "input[formControlName=email]")
    public WebElement emailInput;

    @FindBy(xpath = "input[formControlName=password]")
    public WebElement passwordInput;

    public void openPortal(){ this.driver.get(portalUrl);}
}
