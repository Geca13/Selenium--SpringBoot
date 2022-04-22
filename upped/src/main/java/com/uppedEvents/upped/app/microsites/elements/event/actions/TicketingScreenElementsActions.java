package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.event.elements.TicketingScreenElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketingScreenElementsActions extends Base {

    @Autowired
    TicketingScreenElements elements;

    @Autowired
    Methods methods;



    public void moveToTaxesInfoIcon(){ this.methods.moveToElement(this.elements.infoIcons.get(0)); }

    public void moveToFeesInfoIcon(){
        this.methods.moveToElement(this.elements.infoIcons.get(1));
    }
    public void clickNextButton(){
        this.elements.nextButton.click();
    }
    public void clickCloseModalButton() { this.elements.closeBtn.click();}
}
