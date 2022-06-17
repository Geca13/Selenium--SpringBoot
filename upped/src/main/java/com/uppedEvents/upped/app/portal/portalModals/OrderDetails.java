package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDetails extends Base {

    @FindBy(tagName = "order-details-popup")
    public WebElement orderDetailsPopup;

    @FindBy(className = "popup-close")
    public WebElement closeDetailsPopup;

    @FindBy(xpath = "//*[text()='Refund tickets']")
    public WebElement refundTicketsButton;

    @FindBy(xpath = "//*[text()='Resend tickets']")
    public WebElement resendTicketsButton;

    @FindBy(className = "collapsable")
    public List<WebElement> refundTicketsDropdown;

    @FindBy(xpath = "//tr//td//div//label")
    public List<WebElement> ticketRefundCheckbox;

    @FindBy(xpath = "//td//div/input")
    public List<WebElement> refundAmountInput;

    @FindBy(xpath = "//*[text()='Process']")
    public WebElement processRefundButton;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement cancelRefundButton;

    @FindBy(xpath = "//label[@for='hptype-reinstate']")
    public WebElement reinstateRadioLabel;

    @FindBy(xpath = "//label[@for='hptype-void']")
    public WebElement voidRadioLabel;

    @FindBy(xpath = "//label[@for='hptype-nothing']")
    public WebElement nothingRadioLabel;

    @FindBy(xpath = "//input[@name='fixed']")
    public WebElement fixedTotalRefundInput;

    @FindBy(xpath = "//input[@name='percent']")
    public WebElement percentTotalRefundInput;

    @FindBy(xpath = "//*[text()='Previous Orders']")
    public WebElement previousOrdersOption;

    @FindBy(xpath = "//table/tr")
    public WebElement orderDetailsModalTotal;
}
