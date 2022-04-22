package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.MyWalletScreenElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWalletScreen extends Base {

    @Autowired
    MyWalletScreenElements elements;

    @Autowired
    Methods methods;

    public Boolean walletLogoIsDisplayed() { return this.elements.walletLogoContainer.isDisplayed(); }
    public Boolean uppedWalletLogoTextIsDisplayed() { return this.elements.logoTextDetails.get(0).isDisplayed(); }
    public Boolean uppedWalletLogoAmountIsDisplayed() { return this.elements.logoTextDetails.get(1).isDisplayed(); }
    public Boolean walletAmountTitleIsDisplayed() { return this.elements.sectionTitles.get(0).isDisplayed(); }
    public Boolean paymentOptionTitleIsDisplayed() { return this.elements.sectionTitles.get(1).isDisplayed(); }
    public Boolean addNewPaymentOptionTitleIsDisplayed() { return this.elements.sectionTitles.get(2).isDisplayed(); }
    public Boolean paymentOptionSubTitleIsDisplayed() { return this.elements.sectionSubtitles.get(0).isDisplayed(); }
    public Boolean addNewPaymentOptionSubTitleIsDisplayed() { return this.elements.sectionSubtitles.get(1).isDisplayed(); }
    public Boolean walletBalanceIsDisplayed() { return this.elements.walletBalance.isDisplayed(); }
    public Boolean getFirstDescriptionLine() {
        return this.methods.findFirstChildElement(this.elements.detailsContainer).isDisplayed() ;
    }
    public Boolean getSecondDescriptionLine() {
        return this.methods.findSecondChildElement(this.elements.detailsContainer).isDisplayed() ;
    }
    public Boolean getEnterValueInput() {
        return this.methods.findFirstChildElement(this.elements.addMoneyContainer).isDisplayed() ;
    }
    public Boolean getAddMoneyButton() {
        return this.methods.findSecondChildElement(this.elements.addMoneyContainer).isDisplayed() ;
    }
    public Boolean fullPaymentCardIsDisplayed() { return this.elements.fullCardContainers.get(0).isDisplayed(); }
    public Boolean firstCardInfoIsDisplayed() { return this.elements.cards.get(0).isDisplayed(); }
    public Boolean firstDeleteButtonIsDisplayed() { return this.elements.deleteButtons.get(0).isDisplayed(); }
    public Boolean cardHolderNameLabelIsDisplayed() { return this.elements.labels.get(0).isDisplayed(); }
    public Boolean cardNumberLabelIsDisplayed() { return this.elements.labels.get(1).isDisplayed(); }
    public Boolean cvcLabelIsDisplayed() { return this.elements.labels.get(2).isDisplayed(); }
    public Boolean expirationMonthLabelIsDisplayed() { return this.elements.labels.get(3).isDisplayed(); }
    public Boolean expirationYearLabelIsDisplayed() { return this.elements.labels.get(4).isDisplayed(); }
    public Boolean streetAddressLabelIsDisplayed() { return this.elements.labels.get(5).isDisplayed(); }
    public Boolean countryLabelIsDisplayed() { return this.elements.labels.get(6).isDisplayed(); }
    public Boolean stateLabelIsDisplayed() { return this.elements.labels.get(7).isDisplayed(); }
    public Boolean zipCodeLabelIsDisplayed() { return this.elements.labels.get(8).isDisplayed(); }

    public Boolean cardHolderNameInput() { return this.elements.cardHolderName.isDisplayed(); }
    public Boolean cardNumberInput() { return this.elements.cardNumber.isDisplayed(); }
    public Boolean cvcInput() { return this.elements.cvc.isDisplayed(); }
    public Boolean streetAddressInput() { return this.elements.streetAddress.isDisplayed(); }
    public Boolean zipCodeInput() { return this.elements.zipCode.isDisplayed(); }
    public Boolean monthSelect() { return this.elements.monthSelect.isDisplayed(); }
    public Boolean yearSelect() { return this.elements.yearSelect.isDisplayed(); }
    public Boolean countrySelect() { return this.elements.countrySelect.isDisplayed(); }
    public Boolean stateSelect() { return this.elements.stateSelect.isDisplayed(); }
    public Boolean addCardButton() { return this.elements.addCardButton.isDisplayed(); }

    public Boolean cardsChevronUpIconIsDisplayed() { return this.elements.chevronUp.get(0).isDisplayed(); }
    public Boolean addNewCardChevronUpIconIsDisplayed() { return this.elements.chevronUp.get(1).isDisplayed(); }
    public Boolean cardsChevronDownIconIsDisplayed() { return this.elements.chevronDown.get(0).isDisplayed(); }
    public Boolean addNewCardChevronDownIconIsDisplayed() { return this.elements.chevronDown.get(1).isDisplayed(); }
}
