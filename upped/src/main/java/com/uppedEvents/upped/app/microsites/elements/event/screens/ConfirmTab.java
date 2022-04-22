package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.ConfirmTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfirmTab extends Base {

    @Autowired
    ConfirmTabElements confirmElements;

    public Boolean confirmAndShareTabIsDisplayed(){ return this.confirmElements.confirmAndShareTab.isDisplayed(); }
    public Boolean thankYouMessageIsDisplayed(){ return this.confirmElements.thankYouMessage.isDisplayed(); }
    public Boolean confirmationMessageIsDisplayed(){ return this.confirmElements.confirmationMessage.isDisplayed(); }
    public Boolean totalAmountIsDisplayed(){ return this.confirmElements.totalAmount.isDisplayed(); }
    public Boolean viewReceiptButtonIsDisplayed(){ return this.confirmElements.viewReceiptButton.isDisplayed(); }
    public Boolean shareButtonIsDisplayed(){ return this.confirmElements.shareButton.isDisplayed(); }

    public Boolean isAtConfirmTab() {return this.wait.until((d) -> this.confirmElements.shareButton.isDisplayed()); }


}
