package com.uppedEvents.upped.app.embed.pages;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.embed.elements.ExtrasPageElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExtrasPage extends Base {

    @Autowired
    ExtrasPageElements elements;

    @Autowired
    Methods methods;

    public Boolean addMoneyTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.addMoneyTab); }
    public Boolean donateTabIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.donateTab); }
    public Boolean walletContainerIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.walletContainer); }
    public Boolean walletLogoIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.walletLogo); }
    public Boolean walletInfoIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.walletInfo); }
    public Boolean balanceLabelIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.balanceLabel); }
    public Boolean balanceIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.balance); }
    public Boolean balanceSubtitleIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.balanceSubtitle); }
    public Boolean enterValueInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.enterValueInput.get(0)); }
    public Boolean addMoneyButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.addMoneyButton); }
    public Boolean donateHeadingIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.donateHeading); }
    public Boolean donateToHeaderIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,1));}
    public Boolean eventNameIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,3));}
    public Boolean donateMessageIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,4));}
    public Boolean otherTextIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,6));}
    public Boolean usdTextIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,8));}
    public Boolean minimumDonationIsDisplayed() {
        return this.methods.elementIsDisplayed(this.methods.returnFirstLevelChildByIndex(this.elements.donateTextContainer,9));}
    public Boolean resetDonationButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.resetDonation); }
    public Boolean addDonationButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.addDonation); }
    public Boolean $20ButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.$20Button); }
    public Boolean $35ButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.$35Button); }
    public Boolean $50ButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.$50Button); }
    public Boolean $100ButtonIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.$100Button); }
    public Boolean donateInputIsDisplayed() { return this.methods.elementIsDisplayed(this.elements.donateInput); }

}
