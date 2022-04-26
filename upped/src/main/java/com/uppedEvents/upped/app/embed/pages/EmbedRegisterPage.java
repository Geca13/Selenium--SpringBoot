package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.EmbedRegisterPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmbedRegisterPage extends Base {

    @Autowired
    Methods methods;

    @Autowired
    EmbedRegisterPageElements elements;

    public Boolean isAtRegisterPage(){return this.methods.isAtPage(this.elements.createPageTitle);}
    public Boolean createPageTitleIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.createPageTitle); }
    public Boolean createPageTitleSubtitleIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.createPageTitleSubtitle); }
    public Boolean signInLinkIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.signInLink); }
    public Boolean firstNameLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.firstNameLabel); }
    public Boolean lastNameLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.lastNameLabel); }
    public Boolean dateOfBirthLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.dateOfBirthLabel); }
    public Boolean genderLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.genderLabel); }
    public Boolean emailLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.emailLabel); }
    public Boolean passwordLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.passwordLabel); }
    public Boolean verifyPassLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.verifyPassLabel); }
    public Boolean createAccountButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.createAccountButton); }
    public Boolean backToLoginButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.backToLoginButton); }
    public Boolean firstNameInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.firstNameInput); }
    public Boolean lastNameInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.lastNameInput); }
    public Boolean birthdayInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.birthdayInput); }
    public Boolean genderSelectIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.genderSelect); }
    public Boolean passwordInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.passwordInput); }
    public Boolean emailInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.emailInput); }
    public Boolean confirmPassInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.confirmPassInput); }

    public Boolean firstNameValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.firstNameRequired); }
    public Boolean lastNameValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.lastNameRequired); }
    public Boolean birthdayValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.dateIsRequired); }
    public Boolean passwordValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.passwordIsRequired); }
    public Boolean emailValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.emailIsRequired); }
    public Boolean confirmPassValidationIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.verifyPassRequired); }
}
