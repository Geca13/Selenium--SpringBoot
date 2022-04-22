package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LocTabElements extends Base {

    @FindBy(className = "maps-btn")
    public WebElement openMapsButton;

    @FindBy(className = "location")
    public WebElement location;

    @FindBy(className = "location-header")
    public WebElement locationHeader;

    @FindBy(tagName = "google-map")
    public WebElement googleMaps;
}
