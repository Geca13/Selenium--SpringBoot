package com.uppedEvents.upped.app.portal.portalModals;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ColumnOptions extends Base {

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(@class, 'column-groum')]//label")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//div[contains(@class, 'cdk-drag')]//span")
    public List<WebElement> columnDrags;

    public void addColumnModalIsOpened(){
        this.elementIsClickable(saveButton);
    }

    public void clickAndDragColumn() throws InterruptedException {
        this.addColumnModalIsOpened();
        Thread.sleep(5000);
        this.clickAndHold(columnDrags.get(0));
        this.dragAndDrop(columnDrags.get(0),columnDrags.get(3));
        Thread.sleep(5000);
    }
}
