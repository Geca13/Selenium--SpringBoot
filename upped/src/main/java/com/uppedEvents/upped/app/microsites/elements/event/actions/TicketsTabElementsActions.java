package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.event.elements.TicketsTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketsTabElementsActions extends Base {

    @Autowired
    TicketsTabElements elements;
    @Autowired
    Methods methods;

    public void clickIncreaseQtyButton( Integer index){
        this.elements.increaseQtyButton.get(index).click();
    }

    public void clickDecreaseQtyButton( Integer index){
        this.elements.decreaseQtyButton.get(index).click();
    }

    public void enterQtyNumberInInput(Integer index){
        this.elements.quantityInputs.get(index).sendKeys("2");
    }

}
