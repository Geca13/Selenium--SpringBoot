package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.EditProfilePageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditProfileScreen extends Base {

    @Autowired
    EditProfilePageElements elements;
    @Autowired
    Methods methods;

    public Boolean firstNameLabelIsDisplayed(){ return this.elements.firstNameLabel.isDisplayed(); }
    public Boolean lastNameLabelIsDisplayed(){ return this.elements.lastNameLabel.isDisplayed(); }
    public Boolean emailAddressLabelIsDisplayed(){ return this.elements.emailAddressLabel.isDisplayed(); }
    public Boolean passwordLabelIsDisplayed(){ return this.elements.passwordLabel.isDisplayed(); }

    public Boolean genderLabelIsDisplayed(){ return this.elements.genderLabel.isDisplayed(); }
    public Boolean dobLabelIsDisplayed(){ return this.elements.dobLabel.isDisplayed(); }
    public Boolean phoneLabelIsDisplayed(){ return this.elements.phoneLabel.isDisplayed(); }
    public Boolean addressLabelIsDisplayed(){ return this.elements.addressLabel.isDisplayed(); }

    public Boolean countryLabelIsDisplayed(){ return this.elements.countryLabel.isDisplayed(); }
    public Boolean stateLabelIsDisplayed(){ return this.elements.stateLabel.isDisplayed(); }
    public Boolean cityLabelIsDisplayed(){ return this.elements.cityLabel.isDisplayed(); }
    public Boolean zipCodeLabelIsDisplayed(){ return this.elements.zipCodeLabel.isDisplayed(); }

    public Boolean saveProfileButtonIsDisplayed(){ return this.elements.saveProfileButton.isDisplayed(); }
    public Boolean editEmailButtonIsDisplayed(){ return this.elements.editEmailButton.isDisplayed(); }
    public Boolean firstNameInputIsDisplayed(){ return this.elements.firstNameInput.isDisplayed(); }
    public Boolean lastNameInputIsDisplayed(){ return this.elements.lastNameInput.isDisplayed(); }

    public Boolean emailInputIsDisplayed(){ return this.elements.emailInput.isDisplayed(); }
    public Boolean passwordInputIsDisplayed(){ return this.elements.passwordInput.isDisplayed(); }
    public Boolean dobSelectIsDisplayed(){ return this.elements.dobSelect.isDisplayed(); }
    public Boolean genderSelectIsDisplayed(){ return this.elements.genderSelect.isDisplayed(); }

    public Boolean phoneInputIsDisplayed(){ return this.elements.phoneInput.isDisplayed(); }
    public Boolean addressInputIsDisplayed(){ return this.elements.addressInput.isDisplayed(); }
    public Boolean countrySelectIsDisplayed(){ return this.elements.countrySelect.isDisplayed(); }
    public Boolean stateSelectIsDisplayed(){ return this.elements.stateSelect.isDisplayed(); }

    public Boolean zipCodeInputIsDisplayed(){ return this.elements.zipCodeInput.isDisplayed(); }
    public Boolean changeEmailModalIsDisplayed(){ return this.elements.changeEmailModal.isDisplayed(); }
    public Boolean changeEmailModalHeaderIsDisplayed(){ return this.elements.changeEmailModalHeader.isDisplayed(); }
    public Boolean verificationDescriptionIsDisplayed(){ return this.elements.verificationDescription.isDisplayed(); }

    public Boolean saveButtonIsDisplayed(){ return this.elements.saveButton.isDisplayed(); }
    public Boolean cancelButtonIsDisplayed(){ return this.elements.cancelButton.isDisplayed(); }

    public Boolean changeEmailModalEmailInputLabelIsDisplayed() { return this.methods.findSecondChildElement(this.elements.inputContainers.get(0)).isDisplayed(); }
    public Boolean changeEmailModalCurrentPasswordInputLabelIsDisplayed() { return this.methods.findSecondChildElement(this.elements.inputContainers.get(1)).isDisplayed(); }
    public Boolean changeEmailModalRetypePasswordInputLabelIsDisplayed() { return this.methods.findSecondChildElement(this.elements.inputContainers.get(2)).isDisplayed(); }

    public Boolean changeEmailModalEmailInputIsDisplayed() { return this.methods.findFirstChildElement(this.elements.inputContainers.get(0)).isDisplayed(); }
    public Boolean changeEmailModalCurrentPasswordInputIsDisplayed() { return this.methods.findFirstChildElement(this.elements.inputContainers.get(1)).isDisplayed(); }
    public Boolean changeEmailModalRetypePasswordInputIsDisplayed() { return this.methods.findFirstChildElement(this.elements.inputContainers.get(2)).isDisplayed(); }

}
