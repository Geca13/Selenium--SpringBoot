package com.uppedEvents.upped.app.portal.ticketing.SettingsNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketTermsPage extends Base {

    @FindBy(xpath = "//*[text()='Paragraph']")
    public WebElement paragraph;

    @FindBy(xpath = "//*[text()='Heading 1']")
    public WebElement heading1;

    @FindBy(xpath = "//*[text()='Heading 2']")
    public WebElement heading2;

    @FindBy(xpath = "//*[text()='Heading 3']")
    public WebElement heading3;

    @FindBy(tagName = "//button[@type='button']")
    public List<WebElement> stilingButtons; //index of 11

    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement ticketTermsInput;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;
}
