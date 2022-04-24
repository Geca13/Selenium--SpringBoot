package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ExtrasPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExtrasPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    ExtrasPageElements elements;

    public void clickAddMoneyTab() { this.methods.clickElement(this.elements.addMoneyTab); }
    public void clickDonateTab() { this.methods.clickElement(this.elements.donateTab); }
    public void click$20Button() { this.methods.clickElement(this.elements.$20Button); }
    public void click$35Button() { this.methods.clickElement(this.elements.$35Button); }
    public void click$50Button() { this.methods.clickElement(this.elements.$50Button); }
    public void click$100Button() { this.methods.clickElement(this.elements.$100Button); }
    public void clickResetDonationButton() { this.methods.clickElement(this.elements.resetDonation); }
    public void clickAddToOrderButton() { this.methods.clickElement(this.elements.addDonation); }
    public void enterDonationInInput() { this.methods.sendKeysToElement(this.elements.donateInput,"150");}
}
