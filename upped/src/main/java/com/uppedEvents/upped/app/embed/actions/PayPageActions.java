package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.PayPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    PayPageElements elements;

    public Boolean waitForPayWithWalletButton(){return this.methods.isAtPage(this.elements.payWithWalletButton);}
    public Boolean isAtPayPage(){return this.methods.isAtPage(this.elements.payWithNewCardTab);}
    public void clickPayWithCardOrServiceTab() { this.methods.clickElement(this.elements.payWithCardTab); }
    public void clickPayWithNewCardTab() { this.methods.clickElement(this.elements.payWithNewCardTab); }
    public void clickFirstSavedPaymentCard() { this.methods.clickElement(this.elements.savedCards.get(0));}
    public void enterFirstAndLastName() {
        this.methods.sendKeysToElement(this.elements.cardHolderNameInput,
                this.methods.generateRandom6LetterString() + " " + this.methods.generateRandom9LetterString());
    }
    public void enterCardNumber() { this.methods.sendKeysToElement(this.elements.cardNumberInput,"4111111111111111"); }
    public void enterCvv() { this.methods.sendKeysToElement(this.elements.cvc,"900"); }
    public void enterMonth() { this.methods.sendKeysToElement(this.elements.monthSelect,"4"); }
    public void enterYear() { this.methods.sendKeysToElement(this.elements.yearSelect,"2025"); }
    public void enterStreetAddressAndNumber() { this.methods.sendKeysToElement(this.elements.streetAddress,
           "Main Street " + this.methods.generateRandom5NumbersString());
    }
    public void enterCountry() { this.methods.sendKeysToElement(this.elements.countrySelect,"United States"); }
    public void enterState() { this.methods.sendKeysToElement(this.elements.countrySelect,"Minnesota"); }
    public void enterZipCode() { this.methods.sendKeysToElement(this.elements.zipCode,this.methods.generateRandom5NumbersString()); }
    public void clickSaveCardCheckbox() { this.methods.clickElement(this.elements.saveCardCheckbox); }
    public void clickPayWithCardButton() { this.methods.clickElement(this.elements.payWithCardButton); }
    public void clickPayWithWalletOptionButton() { this.methods.clickElement(this.elements.payWithWalletButtonOption); }
    public void clickPayWithWalletButton() { this.methods.clickElement(this.elements.payWithWalletButton); }






}
