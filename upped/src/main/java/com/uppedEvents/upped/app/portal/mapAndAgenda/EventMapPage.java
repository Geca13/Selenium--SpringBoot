package com.uppedEvents.upped.app.portal.mapAndAgenda;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventMapPage extends Base {

    @FindBy(tagName = "event-map")
    public WebElement locationMap;

    @FindBy(className = "leaflet-buttons-control-button")
    public List<WebElement> mapButtons;
}
