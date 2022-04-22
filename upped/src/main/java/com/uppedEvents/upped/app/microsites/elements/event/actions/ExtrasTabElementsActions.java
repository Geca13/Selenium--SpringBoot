package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.ExtrasTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExtrasTabElementsActions extends Base {

    @Autowired
    ExtrasTabElements elements;

    public void clickNextPageButton(){
        this.elements.nextScreenButton.click();
    }

    public void clickPreviousPageButton(){
        this.elements.previousScreenButton.click();
    }
}
