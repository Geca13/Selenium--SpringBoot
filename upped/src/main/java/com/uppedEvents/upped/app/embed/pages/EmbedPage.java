package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.EmbedPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmbedPage extends Base {

    @Autowired
    EmbedPageElements elements;

    @Autowired
    Methods methods;


    public Boolean iFrameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.iframe); }
    public Boolean bannerIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.banner); }
    public Boolean headerTextIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.headerText); }
    public Boolean eventNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.eventName); }
    public Boolean loggedInUserTextIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.loggedInUserText); }
    public Boolean changeUserLinkIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.changeUserLink); }
    public Boolean loginInfoMessageIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.loginInfoMessage); }
    public Boolean loginLinkIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.loginLink); }
    public Boolean totalsContainerIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.totalsContainer); }
    public Boolean subtotalTextIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.mini.get(1))); }
    public Boolean subtotalAmountIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findSecondChildElement(this.elements.mini.get(1))); }
    public Boolean taxesTextIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.taxesAndFeesContainers.get(0)); }
    public Boolean taxesIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.taxesAndFeesContainers.get(0))); }
    public Boolean taxesAmountIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findSecondChildElement(this.elements.mini.get(1))); }
    public Boolean feesTextIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.taxesAndFeesContainers.get(1)); }
    public Boolean feesIconIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.taxesAndFeesContainers.get(1))); }
    public Boolean feesAmountIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findSecondChildElement(this.elements.mini.get(2))); }
    public Boolean discountTextIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.mini.get(3))); }
    public Boolean discountTrashIconIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.discountTrashIcon); }
    public Boolean discountAmountIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findSecondChildElement(this.elements.mini.get(3))); }
    public Boolean totalDueTextIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findFirstChildElement(this.elements.grandTotal)); }
    public Boolean totalDueAmountIsDisplayed() { return this.methods.elementIsDisplayed(this.methods.findSecondChildElement(this.elements.grandTotal)); }
    public Boolean ticketTermsButtonIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.ticketTermsButton); }
    public Boolean nextButtonIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.nextButton); }
    public Boolean previousButtonIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.previousButton); }
    public Boolean termsCloseButtonIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsCloseButton); }
    public Boolean termsEventsNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsEventsName); }
    public Boolean termsPopupTitleIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsPopupTitle); }
    public Boolean termsPopupHeaderImageIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsPopupHeaderImage); }
    public Boolean termsPopupHeaderIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsPopupHeader); }
    public Boolean termsPopupIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.termsPopup); }
    public Boolean stepsContainerIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperWrapper); }
    public Boolean firstTermIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.terms.get(0)); }
    public Boolean secondTermIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.terms.get(1)); }
    public Boolean thirdTermIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.terms.get(2)); }
    public Boolean ticketsStepNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepName.get(0)); }
    public Boolean loginStepNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepName.get(1)); }
    public Boolean extrasStepNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepName.get(2)); }
    public Boolean payStepNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepName.get(3)); }
    public Boolean confirmStepNameIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepName.get(4)); }
    public Boolean ticketsStepCounterIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperCounter.get(0)); }
    public Boolean loginStepCounterIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperCounter.get(1)); }
    public Boolean extrasStepCounterIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperCounter.get(2)); }
    public Boolean payStepCounterIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperCounter.get(3)); }
    public Boolean confirmStepCounterIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepperCounter.get(4)); }
    public Boolean ticketsStepCompletedIconIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepCompletedIcon.get(0)); }
    public Boolean loginStepCompletedIconIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepCompletedIcon.get(1)); }
    public Boolean extrasStepCompletedIconIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepCompletedIcon.get(2)); }
    public Boolean payStepCompletedIconIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepCompletedIcon.get(3)); }
    public Boolean confirmStepCompletedIconIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.stepCompletedIcon.get(4)); }
    public Boolean applyDiscountButtonIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.applyDiscountButton); }
    public Boolean discountInputIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.discountInput); }
    public Boolean discountCodeLabelIsDisplayed(){ return this.methods.elementIsDisplayed(this.elements.discountCodeLabel); }
}
