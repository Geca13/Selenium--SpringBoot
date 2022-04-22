package com.uppedEvents.upped.app.microsites.elements.account.screens;

import com.uppedEvents.upped.app.Base;
import com.uppedEvents.upped.app.microsites.elements.account.elements.MyPurchasesScreenElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyPurchasesScreen extends Base {

    @Autowired
    MyPurchasesScreenElements elements;

    public Boolean isAtMyPurchaseScreen() { return this.wait.until((d) -> this.elements.searchInput.isDisplayed()); }

    public Boolean searchButtonIsDisplayed() { return this.elements.searchButton.isDisplayed(); }
    public Boolean searchInputIsDisplayed() { return this.elements.searchInput.isDisplayed(); }
    public Boolean filterButtonIsDisplayed() { return this.elements.filterButton.isDisplayed(); }
    public Boolean firstDownChevronIconIsDisplayed() { return this.elements.chevronDown.get(0).isDisplayed(); }
    public Boolean firstEventTitleIsDisplayed() { return this.elements.eventsNames.get(0).isDisplayed(); }
    public Boolean firstUpChevronIconIsDisplayed() { return this.elements.chevronUp.get(0).isDisplayed(); }
    public Boolean firstAllPurchasesButtonIsDisplayed() { return this.elements.allPurchasesButtons.get(0).isDisplayed(); }
    public Boolean firstTicketButtonIsDisplayed() { return this.elements.ticketsButtons.get(0).isDisplayed(); }
    public Boolean firstFoodButtonIsDisplayed() { return this.elements.foodButtons.get(0).isDisplayed(); }
    public Boolean firstBeverageButtonIsDisplayed() { return this.elements.beverageButtons.get(0).isDisplayed(); }

    public Boolean firstMyPurchasesTabsIsDisplayed() { return this.elements.myPurchasesTabs.get(0).isDisplayed(); }
    public Boolean firstItemRowIsDisplayed() { return this.elements.itemRow.get(0).isDisplayed(); }
    public Boolean firstItemTitleIsDisplayed() { return this.elements.itemTitle.get(0).isDisplayed(); }
    public Boolean firstProductTitleIsDisplayed() { return this.elements.productTitle.get(0).isDisplayed(); }

    public Boolean firstProductPricesIsDisplayed() { return this.elements.productPrice.get(0).isDisplayed(); }
    public Boolean firstProductTimeIsDisplayed() { return this.elements.productTime.get(0).isDisplayed(); }
    public Boolean firstViewReceiptButtonIsDisplayed() { return this.elements.viewReceiptButton.get(0).isDisplayed(); }

    public Boolean closeButtonIsDisplayed() { return this.elements.closeButton.isDisplayed(); }
    public Boolean receiptHeaderIsDisplayed() { return this.elements.receiptHeader.isDisplayed(); }
    public Boolean receiptSubHeaderIsDisplayed() { return this.elements.receiptSubHeader.isDisplayed(); }

    public Boolean firstTicketNameIsDisplayed() { return this.elements.ticketsNames.get(0).isDisplayed(); }

    public Boolean subtotalIsDisplayed() { return this.elements.subtotal.isDisplayed(); }
    public Boolean discountIsDisplayed() { return this.elements.discount.isDisplayed(); }
    public Boolean totalIsDisplayed() { return this.elements.total.isDisplayed(); }
    public Boolean subtotalSectionIsDisplayed() { return this.elements.subtotalSection.isDisplayed(); }
}
