package com.uppedEvents.upped.app.microsites.elements.event.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.event.elements.PhotosTabElements;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhotosTab extends Base {

    @Autowired
    PhotosTabElements photosElements;

    public Boolean picturesContainerIsDisplayed(){
        return this.photosElements.picturesContainer.isDisplayed();
    }
    public Boolean firstPhotoIsDisplayed(){
        return this.photosElements.photos.get(0).isDisplayed();
    }
    public Boolean secondPhotoIsDisplayed(){
        return this.photosElements.photos.get(1).isDisplayed();
    }
    public Boolean photoGalleryIsDisplayed(){
        return this.photosElements.photoGallery.isDisplayed();
    }
    public Boolean backToGalleryButtonIsDisplayed(){
        return this.photosElements.backToGalleryButton.isDisplayed();
    }
    public Boolean nextPhotoButtonIsDisplayed(){
        return this.photosElements.nextPhotoButton.isDisplayed();
    }
    public Boolean previousPhotoButtonIsDisplayed() {
        return this.photosElements.previousPhotoButton.isDisplayed();
    }
    public Boolean imagesSliderIsDisplayed(){
        return this.photosElements.imagesSlider.isDisplayed();
    }
    public Boolean mainImageIsDisplayed(){
        return this.photosElements.mainImage.isDisplayed();
    }


    public Boolean isAtPhotosTab() {
        return this.wait.until((d) -> this.photosElements.picturesContainer.isDisplayed());
    }

}
