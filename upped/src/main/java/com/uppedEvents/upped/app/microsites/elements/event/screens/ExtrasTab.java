package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.ExtrasTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExtrasTab extends Base {

    @Autowired
    ExtrasTabElements extrasElements;

    public ExtrasTabElements getExtrasElements() {
        return extrasElements;
    }

    public Boolean extrasContainerIsDisplayed(){ return this.extrasElements.extrasContainer.isDisplayed(); }
    public Boolean firstExtrasTabsIsDisplayed(){ return this.extrasElements.extrasTabs.get(0).isDisplayed(); }
    public Boolean secondExtrasTabsIsDisplayed(){ return this.extrasElements.extrasTabs.get(1).isDisplayed(); }
    public Boolean balanceLabelIsDisplayed(){ return this.extrasElements.balanceLabel.isDisplayed(); }
    public Boolean balanceIsDisplayed(){ return this.extrasElements.balance.isDisplayed(); }
    public Boolean walletLogoIsDisplayed(){ return this.extrasElements.walletLogo.isDisplayed(); }
    public Boolean walletDescriptionIsDisplayed(){ return this.extrasElements.walletDescription.isDisplayed(); }
    public Boolean donateTabIsDisplayed(){ return this.extrasElements.donateTab.isDisplayed(); }
    public Boolean addMoneyTabIsDisplayed(){ return this.extrasElements.addMoneyTab.isDisplayed(); }

    public Boolean addFundsInputIsDisplayed(){ return this.extrasElements.addFundsInput.isDisplayed(); }
    public Boolean addMoneyButtonIsDisplayed(){ return this.extrasElements.addMoneyButton.isDisplayed(); }
    public Boolean previousScreenButtonIsDisplayed(){ return this.extrasElements.previousScreenButton.isDisplayed(); }
    public Boolean nextScreenButtonIsDisplayed(){ return this.extrasElements.nextScreenButton.isDisplayed(); }
    public Boolean donationInputIsDisplayed(){ return this.extrasElements.donationInput.isDisplayed(); }
    public Boolean donateTitleIsDisplayed(){ return this.extrasElements.donateTitle.isDisplayed(); }

    public Boolean donationEventNameIsDisplayed(){ return this.extrasElements.donationEventName.isDisplayed(); }
    public Boolean donationMessageIsDisplayed(){ return this.extrasElements.donationMessage.isDisplayed(); }
    public Boolean donationButtonsContainerIsDisplayed(){ return this.extrasElements.donationButtonsContainer.isDisplayed(); }
    public Boolean addDonationButtonIsDisplayed(){ return this.extrasElements.addDonationButton.isDisplayed(); }
    public Boolean resetDonationButtonIsDisplayed(){ return this.extrasElements.resetDonationButton.isDisplayed(); }
    public Boolean button20$IsDisplayed(){ return this.extrasElements.donationButtons.get(0).isDisplayed(); }
    public Boolean button35$IsDisplayed(){ return this.extrasElements.donationButtons.get(1).isDisplayed(); }
    public Boolean button50$IsDisplayed(){ return this.extrasElements.donationButtons.get(2).isDisplayed(); }
    public Boolean button100$IsDisplayed(){ return this.extrasElements.donationButtons.get(3).isDisplayed(); }



    public Boolean isAtTExtrasTab() {return this.wait.until((d) -> this.extrasElements.walletLogo.isDisplayed()); }

}
