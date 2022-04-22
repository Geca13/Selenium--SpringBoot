package com.uppedEvents.upped.app.microsites.elements.event.elements;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotosTabElements extends Base {

    @FindBy(className = "pictures-row")
    public WebElement picturesContainer;

    @FindBy(className = "photo")
    public List<WebElement> photos;

    @FindBy(tagName = "app-event-gallery")
    public WebElement photoGallery;

    @FindBy(xpath = "//*[text()=' Back to Gallery ']")
    public WebElement backToGalleryButton;

    @FindBy(className = "fa-chevron-right")
    public WebElement nextPhotoButton;

    @FindBy(className = "fa-chevron-left")
    public WebElement previousPhotoButton;

    @FindBy(className = "images-sliding-container")
    public WebElement imagesSlider;

    @FindBy(className = "main-img")
    public WebElement mainImage;


 }
