package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class DetailsTabElements extends Base {

    @FindBy(xpath = "//*[text()='Event Description']")
    public WebElement eventDescriptionSubTab;

    @FindBy(className = "event-title")
    public WebElement eventTitle;

    @FindBy(className = "event-description")
    public WebElement eventDescription;
}
