package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.PayPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayPage extends Base {

    @Autowired
    PayPageElements elements;
    @Autowired
    Methods methods;

    public Boolean payContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payOptionsContainer);}
    public Boolean savedCardsTitleIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.savedCardsTitle);}
    public Boolean payWithServiceTitleIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithServiceTitle);}
    public Boolean firstSavedCardIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.savedCards.get(0));}
    public Boolean firstCardNumberIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.cardsNumbers.get(0));}
    public Boolean payWithWalletButtonOptionIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithWalletButtonOption);}
    public Boolean payWithWalletButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithWalletButton);}
    public Boolean payWithCardButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithCardButton);}
    public Boolean payWithCardTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithCardTab);}
    public Boolean payWithNewCardTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.payWithNewCardTab);}

    public Boolean cardHolderNameLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(0));}
    public Boolean cardNumberLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(1));}
    public Boolean cvvLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(2));}
    public Boolean expMonthLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(3));}
    public Boolean expYearLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(4));}
    public Boolean streetAddressLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(5));}
    public Boolean countryLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(6));}
    public Boolean stateLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(7));}
    public Boolean zipCodeLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.labels.get(8));}

    public Boolean cardHolderNameInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.cardHolderNameInput);}
    public Boolean cardNumberInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.cardNumberInput);}
    public Boolean saveCardCheckboxIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.saveCardCheckbox);}
    public Boolean cvcIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.cvc);}
    public Boolean streetAddressIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.streetAddress);}
    public Boolean zipCodeIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.zipCode);}
    public Boolean monthSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.monthSelect);}
    public Boolean yearSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.yearSelect);}
    public Boolean countrySelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.countrySelect);}
    public Boolean stateSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.stateSelect);}
}
