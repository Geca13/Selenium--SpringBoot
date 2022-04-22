package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.LocTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationTabElementsActions extends Base {

    @Autowired
    LocTabElements elements;

    public void clickOpenInMaps(){
        elements.openMapsButton.click();
    }
}


