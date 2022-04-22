package com.uppedEvents.upped;

import com.uppedEvents.upped.app.Methods;
import com.uppedEvents.upped.app.microsites.elements.account.actions.*;
import com.uppedEvents.upped.app.microsites.elements.account.elements.EditProfilePageElements;
import com.uppedEvents.upped.app.microsites.elements.account.screens.*;
import com.uppedEvents.upped.app.microsites.elements.event.actions.*;
import com.uppedEvents.upped.app.microsites.elements.event.elements.ExtrasTabElements;
import com.uppedEvents.upped.app.microsites.elements.event.screens.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UppedApplicationTests {

	@Autowired
	EventsScreen eventsScreen;
	@Autowired
	EventInformationScreen informationScreen;
	@Autowired
	LocTab locationTab;
	@Autowired
	DetailsTab detailsScreen;
	@Autowired
	PhotosTab photosScreen;
	@Autowired
	ShopsTab shopsScreen;
	@Autowired
	EventInfoElementsActions eventInfoActions;
	@Autowired
	EventsScreenElementActions eventsScreenActions;
    @Autowired
	PhotosTabElementsActions photosActions;
	@Autowired
	LocationTabElementsActions locationActions;
	@Autowired
	TicketingScreen ticketingScreen;
	@Autowired
	TicketingScreenElementsActions ticketingActions;
	@Autowired
	TicketsTab ticketsTab;
	@Autowired
	LoginTab loginTab;
	@Autowired
	LoginTabElementsActions loginActions;
	@Autowired
	ExtrasTab extrasTab;
	@Autowired
	ExtrasTabElementsActions extrasActions;
	@Autowired
	TicketsTabElementsActions ticketsActions;
	@Autowired
	PayTab payTab;
	@Autowired
	PayTabElementsActions payActions;
	@Autowired
	ConfirmTab confirmTab;
	@Autowired
	AccountDropdownScreen accountDropdown;
	@Autowired
	AccountDropdownElementsActions accountActions;
	@Autowired
	AccountPageScreen accountScreen;
	@Autowired
	MyWishListScreen wishListScreen;
	@Autowired
	MyPurchasesScreenActions myPurchasesActions;
	@Autowired
	MyPurchasesScreen myPurchasesScreen;
	@Autowired
	MyWalletScreen myWalletScreen;
	@Autowired
	AccountPageActions accountPageActions;
	@Autowired
	EditProfilePageActions editProfileActions;
	@Autowired
	EditProfileScreen editProfileScreen;
	@Autowired
	SignInModalScreenActions signInModalActions;
	@Autowired
	Methods methods;



	@Test
	public void elementsOnMicrosites() throws InterruptedException {
		this.eventsScreen.openMicrositesPage();
		this.eventsScreen.isAtEventsScreen();
		Assertions.assertTrue(this.eventsScreen.navbarIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.logoIsDisplayed());
		//Assertions.assertTrue(this.eventsScreen.whatsUppedIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.supportIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.signUpIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.signInIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.eventsContainerIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.bannerImageIsDisplayed());

		Assertions.assertTrue(this.eventsScreen.bannerTextIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.topEventsHeaderIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.eventNameIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.footerIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.contactUsIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.contactDetailsIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.facebookIconIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.instagramIconIsDisplayed());

		Assertions.assertTrue(this.eventsScreen.twitterIconIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.eventBookmarkDisplayed());
		Assertions.assertTrue(this.eventsScreen.nextEventsButtonIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.previousEventsButtonIsDisplayed());
		Assertions.assertTrue(this.eventsScreen.readMoreButtonIsDisplayed());
		this.eventsScreenActions.moveToElement();
		this.eventsScreenActions.clickEventCardToOpenEvent();
		this.informationScreen.isAtEventInformation();
		Assertions.assertTrue(this.informationScreen.buyTicketsButtonIsDisplayed());
		Assertions.assertTrue(this.informationScreen.pageTitleIsDisplayed());
		Assertions.assertTrue(this.informationScreen.addToWishlistButtonIsDisplayed());
		Assertions.assertTrue(this.informationScreen.detailsTabIsDisplayed());
		Assertions.assertTrue(this.informationScreen.photosTabIsDisplayed());
		Assertions.assertTrue(this.informationScreen.shopsTabIsDisplayed());

		Assertions.assertTrue(this.informationScreen.locationTabIsDisplayed());
		Assertions.assertTrue(this.informationScreen.featuredImageIsDisplayed());
		Assertions.assertTrue(this.informationScreen.shortNameIsDisplayed());
		Assertions.assertTrue(this.informationScreen.fullEventNameIsDisplayed());
		Assertions.assertTrue(this.informationScreen.eventInfoIsDisplayed());
		Assertions.assertTrue(this.informationScreen.eventTagsIsDisplayed());

		Assertions.assertTrue(this.informationScreen.verticalLineIsDisplayed());
		Assertions.assertTrue(this.detailsScreen.eventDescriptionSubTabIsDisplayed());
		Assertions.assertTrue(this.detailsScreen.eventTitleIsDisplayed());
		Assertions.assertTrue(this.detailsScreen.eventDescriptionIsDisplayed());
		Assertions.assertTrue(this.informationScreen.eventInfoIsDisplayed());
		Assertions.assertTrue(this.informationScreen.eventTagsIsDisplayed());

		this.eventInfoActions.clickLocationTab();
		this.locationTab.isAtLocationTab();
		Assertions.assertTrue(this.informationScreen.tabsContainer());
        //this.locationActions.clickOpenInMaps();
		Assertions.assertTrue(this.locationTab.locationIsDisplayed());
		Assertions.assertTrue(this.locationTab.googleMapsIsDisplayed());
		Assertions.assertTrue(this.locationTab.openMapsButtonIsDisplayed());
		this.eventInfoActions.clickShopsTab();
		this.shopsScreen.isAtShopsTab();

		//Assertions.assertTrue(this.shopsScreen.overviewIsDisplayed());
        Assertions.assertTrue(this.shopsScreen.shopsIsDisplayed());
		this.eventInfoActions.clickPhotosTab();
		this.photosScreen.isAtPhotosTab();
		Assertions.assertTrue(this.photosScreen.picturesContainerIsDisplayed());
		Assertions.assertTrue(this.photosScreen.firstPhotoIsDisplayed());
		Assertions.assertTrue(this.photosScreen.secondPhotoIsDisplayed());
		this.photosActions.clickFirstImageInGallery();
		Assertions.assertTrue(this.photosScreen.picturesContainerIsDisplayed());
		Assertions.assertTrue(this.photosScreen.backToGalleryButtonIsDisplayed());
		Assertions.assertTrue(this.photosScreen.nextPhotoButtonIsDisplayed());
		Assertions.assertTrue(this.photosScreen.previousPhotoButtonIsDisplayed());

		this.photosActions.moveToElement();
		//this.photosScreen.clickNextImageButton();
		this.photosActions.clickBackToGalleryButton();
		this.photosActions.clickSecondImageInGallery();
        Assertions.assertTrue(this.photosScreen.imagesSliderIsDisplayed());
		Assertions.assertTrue(this.photosScreen.mainImageIsDisplayed());
        //this.photosActions.clickPreviousImageButton();
		this.photosActions.clickBackToGalleryButton();
		this.eventInfoActions.clickDetailsTab();
		this.detailsScreen.isAtDetailsTab();
		this.eventInfoActions.clickBuyTicketsButton();

		this.ticketingScreen.isAtTicketingScreen();
		Assertions.assertTrue(this.ticketingScreen.ticketingTitleIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.ticketsTabIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.loginTabIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.extrasTabIsDisplayed());
        Assertions.assertTrue(this.ticketingScreen.payTabIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.confirmTabIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.backToEventInfoButtonIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.subtitleContainerIsDisplayed());
        Assertions.assertTrue(this.ticketingScreen.taxesContainerIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.feesContainerIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.totalContainerIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.loginInfoMessageIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.loginLinkIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.nextButtonIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.feesInfoIconIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.taxesInfoIconIsDisplayed());
		this.ticketingActions.moveToTaxesInfoIcon();

		Assertions.assertTrue(this.ticketingScreen.taxesTooltipIsDisplayed());
		this.ticketingActions.moveToFeesInfoIcon();
		this.ticketsTab.isAtTicketsScreen();
		Assertions.assertTrue(this.ticketsTab.ticketsTermsButtonIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.ticketsHeaderIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.ticketsContainerIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.firstTicketNameIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.firstTicketPriceIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.firstTicketsDescriptionIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.firstIncreaseQtyButtonIsDisplayed());
		Assertions.assertTrue(this.ticketsTab.firstDecreaseQtyButtonIsDisplayed());
		this.ticketingActions.clickNextButton();
		this.loginTab.isAtTLoginTab();
		Assertions.assertTrue(this.loginTab.googleSignInIsDisplayed());
		Assertions.assertTrue(this.loginTab.facebookSignInButtonIsDisplayed());
		Assertions.assertTrue(this.loginTab.pleaseLoginTitleIsDisplayed());
		Assertions.assertTrue(this.loginTab.loginWithEmailIsDisplayed());
		Assertions.assertTrue(this.loginTab.dontHaveAccountIsDisplayed());
		Assertions.assertTrue(this.loginTab.loginWithEmailSubtitleIsDisplayed());
		Assertions.assertTrue(this.loginTab.dontHaveAccountSubtitleIsDisplayed());
		Assertions.assertTrue(this.loginTab.emailInputIsDisplayed());
		Assertions.assertTrue(this.loginTab.passwordInputIsDisplayed());
		Assertions.assertTrue(this.loginTab.loginButtonIsDisplayed());
		Assertions.assertTrue(this.loginTab.forgotButtonIsDisplayed());
		Assertions.assertTrue(this.loginTab.signUpButtonIsDisplayed());

		this.loginActions.sendLoginPassword();
		this.loginActions.sendLoginEmail();

		this.loginActions.clickLoginButton();
		this.extrasTab.isAtTExtrasTab();
		Assertions.assertTrue(this.extrasTab.extrasContainerIsDisplayed());
		Assertions.assertTrue(this.extrasTab.firstExtrasTabsIsDisplayed());
		//Assertions.assertTrue(this.extrasTab.secondExtrasTabsIsDisplayed());
		Assertions.assertTrue(this.extrasTab.balanceLabelIsDisplayed());
		Assertions.assertTrue(this.extrasTab.balanceIsDisplayed());
		Assertions.assertTrue(this.extrasTab.walletLogoIsDisplayed());
		Assertions.assertTrue(this.extrasTab.walletDescriptionIsDisplayed());
		Thread.sleep(2000);
		//Assertions.assertTrue(this.extrasTab.donateTabIsDisplayed());
		Assertions.assertTrue(this.extrasTab.addMoneyTabIsDisplayed());

		// Assertions.assertTrue(this.extrasTab.addFundsInputIsDisplayed());
		Assertions.assertTrue(this.extrasTab.addMoneyButtonIsDisplayed());
		Assertions.assertTrue(this.extrasTab.previousScreenButtonIsDisplayed());
		Assertions.assertTrue(this.extrasTab.nextScreenButtonIsDisplayed());
		this.extrasActions.clickPreviousPageButton();
		this.ticketingScreen.isAtTicketingScreen();
		Assertions.assertTrue(this.ticketsTab.ticketsHeaderIsDisplayed());
		this.ticketsActions.clickIncreaseQtyButton(0);
		this.ticketsActions.clickIncreaseQtyButton(1);
        this.ticketingActions.clickNextButton();
		this.extrasTab.isAtTExtrasTab();
		this.extrasActions.clickNextPageButton();
        this.payTab.isAtPayTab();
		Assertions.assertTrue(this.payTab.payOptionsContainerIsDisplayed());
		Assertions.assertTrue(this.payTab.savedCardsTitleIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithServiceTitleIsDisplayed());
		Assertions.assertTrue(this.payTab.firstSavedCardIsDisplayed());

		Assertions.assertTrue(this.payTab.firstSavedCardBrandIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithWalletButtonOptionIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithServiceTitleIsDisplayed());
		Assertions.assertTrue(this.payTab.nextButtonIsDisplayed());

		Assertions.assertTrue(this.payTab.previousButtonIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithCardTabIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithNewCardTabIsDisplayed());
		this.payActions.clickPayWithNewCardTab();
		this.payTab.isAtNewCardTab();
		Assertions.assertTrue(this.payTab.cardHolderNameLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.cardNumberLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.cvvLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.expirationMonthLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.expirationYearLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.streetNameLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.countryLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.stateLabelIsDisplayed());
		Assertions.assertTrue(this.payTab.zipCodeLabelIsDisplayed());

		Assertions.assertTrue(this.payTab.cardHolderNameInputIsDisplayed());
		Assertions.assertTrue(this.payTab.cardNumberInputIsDisplayed());
		Assertions.assertTrue(this.payTab.saveCardCheckboxIsDisplayed());
		Assertions.assertTrue(this.payTab.cvvInputIsDisplayed());
		Assertions.assertTrue(this.payTab.streetNameInputIsDisplayed());
		Assertions.assertTrue(this.payTab.zipCodeInputIsDisplayed());
		Assertions.assertTrue(this.payTab.monthInputIsDisplayed());
		Assertions.assertTrue(this.payTab.yearInputIsDisplayed());
		Assertions.assertTrue(this.payTab.countryInputIsDisplayed());
		Assertions.assertTrue(this.payTab.stateInputIsDisplayed());
		Assertions.assertTrue(this.payTab.payWithCardButtonIsDisplayed());

		Assertions.assertTrue(this.ticketingScreen.discountLabelIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.applyButtonIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.discountInputIsDisplayed());
        this.payActions.clickPayWithCardOrService();
		this.payTab.isAtPayTab();
		this.payActions.clickPayWithWalletOption();
		this.payTab.walletButtonIsVisible();
		Assertions.assertTrue(this.payTab.payWithWalletButtonIsDisplayed());
		this.payActions.clickSelectCardOption();
		this.payTab.payWithCardButtonIsVisible();
		Assertions.assertTrue(this.payTab.payWithCardButtonIsVisible());
        this.payActions.clickPayWithCardButton();
		this.confirmTab.isAtConfirmTab();
		//Assertions.assertTrue(this.confirmTab.confirmAndShareTabIsDisplayed());
		//Assertions.assertTrue(this.confirmTab.thankYouMessageIsDisplayed());
		//Assertions.assertTrue(this.confirmTab.confirmationMessageIsDisplayed());
		Assertions.assertTrue(this.confirmTab.totalAmountIsDisplayed());
		Assertions.assertTrue(this.confirmTab.viewReceiptButtonIsDisplayed());
		Assertions.assertTrue(this.confirmTab.shareButtonIsDisplayed());
		Assertions.assertTrue(this.ticketingScreen.closeModalButtonIsDisplayed());
		this.ticketingActions.clickCloseModalButton();
		Thread.sleep(5000);
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		Assertions.assertTrue(this.accountDropdown.profileIconIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.profileOptionIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.receiptIconIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.receiptsOptionIsDisplayed());

		Assertions.assertTrue(this.accountDropdown.myEventsIconIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.myEventsOptionIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.paymentInfoIconIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.paymentInfoOptionIsDisplayed());

		Assertions.assertTrue(this.accountDropdown.logoutIconIsDisplayed());
		Assertions.assertTrue(this.accountDropdown.logoutOptionIsDisplayed());

		this.accountActions.clickProfileOption();
		this.accountScreen.isAtAccountPage();
		Assertions.assertTrue(this.accountScreen.pageHeaderIsDisplayed());
		Assertions.assertTrue(this.accountScreen.fullNameIsDisplayed());
		Assertions.assertTrue(this.accountScreen.emailLabelIsDisplayed());
		Assertions.assertTrue(this.accountScreen.phoneNumberLabelIsDisplayed());

		Assertions.assertTrue(this.accountScreen.locationLabelIsDisplayed());
		Assertions.assertTrue(this.accountScreen.editProfileButtonIsDisplayed());
		Assertions.assertTrue(this.accountScreen.logoffButtonIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myPurchasesCardIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWishlistCardIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWalletCardIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myPurchasesIconIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWishlistIconIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWalletIconIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myPurchasesDescriptionIsDisplayed());

		Assertions.assertTrue(this.accountScreen.myWishlistDescriptionIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWalletDescriptionIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myPurchasesCardTitleIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWishlistCardTitleIsDisplayed());

		Assertions.assertTrue(this.accountScreen.myWalletCardTitleIsDisplayed());
		Assertions.assertTrue(this.accountScreen.emailIsDisplayed());
		Assertions.assertTrue(this.accountScreen.phoneNumberIsDisplayed());
		Assertions.assertTrue(this.accountScreen.addressIsDisplayed());
		this.eventsScreenActions.clickUppedEventsLogo();
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		this.accountActions.clickMyEventsOption();

		//this.wishListScreen.isAtMyWishlistScreen();
		Assertions.assertTrue(this.accountScreen.myPurchaseButtonIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWishlistButtonIsDisplayed());
		Assertions.assertTrue(this.accountScreen.myWalletButtonIsDisplayed());
        Thread.sleep(2000);
		//Assertions.assertTrue(this.wishListScreen.firstEventCardIsDisplayed());
		//Assertions.assertTrue(this.wishListScreen.eventsContainerIsDisplayed());
		//Assertions.assertTrue(this.wishListScreen.bookmarkButtonIsDisplayed());

		this.eventsScreenActions.clickUppedEventsLogo();
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		this.accountActions.clickReceiptsOption();
		this.myPurchasesScreen.isAtMyPurchaseScreen();
		//Thread.sleep(10000);
		Assertions.assertTrue(this.myPurchasesScreen.searchButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.searchInputIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.filterButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstDownChevronIconIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstEventTitleIsDisplayed());
		this.myPurchasesActions.clickEventDrawer();
        Assertions.assertTrue(this.myPurchasesScreen.firstUpChevronIconIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstAllPurchasesButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstTicketButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstFoodButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstBeverageButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstMyPurchasesTabsIsDisplayed());

		Assertions.assertTrue(this.myPurchasesScreen.firstItemRowIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstItemTitleIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstProductTitleIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstProductPricesIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstProductTimeIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstViewReceiptButtonIsDisplayed());
		this.myPurchasesActions.clickFullReceiptButton();
        Thread.sleep(2000);
		Assertions.assertTrue(this.myPurchasesScreen.closeButtonIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.receiptHeaderIsDisplayed());

		Assertions.assertTrue(this.myPurchasesScreen.receiptSubHeaderIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.firstTicketNameIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.subtotalIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.discountIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.totalIsDisplayed());
		Assertions.assertTrue(this.myPurchasesScreen.subtotalSectionIsDisplayed());

		this.myPurchasesActions.clickCloseReceiptButton();

		this.eventsScreenActions.clickUppedEventsLogo();
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		this.accountActions.clickPaymentInfoOption();
Thread.sleep(5000);
		Assertions.assertTrue(this.myWalletScreen.walletLogoIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.uppedWalletLogoTextIsDisplayed());
        Assertions.assertTrue(this.myWalletScreen.uppedWalletLogoAmountIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.walletAmountTitleIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.paymentOptionTitleIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.addNewPaymentOptionTitleIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.paymentOptionSubTitleIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.addNewPaymentOptionSubTitleIsDisplayed());
        Assertions.assertTrue(this.myWalletScreen.walletBalanceIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.getFirstDescriptionLine());
		Assertions.assertTrue(this.myWalletScreen.getSecondDescriptionLine());
		Assertions.assertTrue(this.myWalletScreen.getEnterValueInput());
		Assertions.assertTrue(this.myWalletScreen.getAddMoneyButton());
		Assertions.assertTrue(this.myWalletScreen.fullPaymentCardIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.firstCardInfoIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.firstDeleteButtonIsDisplayed());

		Assertions.assertTrue(this.myWalletScreen.cardHolderNameLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.cardNumberLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.cvcLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.expirationMonthLabelIsDisplayed());
		//Assertions.assertTrue(this.myWalletScreen.expirationYearLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.streetAddressLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.countryLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.stateLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.zipCodeLabelIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.cardHolderNameInput());
		Assertions.assertTrue(this.myWalletScreen.cardNumberInput());
		Assertions.assertTrue(this.myWalletScreen.cvcInput());
		Assertions.assertTrue(this.myWalletScreen.streetAddressInput());
		Assertions.assertTrue(this.myWalletScreen.zipCodeInput());
		Assertions.assertTrue(this.myWalletScreen.monthSelect());
		Assertions.assertTrue(this.myWalletScreen.yearSelect());
		Assertions.assertTrue(this.myWalletScreen.countrySelect());
		Assertions.assertTrue(this.myWalletScreen.stateSelect());
		Assertions.assertTrue(this.myWalletScreen.addCardButton());

		Assertions.assertTrue(this.myWalletScreen.cardsChevronUpIconIsDisplayed());
		Assertions.assertTrue(this.myWalletScreen.addNewCardChevronUpIconIsDisplayed());

		//Assertions.assertTrue(this.myWalletScreen.cardsChevronDownIconIsDisplayed());
		//Assertions.assertTrue(this.myWalletScreen.addNewCardChevronDownIconIsDisplayed());

		this.accountPageActions.clickEditProfileButton();

		Assertions.assertTrue(this.editProfileScreen.firstNameLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.lastNameLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.emailAddressLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.passwordLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.genderLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.dobLabelIsDisplayed());

		Assertions.assertTrue(this.editProfileScreen.phoneLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.addressLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.countryLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.stateLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.cityLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.zipCodeLabelIsDisplayed());

		Assertions.assertTrue(this.editProfileScreen.saveProfileButtonIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.editEmailButtonIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.firstNameInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.lastNameInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.emailInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.passwordInputIsDisplayed());

		Assertions.assertTrue(this.editProfileScreen.dobSelectIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.genderSelectIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.phoneInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.addressInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.countrySelectIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.stateSelectIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.zipCodeInputIsDisplayed());

		this.editProfileActions.clickEditEmailButton();

		Assertions.assertTrue(this.editProfileScreen.changeEmailModalIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalHeaderIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.verificationDescriptionIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.saveButtonIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.cancelButtonIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalEmailInputLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalCurrentPasswordInputLabelIsDisplayed());

		Assertions.assertTrue(this.editProfileScreen.changeEmailModalRetypePasswordInputLabelIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalEmailInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalCurrentPasswordInputIsDisplayed());
		Assertions.assertTrue(this.editProfileScreen.changeEmailModalRetypePasswordInputIsDisplayed());

		this.editProfileActions.clickCancelButtonOnChangeEmailModal();
		String window = this.methods.saveOriginalBrowserWindow();
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		this.accountActions.clickLogoutOption();
		Thread.sleep(5000);
		this.eventsScreenActions.clickSignInButton();
		Thread.sleep(5000);

		this.signInModalActions.clickFacebookButton();
		Thread.sleep(5000);
        this.signInModalActions.switchToNewFacebookWindow();
		Thread.sleep(5000);
		this.signInModalActions.loginWithFacebook();
		Thread.sleep(10000);
		this.methods.switchToOriginalBrowserWindow(window);
		this.eventsScreenActions.clickAccountButton();
		this.eventsScreen.accountDropdownIsOnEventsScreen();
		this.accountActions.clickLogoutOption();
        Thread.sleep(5000);

        }

	@Test
	public void elementsOnEmbed(){

	}

}
