package com.uppedEvents.upped.app.portal.shopManagement;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class ShopCategoriesPage extends Base {

    @FindBy(className = "potential_category_row")
    public WebElement potentialCategoriesBox;

    @FindBy(className = "ordered_categories_row")
    public WebElement orderedCategoriesBox;

    @FindBy(xpath = "//*[text()=' Beer ']")
    public WebElement beer;

    @FindBy(xpath = "//*[text()=' Services ']")
    public WebElement services;

    @FindBy(xpath = "//*[text()=' Wine ']")
    public WebElement wine;

    @FindBy(xpath = "//*[text()=' Fast Food ']")
    public WebElement fastFood;

    @FindBy(xpath = "//*[text()=' Desserts ']")
    public WebElement desserts;

    @FindBy(xpath = "//*[text()=' Food ']")
    public WebElement food;

    @FindBy(xpath = "//*[text()=' Bars ']")
    public WebElement bars;

    @FindBy(xpath = "//*[text()=' Merchandise ']")
    public WebElement merchandise;

    @FindBy(xpath = "//*[text()=' Alcoholic Drinks ']")
    public WebElement alcoholicDrinks;

    @FindBy(xpath = "//*[text()=' Clothing ']")
    public WebElement clothing;

    @FindBy(xpath = "//*[text()=' Activities ']")
    public WebElement activities;

    @FindBy(xpath = "//button[@class='btn_add_potential_category' and text()='+ Add']")
    public WebElement addNewCategoryButton;

    @FindBy(xpath = "//input[@name='category_title']")
    public WebElement addNewCategoryInput;

    @FindBy(xpath = "//button[@class='btn-outline-dark' and text()='Add']")
    public WebElement saveNewCategoryButton;

    @FindBy(xpath = "//button[@class='primary-btn' and text()='Save ']")
    public WebElement saveCategorizationButton;
}
