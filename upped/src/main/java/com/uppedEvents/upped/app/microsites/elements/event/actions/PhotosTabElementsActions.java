package com.uppedEvents.upped.app.microsites.elements.event.actions;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.PhotosTabElements;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhotosTabElementsActions extends Base {

    @Autowired
    PhotosTabElements elements;

    public void clickFirstImageInGallery() { this.elements.photos.get(0).click();}
    public void clickSecondImageInGallery() { this.elements.photos.get(1).click();}
    public void clickBackToGalleryButton() { this.elements.backToGalleryButton.click();}
    public void clickNextImageButton() { this.elements.nextPhotoButton.click();}
    public void clickPreviousImageButton() { this.elements.previousPhotoButton.click();}
    public void moveToElement(){
        Actions actions = new Actions(driver);
        actions.moveToElement(this.elements.nextPhotoButton).perform();
    }
}
