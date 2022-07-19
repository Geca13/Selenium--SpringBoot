package com.uppedEvents.upped.app;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Methods extends Base {

    public void clickElement(WebElement element){
        element.click();
    }
    public Boolean elementIsDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public void sendKeysToElement(WebElement element, String keys) { element.sendKeys(keys);}
    public void clearInputField(WebElement element){ element.clear();element.click();element.sendKeys(Keys.TAB); }

    public void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public WebElement findParentElement(WebElement child){
        return child.findElement(By.xpath("./.."));
    }

    public WebElement findFirstChildElement(WebElement parent){
        return parent.findElements(By.xpath("./child::*")).get(0);
    }
    public WebElement findSecondChildElement(WebElement parent){
        return parent.findElements(By.xpath("./child::*")).get(1);
    }

    public String saveOriginalBrowserWindow(){
       return this.driver.getWindowHandle();
}

    public void switchToOriginalBrowserWindow(String window){
       this.driver.switchTo().window(window);
    }

    public void switchToPopupWindow(){
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public Boolean childElementIsDisplayed(List<WebElement> element, Integer index) {
        return findSecondChildElement(element.get(index)).isDisplayed();
    }

    public List<WebElement> findChildrenElements(WebElement parent){
        return parent.findElements(By.xpath("./child::*"));
    }

    public WebElement findChildOfChildElement(WebElement parent){
        WebElement firstLevelChild = parent.findElement(By.xpath("./child::*"));
        return firstLevelChild.findElement(By.xpath("./child::*"));
    }

    public Boolean forEachItemInListTheItemIsDisplayed(List<WebElement> elements) {
        System.out.println(elements.size() + " listata");
        for (WebElement element : elements) {
           return element.isDisplayed();

        }
        return null;
    }

    public WebElement returnFirstLevelChildByIndex(WebElement parent, Integer index) {
        return findChildrenElements(parent).get(index);
    }

    public String generateRandom6LetterString(){
        return RandomStringUtils.random(6,true,false);
    }

    public String generateRandom9LetterString(){
        return RandomStringUtils.random(6,true,false);
    }
    public String generateRandom5NumbersString(){
        return RandomStringUtils.random(5,false,true);
    }

    public Boolean isAtPage(WebElement element) { return this.wait.until((d) -> element.isDisplayed());}

    public String generateRandomEmail(){
        String prefix = RandomStringUtils.random(9,true,true);
        return prefix + "@random.us";
    }
    public String generatePassword(){
        return generateRandom6LetterString() + "13@";
    }

    public void enterMatchingPasswords(WebElement password, WebElement verifyPassword) {
        String createdPassword = generatePassword();
        password.sendKeys(createdPassword);
        verifyPassword.sendKeys(createdPassword);
    }
    public String getElementText(WebElement element){
        return element.getText();
    }
}
