package com.uppedEvents.upped.app.micro.components;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ConfirmTab extends Base {

    @FindBy(className = "box-container")
    public WebElement confirmAndShareTab;

    @FindBy(className = "title")
    public WebElement thankYouMessage;

    @FindBy(className = "subtitle")
    public WebElement confirmationMessage;

    @FindBy(className = "total-amt")
    public WebElement totalAmount;

    @FindBy(xpath = "//*[text()='View Receipt']")
    public WebElement viewReceiptButton;

    @FindBy(xpath = "//*[text()='Share on Facebook']")
    public WebElement shareButton;


}
