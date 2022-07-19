package com.uppedEvents.upped.app.portal.eventModules;

import com.uppedEvents.upped.app.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenusPage extends Base {

    @FindBy(xpath = "//*[text()=' Create New Menu']")
    public WebElement createNewMenu;

    @FindBy(xpath = "//a[contains(@class, 'menuHref')]")
    public List<WebElement> menuLinks;

    @FindBy(xpath = "//*[text()='My Menus ']")
    public WebElement myMenusNav;

    @FindBy(xpath = "//*[text()='Menu ']")
    public WebElement menuNav;

    @FindBy(xpath = "//*[text()='Menu Scheduler']")
    public WebElement menuSchedulerNav;

    @FindBy(xpath = "//*[text()='Add New Section ']")
    public WebElement addNewSectionButton;

    @FindBy(xpath = "//div[contains(@class, 'container')]//div[@cdkdroplistconnectedto='list-2']")
    public List<WebElement> menuSections;

    @FindBy(xpath = "//div[contains(@class, 'items-listing')]//div[contains(@class, 'cdk-drag')]")
    public List<WebElement> menuItemsFromList;

    @FindBy(xpath = "//input[@name='menuTitle']")
    public WebElement menuTitleInput;

    @FindBy(className = "fa-pencil")
    public List<WebElement> editIcons;

    @FindBy(className = "fa-check")
    public WebElement saveMenuNameButton;

    @FindBy(className = "//input[@name='sectionName']")
    public List<WebElement> sectionNameInput;

    @FindBy(xpath = "//*[text()='Add ']")
    public WebElement addNewItemButton;

    @FindBy(xpath = "//*[text()='Add New Item ']")
    public List<WebElement> addNewItemFromSection;

    @FindBy(className = "dropdown-menu-right")
    public WebElement mainCategoriesDropdown;

    @FindBy(xpath = "//*[text()='Ticket']")
    public WebElement ticketOption;

    @FindBy(xpath = "//*[text()='Merchandise']")
    public WebElement merchandiseOption;

    @FindBy(xpath = "//*[text()='Food']")
    public WebElement foodOption;

    @FindBy(xpath = "//*[text()='Beverage']")
    public WebElement beverageOption;

    @FindBy(xpath = "//*[text()='Other']")
    public WebElement otherOption;

    @FindBy(xpath = "//*[text()='Service/Activity']")
    public WebElement serviceOrActivityOption;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement newItemNameInput;

    @FindBy(xpath = "//input[@formcontrolname='price']")
    public WebElement newItemPriceInput;

    @FindBy(xpath = "//textarea[@formcontrolname='itemIngredients']")
    public WebElement newItemIngredientsTextarea;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public WebElement newItemDescriptionTextarea;

    @FindBy(xpath = "//select-picker[@formcontrolname='category']")
    public WebElement newItemCategoryDropdown;

    @FindBy(xpath = "//select-picker[@formcontrolname='subCategory']")
    public WebElement newItemSubcategoryDropdown;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement newItemImageInput;

    @FindBy(xpath = "//*[text()='Add Item']")
    public WebElement addSaveItemButton;

    @FindBy(tagName = "select")
    public List<WebElement> categorySubcategoryDropdowns;


    @FindBy(xpath = "//*[text()='Beer']")
    public WebElement beerCategory;

    @FindBy(xpath = "//*[text()='Wine']")
    public WebElement wineCategory;

    @FindBy(xpath = "//*[text()='Cocktials & Liquor']")
    public WebElement cocktailCategory;

    @FindBy(xpath = "//*[text()='Other Alcohol']")
    public WebElement otherAlcCategory;

    @FindBy(xpath = "//*[text()='Non-Alc: Hot Drink']")
    public WebElement nonAlcHotCategory;

    @FindBy(xpath = "//*[text()='Non-Alc: Cold']")
    public WebElement nonAlcColdCategory;

    @FindBy(xpath = "//*[text()='Mains']")
    public WebElement foodMainsCategory;

    @FindBy(xpath = "//*[text()='Snacks & Sides']")
    public WebElement snacksSidesCategory;

    @FindBy(xpath = "//*[text()='Desserts']")
    public WebElement dessertsCategory;

    @FindBy(xpath = "//*[text()='Packaged Foods/Gifts ']")
    public WebElement packagedGoodsCategory;

    @FindBy(xpath = "//*[text()='Red']")
    public WebElement redWine;

    @FindBy(xpath = "//*[text()='White']")
    public WebElement whiteWine;

    @FindBy(xpath = "//*[text()='Rosé']")
    public WebElement roseWine;

    @FindBy(xpath = "//*[text()='Sparkling']")
    public WebElement sparklingWine;

    @FindBy(xpath = "//*[text()='Stout']")
    public WebElement stoutBeerSubCategory;

    @FindBy(xpath = "//*[text()='IPA']")
    public WebElement ipaBeerSubCategory;

    @FindBy(xpath = "//*[text()='Pilsner']")
    public WebElement pilsnerBeerSubCategory;

    @FindBy(xpath = "//*[text()='Amber']")
    public WebElement amberBeerSubCategory;

    @FindBy(xpath = "//*[text()='Grains & Pasta']")
    public WebElement pastaSubCategory;

    @FindBy(xpath = "//*[text()='Meat & Seafood']")
    public WebElement meatSubCategory;

    @FindBy(xpath = "//*[text()='Sandwiches']")
    public WebElement sandwichesSubCategory;

    @FindBy(xpath = "//*[text()='Pizza']")
    public WebElement pizzaSubCategory;

    @FindBy(xpath = "//*[text()='Salty Snacks']")
    public WebElement saltySnacksSubCategory;

    @FindBy(xpath = "//*[text()='Fruits/Veggies']")
    public WebElement fruitsVeggiesSubCategory;

    @FindBy(xpath = "//*[text()='Dairy']")
    public WebElement dairySubCategory;

    @FindBy(xpath = "//*[text()='Dips']")
    public WebElement dipsSubCategory;

    @FindBy(xpath = "//*[text()='Cake']")
    public WebElement cakeSubCategory;

    @FindBy(xpath = "//*[text()='Ice Cream']")
    public WebElement iceCreamSubCategory;

    @FindBy(xpath = "//*[text()='Donut']")
    public WebElement donutSubCategory;

    @FindBy(xpath = "//*[text()='Pie']")
    public WebElement pieSubCategory;

    @FindBy(xpath = "//h3[@class='popup-header-title']")
    public WebElement selectTicketGroupHeader;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-select-ticket/div/div/div[2]/div/div/div[1]/input")
    public WebElement searchEventInput;

    @FindBy(xpath = "//div[@class='checkboxGrid']")
    public WebElement ticketGroupsWrapper;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectTicketGroupButton;

    @FindBy(xpath = "//p[@class='title']")
    public WebElement filteredEventName;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-select-ticket/div/div/div[2]/div/div/ul/li[1]/div/p")
    public WebElement rightIcon;

    public void addItemToSection() throws InterruptedException {
        this.clickElement(menuLinks.get(0));
        Thread.sleep(2000);
        this.clickAndHold(menuItemsFromList.get(0));
        this.dragAndDrop(menuItemsFromList.get(0), menuSections.get(0));
        Thread.sleep(5000);
    }
}


