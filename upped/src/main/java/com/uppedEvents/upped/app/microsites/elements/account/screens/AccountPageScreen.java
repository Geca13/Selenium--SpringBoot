package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.elements.AccountPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountPageScreen extends Base {

    @Autowired
    AccountPageElements elements;
    @Autowired
    Methods methods;

    public Boolean isAtAccountPage() { return this.wait.until((d) -> this.elements.imageAvatar.isDisplayed()); }

    public Boolean pageHeaderIsDisplayed() { return this.elements.header.isDisplayed();}
    public Boolean fullNameIsDisplayed() { return this.elements.fullName.isDisplayed();}
    public Boolean emailLabelIsDisplayed() { return this.elements.emailAddressLabel.isDisplayed();}
    public Boolean phoneNumberLabelIsDisplayed() { return this.elements.phoneNumberLabel.isDisplayed();}
    public Boolean locationLabelIsDisplayed() { return this.elements.locationLabel.isDisplayed();}

    public Boolean editProfileButtonIsDisplayed() { return this.elements.editProfileButton.isDisplayed();}
    public Boolean logoffButtonIsDisplayed() { return this.elements.logoffButton.isDisplayed();}
    public Boolean myPurchasesCardIsDisplayed() { return this.elements.accountCards.get(0).isDisplayed();}
    public Boolean myWishlistCardIsDisplayed() { return this.elements.accountCards.get(1).isDisplayed();}
    public Boolean myWalletCardIsDisplayed() { return this.elements.accountCards.get(2).isDisplayed();}

    public Boolean myPurchaseButtonIsDisplayed() { return this.elements.myPurchasesButton.isDisplayed();}
    public Boolean myWishlistButtonIsDisplayed() { return this.elements.myWishlistButton.isDisplayed();}
    public Boolean myWalletButtonIsDisplayed() { return this.elements.myWalletButton.isDisplayed();}

    public Boolean myPurchasesIconIsDisplayed() { return this.elements.cardsIcons.get(0).isDisplayed();}
    public Boolean myWishlistIconIsDisplayed() { return this.elements.cardsIcons.get(1).isDisplayed();}
    public Boolean myWalletIconIsDisplayed() { return this.elements.cardsIcons.get(2).isDisplayed();}

    public Boolean myPurchasesDescriptionIsDisplayed() { return this.elements.cardsDescriptions.get(0).isDisplayed();}
    public Boolean myWishlistDescriptionIsDisplayed() { return this.elements.cardsDescriptions.get(1).isDisplayed();}
    public Boolean myWalletDescriptionIsDisplayed() { return this.elements.cardsDescriptions.get(2).isDisplayed();}

    public Boolean myPurchasesCardTitleIsDisplayed() { return this.elements.cardsTitles.get(0).isDisplayed();}
    public Boolean myWishlistCardTitleIsDisplayed() { return this.elements.cardsTitles.get(1).isDisplayed();}
    public Boolean myWalletCardTitleIsDisplayed() { return this.elements.cardsTitles.get(2).isDisplayed();}

    public Boolean emailIsDisplayed() { return this.methods.findSecondChildElement(this.elements.profileData.get(0)).isDisplayed();}
    public Boolean phoneNumberIsDisplayed() { return this.methods.findSecondChildElement(this.elements.profileData.get(1)).isDisplayed();}
    public Boolean addressIsDisplayed() { return this.methods.findSecondChildElement(this.elements.profileData.get(2)).isDisplayed();}


}
