package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.EmbedPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmbedPageActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    EmbedPageElements elements;

    public void clickNextButton() {this.methods.clickElement(this.elements.nextButton);}
    public void clickPreviousButton() {this.methods.clickElement(this.elements.previousButton);}
    public void clickTicketTermsButton() {this.methods.clickElement(this.elements.ticketTermsButton);}
    public void clickTicketTermsCloseButton() {this.methods.clickElement(this.elements.termsCloseButton);}
    public void clickApplyDiscountButton() {this.methods.clickElement(this.elements.applyDiscountButton);}
    public void clickRemoveDiscountIcon() {this.methods.clickElement(this.elements.discountTrashIcon);}
    public void enterPromotionCode() { this.methods.sendKeysToElement(this.elements.discountInput,"PROMO1");}


}
