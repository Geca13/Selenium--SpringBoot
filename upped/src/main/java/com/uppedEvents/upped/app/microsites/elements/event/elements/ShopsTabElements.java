package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopsTabElements extends Base {

    @FindBy(xpath = "//*[text()='Overview']")
    public WebElement overview;

    @FindBy(className = "shops-container")
    public List<WebElement> shops;
}
