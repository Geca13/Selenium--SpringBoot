package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.LocTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocTab extends Base {

    @Autowired
    LocTabElements locElements;

    public Boolean locationHeaderIsDisplayed() { return this.locElements.locationHeader.isDisplayed();}
    public Boolean openMapsButtonIsDisplayed() { return this.locElements.openMapsButton.isDisplayed(); }
    public Boolean locationIsDisplayed() { return this.locElements.location.isDisplayed(); }
    public Boolean googleMapsIsDisplayed() { return this.locElements.googleMaps.isDisplayed(); }

    public Boolean isAtLocationTab() {
       return this.wait.until((d) -> this.locationHeaderIsDisplayed());
    }
}
