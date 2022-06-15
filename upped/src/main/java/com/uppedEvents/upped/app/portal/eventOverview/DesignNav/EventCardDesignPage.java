package com.uppedEvents.upped.app.portal.eventOverview.DesignNav;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventCardDesignPage extends Base {

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadPhotoInput;

    @FindBy(xpath = "//*[text()='Save ']")
    public WebElement saveEventCardButton;

    @FindBy(xpath = "//*[text()=' Set ']")
    public WebElement setImageButton;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelImageButton;

    @FindBy(className = "preview-img")
    public WebElement imagePreview;

    @FindBy(className = "img-featured")
    public WebElement featuredImage;

    @FindBy(tagName = "select")
    public WebElement templateSelectorDropdown;

    @FindBy(tagName = "option")
    public List<WebElement> templateSelectorOptions;

    @FindBy(tagName = "app-image-focus")
    public WebElement imageCropModal;


}
