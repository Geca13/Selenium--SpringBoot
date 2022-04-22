package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.PayTabElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayTab extends Base {

    @Autowired
    PayTabElements payElements;

    public PayTabElements getPayElements() {
        return payElements;
    }

    public Boolean payOptionsContainerIsDisplayed() { return this.payElements.payOptionsContainer.isDisplayed(); }
    public Boolean savedCardsTitleIsDisplayed() { return this.payElements.savedCardsTitle.isDisplayed(); }
    public Boolean payWithServiceTitleIsDisplayed() { return this.payElements.payWithServiceTitle.isDisplayed(); }
    public Boolean firstSavedCardIsDisplayed() { return this.payElements.savedCards.get(0).isDisplayed(); }
    public Boolean firstSavedCardBrandIsDisplayed() { return this.payElements.cardsNames.get(0).isDisplayed(); }
    public Boolean payWithWalletButtonOptionIsDisplayed() { return this.payElements.payWithWalletButtonOption.isDisplayed(); }
    public Boolean payWithWalletButtonIsDisplayed() { return this.payElements.payWithWalletButton.isDisplayed(); }
    public Boolean payWithCardButtonIsDisplayed() { return this.payElements.payWithCardButton.isDisplayed(); }
    public Boolean nextButtonIsDisplayed() { return this.payElements.nextButton.isDisplayed(); }
    public Boolean previousButtonIsDisplayed() { return this.payElements.previousButton.isDisplayed(); }
    public Boolean payWithCardTabIsDisplayed() { return this.payElements.payWithCardTab.isDisplayed(); }
    public Boolean payWithNewCardTabIsDisplayed() { return this.payElements.payWithNewCardTab.isDisplayed(); }

    public Boolean cardHolderNameLabelIsDisplayed() { return this.payElements.labels.get(0).isDisplayed(); }
    public Boolean cardNumberLabelIsDisplayed() { return this.payElements.labels.get(1).isDisplayed(); }
    public Boolean cvvLabelIsDisplayed() { return this.payElements.labels.get(2).isDisplayed(); }
    public Boolean expirationMonthLabelIsDisplayed() { return this.payElements.labels.get(3).isDisplayed(); }
    public Boolean expirationYearLabelIsDisplayed() { return this.payElements.labels.get(4).isDisplayed(); }
    public Boolean streetNameLabelIsDisplayed() { return this.payElements.labels.get(5).isDisplayed(); }
    public Boolean countryLabelIsDisplayed() { return this.payElements.labels.get(6).isDisplayed(); }
    public Boolean stateLabelIsDisplayed() { return this.payElements.labels.get(7).isDisplayed(); }
    public Boolean zipCodeLabelIsDisplayed() { return this.payElements.labels.get(8).isDisplayed(); }

    public Boolean cardHolderNameInputIsDisplayed() { return this.payElements.nameInput.isDisplayed(); }
    public Boolean cardNumberInputIsDisplayed() { return this.payElements.cardNumberInput.isDisplayed(); }
    public Boolean saveCardCheckboxIsDisplayed() { return this.payElements.saveCardCheckbox.isDisplayed(); }
    public Boolean cvvInputIsDisplayed() { return this.payElements.cvc.isDisplayed(); }
    public Boolean streetNameInputIsDisplayed() { return this.payElements.streetAddress.isDisplayed(); }
    public Boolean zipCodeInputIsDisplayed() { return this.payElements.zipCode.isDisplayed(); }

    public Boolean monthInputIsDisplayed() { return this.payElements.monthSelect.isDisplayed(); }
    public Boolean yearInputIsDisplayed() { return this.payElements.yearSelect.isDisplayed(); }
    public Boolean countryInputIsDisplayed() { return this.payElements.stateSelect.isDisplayed(); }
    public Boolean stateInputIsDisplayed() { return this.payElements.countrySelect.isDisplayed(); }

    public Boolean isAtPayTab() {return this.wait.until((d) -> this.payElements.payOptionsContainer.isDisplayed()); }
    public Boolean isAtNewCardTab() {return this.wait.until((d) -> this.payElements.labels.get(0).isDisplayed()); }

    public Boolean walletButtonIsVisible() {return this.wait.until((d) -> this.payElements.payWithWalletButton.isDisplayed()); }
    public Boolean payWithCardButtonIsVisible() {return this.wait.until((d) -> this.payElements.payWithCardButton.isDisplayed()); }

}
