package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.ShopsTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopsTab extends Base {

    @Autowired
    ShopsTabElements shopsElements;

    public Boolean overviewIsDisplayed() {
        return this.shopsElements.overview.isDisplayed();
    }

    public Boolean shopsIsDisplayed(){
        return this.shopsElements.shops.get(0).isDisplayed();
    }

    public Boolean isAtShopsTab() {
        return this.wait.until((d) -> this.shopsElements.shops.get(0).isDisplayed());
    }
}
