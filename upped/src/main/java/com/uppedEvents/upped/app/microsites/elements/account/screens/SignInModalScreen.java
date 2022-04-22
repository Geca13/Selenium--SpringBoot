package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.SignInModalElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignInModalScreen extends Base {

    @Autowired
    SignInModalElements elements;

    public void signInWithGoogleIsDisplayed() { this.elements.signInWithGoogleButton.isDisplayed(); }
    public void signInWithFacebookIsDisplayed() { this.elements.signInWithFacebookButton.isDisplayed(); }
    public void emailInputIsDisplayed() { this.elements.emailInput.isDisplayed(); }
    public void passwordInputIsDisplayed() { this.elements.passwordInput.isDisplayed(); }
    public void signInButtonIsDisplayed() { this.elements.signInButton.isDisplayed(); }
    public void headerIsDisplayed() { this.elements.header.isDisplayed(); }
    public void closePopupModalIsDisplayed() { this.elements.closeButton.isDisplayed(); }
    public void newToUppedTextIsDisplayed() { this.elements.linkDescription.isDisplayed();}
    public void createAccountLinkIsDisplayed() { this.elements.createAccountLink.isDisplayed();}
    public void rememberCheckboxIsDisplayed() { this.elements.rememberCheckbox.isDisplayed();}
    public void rememberMeLabelIsDisplayed() { this.elements.rememberMeLabel.isDisplayed();}
    public void forgotPasswordLinkIsDisplayed() { this.elements.forgotPasswordLink.isDisplayed();}
    public void emailValidationMessageIsDisplayed() { this.elements.emailValidationMessage.isDisplayed();}
    public void passwordValidationMessageIsDisplayed() { this.elements.passwordValidationMessage.isDisplayed();}
    public void toastBannerIsDisplayed() { this.elements.toastBanner.isDisplayed();}
    public void toastTitlesDisplayed() { this.elements.toastTitle.isDisplayed();}
    public void toastMessageIsDisplayed() { this.elements.toastMessage.isDisplayed();}
    public Boolean isAtSignInModal() {return this.wait.until((d) -> this.elements.signInButton.isDisplayed()); }

}
