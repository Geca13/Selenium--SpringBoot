package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.PayTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayTabElementsActions extends Base {

    @Autowired
    PayTabElements elements;

    public void clickPayWithWalletOption(){
        this.elements.payWithWalletButtonOption.click();
    }
    public void clickPayWithWalletButton(){
        this.elements.payWithWalletButton.click();
    }
    public void clickPayWithCardButton(){
        this.elements.payWithCardButton.click();
    }
    public void clickSelectCardOption() {
        this.elements.savedCards.get(0).click();
    }
    public void clickPayWithNewCardTab() {
        this.elements.payWithNewCardTab.click();
    }
    public void clickPayWithCardOrService() {
        this.elements.payWithCardTab.click();
    }
}
