package com.uppedEvents.upped.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public abstract class Base {
    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }

    public void clickElement(WebElement element){
         element.click();
    }
    public void locateElementByTextAndClick(String text){
       WebElement element = this.driver.findElement(By.xpath("//*[normalize-space(text())='"+text+"']"));
       element.click();
    }
    public void sendKeysAllElementsReturnedFromArray(List<WebElement> elements,  String amount){
        for(WebElement element: elements){
            element.sendKeys(amount);
        }
    }

    public void elementIsClickable(WebElement element){
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void elementIsVisible(WebElement element){
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void elementFromListByIndexIsDisplayed(List<WebElement> elements, Integer index){
        WebElement element = elements.get(index);
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void elementFromListByIndexIsClickable(List<WebElement> elements, Integer index){
        WebElement element = elements.get(index);
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void elementByTextIsDisplayed(String text){
        WebElement element = this.driver.findElement(By.xpath("//*[normalize-space(text())='"+text+"']"));
        this.elementIsVisible(element);
    }
    public String getEnteredTextInTheInput(WebElement element){
        return element.getAttribute("value");
    }
    public void clearInputField(WebElement element){
        element.clear();
    }
    public void clearInputFieldByIndexAndSendKeys(List<WebElement> elements, Integer index, String keys){
        WebElement element = elements.get(index);
        element.clear();
        this.sendKeys(element,keys);
    }



    public Double convertStringPriceToDouble(String price){
        return Double.parseDouble(price);
    }

    public String remove$signFromStringPrice(List<WebElement> elements,Integer parentIndex, Integer childIndex){
        return getChildTextByParentAndChildIndex(elements,parentIndex,childIndex).substring(1);
    }

    public String getSubstringOfBracketedPriceString(List<WebElement> elements, Integer index){
        return getRawTicketPrice(elements,index).substring(2,getRawTicketPrice(elements,index).length() - 1);
    }

    public void sendKeys(WebElement element, String keys){
        element.sendKeys(keys);
    }

    public String getRawTicketPrice(List<WebElement> elements,Integer index){
        return elements.get(index).getText();
    }
    public String getChildTextByParentAndChildIndex(List<WebElement> elements,Integer parent, Integer childIndex){
        List<WebElement> children = elements.get(parent).findElements(By.xpath("./child::*"));
        return children.get(childIndex).getText();
    }
    public void clickParentElementByTag(WebElement element, String tagName){
        WebElement parent = element.findElement(By.xpath("ancestor::"+tagName));
        parent.click();
    }
    public void dragAndDropByOffset(WebElement element, Integer horizontal, Integer vertical){
        Actions actions = new Actions(this.driver);
        actions.dragAndDropBy(element,  horizontal,  vertical ).perform();
    }

    public void dragAndDrop(WebElement source, WebElement target){
        Actions actions = new Actions(this.driver);
        actions.dragAndDrop(source, target).perform();
    }
    public void clickEnterKey(WebElement element){
        element.sendKeys(Keys.ENTER);
    }
    public void moveToElement(WebElement element){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element).perform();
    }
    public void moveToElementFromList(List<WebElement> elements, Integer index){
        Actions actions = new Actions(this.driver);
        WebElement element = elements.get(index);
        actions.moveToElement(element).perform();
    }
    public void clickAwayOfElementPosition(WebElement element, Integer horizontal, Integer vertical){
        Actions actions = new Actions(this.driver);
        actions.moveToElement(element, horizontal, vertical).doubleClick().perform();
    }



}
