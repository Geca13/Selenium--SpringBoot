package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddLayerOnMap extends Base {

    @Autowired
    SetNewImage newImage;

    @FindBy(className = "popup-header-title")
    public WebElement addLayerModal;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement closeButton;

    @FindBy(xpath = "//input[@formcontrolname='title']")
    public WebElement titleInput;

    @FindBy(xpath = "//button[@title='Select category']")
    public WebElement categorySelect;

    @FindBy(xpath = "//select[@title='Select Option']")
    public List<WebElement> locationOfferingSelect;   //index 1

    @FindBy(xpath = "//*[text()='Activities']")
    public List<WebElement> locationOfferingActivitiesOption;   //index 1

    @FindBy(xpath = "//a//span[text()='Retail Goods']")
    public WebElement locationOfferingRetailOption;

    @FindBy(xpath = "//a[@role='option']")
    public List<WebElement> categoryOptions;

    @FindBy(xpath = "//*[text()='Bar']")
    public WebElement barOption;

    @FindBy(tagName = "textarea")
    public WebElement descriptionTextarea;



}
