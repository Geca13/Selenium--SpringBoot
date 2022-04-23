package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordPageElements extends Base {

    @FindBy(css = "input[formControlName=email]")
    public WebElement emailInput;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Login now!']")
    public WebElement loginLink;

    @FindBy(className = "header-title")
    public WebElement headerTitle;

    @FindBy(className = "header-description")
    public WebElement headerDescription;
}
