package com.uppedEvents.upped.app.embed.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ForgotPasswordPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordActions extends Base {

    @Autowired
    Methods methods;

    @Autowired
    ForgotPasswordPageElements elements;

    public Boolean isAtForgotPasswordPage(){return this.methods.isAtPage(this.elements.submitButton);}
    public void clickSubmitButton() { this.methods.clickElement(this.elements.submitButton); }
    public void clickLoginLink() { this.methods.clickElement(this.elements.loginLink); }
    public void enterEmailIntoEmailInput(){ this.methods.sendKeysToElement(this.elements.emailInput,"parma156@parma.it"); }


}
