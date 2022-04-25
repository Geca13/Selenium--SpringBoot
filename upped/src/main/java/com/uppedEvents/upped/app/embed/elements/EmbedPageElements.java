package com.uppedEvents.upped.app.embed.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmbedPageElements extends Base {

    @FindBy(id = "uwWidget")
    public WebElement iframe;

    @FindBy(className = "event-header")
    public WebElement banner;

    @FindBy(className = "event-info")
    public WebElement headerText;

    @FindBy(className = "event-title")
    public WebElement eventName;

    @FindBy(className = "title-desc")
    public WebElement loggedInUserText;

    @FindBy(className = "change")
    public WebElement changeUserLink;

    @FindBy(className = "message-text")
    public WebElement loginInfoMessage;

    @FindBy(className = "login-link")
    public WebElement loginLink;

    @FindBy(className = "totals-container")
    public WebElement totalsContainer;

    @FindBy(className = "mini-total")
    public List<WebElement> mini;

    @FindBy(className = "grand-total")
    public WebElement grandTotal;

    @FindBy(className = "terms-btn")
    public WebElement ticketTermsButton;

    @FindBy(className = "terms-container")
    public WebElement termsPopup;

    @FindBy(className = "header")
    public WebElement termsPopupHeader;

    @FindBy(className = "terms-img")
    public WebElement termsPopupHeaderImage;

    @FindBy(className = "title")
    public WebElement termsPopupTitle;

    @FindBy(className = "content-title")
    public WebElement termsEventsName;

    @FindBy(className = "terms-close-btn")
    public WebElement termsCloseButton;

    @FindBy(className = "content")
    public WebElement terms;

    @FindBy(xpath = "//*[text()='Next']")
    public WebElement nextButton;

    @FindBy(xpath = "//*[text()=' Previous ']")
    public WebElement previousButton;

    @FindBy(className = "stepper-wrapper")
    public WebElement stepperWrapper;

    @FindBy(className = "stepper-item")
    public List<WebElement>  stepperItem;

    @FindBy(className = "step-counter")
    public List<WebElement>  stepperCounter;

    @FindBy(className = "step_completed")
    public List<WebElement>  stepCompletedIcon;

    @FindBy(className = "step-name")
    public List<WebElement>  stepName;

    @FindBy(css = "div[tooltipclass=maxWidthInitial]")
    public List<WebElement> taxesAndFeesContainers;

    @FindBy(className = "fa-trash")
    public WebElement discountTrashIcon;

    @FindBy(xpath = "//*[text()='Apply']")
    public WebElement applyDiscountButton;

    @FindBy(className = "discount")
    public WebElement discountInput;

    @FindBy(xpath = "//*[text()='Discount Code ']")
    public WebElement discountCodeLabel;
}
