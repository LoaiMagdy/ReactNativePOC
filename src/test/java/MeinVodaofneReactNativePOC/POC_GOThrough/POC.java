package MeinVodaofneReactNativePOC.POC_GOThrough;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Config.CommanlyUsedFunctions;
import Config.RecyclerViewActions;
import ReactNativeDummyTestPage.MotherClass;

public class POC extends MotherClass {

	@FindBy(how = How.NAME, using = "openConfig")
	WebElement OpenConfigButton;

	@FindBy(how = How.NAME, using = "CMS_Test_btn")
	WebElement CMSTestEnv;

	@FindBy(how = How.NAME, using = "mobile_login_tab_title")
	WebElement MobileLoginTab;

	@FindBy(how = How.NAME, using = "fixednet_login_tab_title")
	WebElement FixedLoginTab;

	@FindBy(how = How.NAME, using = "internet_password_login_btn")
	WebElement MobileLoginButton;

	@FindBy(how = How.NAME, using = "msisdn_internet_password_et")
	WebElement UserNameField;

	@FindBy(how = How.NAME, using = "password_internet_password_et")
	WebElement PasswordField;

	@FindBy(how = How.NAME, using = "internet_password_login_btn")
	WebElement LoginBtn;

	@FindBy(how = How.NAME, using = "Configuration Manager")
	WebElement ConfigTitle;

	@FindBy(how = How.NAME, using = "Add X-MVA-TestClientID Header")
	WebElement CaptchaToggler;

	@FindBy(how = How.NAME, using = "vf_test_client_id_rb")
	WebElement CaptchaSwitcher;

	@FindBy(how = How.NAME, using = "Save")
	WebElement SaveBtn;

	@FindBy(how = How.NAME, using = "config_confirmation_ok_btn")
	WebElement OKbtn;

	@FindBy(how = How.ID, using = "Allow")
	public WebElement confirmPopupGDPRMessage_btn;

	@FindBy(how = How.NAME, using = "welcomeMessageText")
	WebElement WelcomeMessage;

	@FindBy(how = How.NAME, using = "close white")
	WebElement BEWOfferCloseBtn;

	@FindBy(how = How.NAME, using = "Zeig mir die Deals")
	WebElement BEWOfferBtn;

	@FindBy(how = How.XPATH, using = "//*[@label='Meine Daten React']")
	WebElement MeineDatenReact;

	// Jan Beitzer
	@FindBy(how = How.NAME, using = "HeaderNameID")
	WebElement MeineDatenReactHeaderName;

	// 01724512833
	@FindBy(how = How.NAME, using = "HeaderNumID")
	WebElement MeineDatenReactHeaderNum;

	// Daten Prūten und verwalten
	@FindBy(how = How.NAME, using = "HeaderDescID")
	WebElement MeineDatenReactHeaderDesc;

	// Kundendaten
	@FindBy(how = How.NAME, using = "MienDatenTitleID")
	WebElement MeineDatenReactTitle;

	// Kontaktdaten
	@FindBy(how = How.NAME, using = "KontaktdatenTitleID")
	WebElement FirstSectionTitle;

	// Fūr persönliche Emprènhlungen und vertragsinfos.
	@FindBy(how = How.NAME, using = "KontaktdatenDescriptionID")
	WebElement FirstSectionDesc;

	// Mobil
	@FindBy(how = How.NAME, using = "Kontaktdaten-MobilKeyID")
	WebElement FirstSectionFirstKey;

	// 491724512834
	@FindBy(how = How.NAME, using = "Kontaktdaten-491724512834ValueID")
	WebElement FirstSectionFirstvalue;

	// Email
	@FindBy(how = How.NAME, using = "Kontaktdaten-EmailKeyID")
	WebElement FirstSectionSecondKey;

	// -
	@FindBy(how = How.NAME, using = "Kontaktdaten--ValueID")
	WebElement FirstSectionSecondvalue;

	// Kundenadresse
	@FindBy(how = How.NAME, using = "KundenadresseTitleID")
	WebElement SecondSectionTitle;

	// Rechnungsadresse
	@FindBy(how = How.NAME, using = "RechnungsadresseTitleID")
	WebElement ThirdSectionTitle;

	// Bankverbindung
	@FindBy(how = How.NAME, using = "BankverbindungTitleID")
	WebElement ForuthSectionTitle;

	// dieses Konto wird mit Deinem Rechnungsbetrag belastet
	@FindBy(how = How.NAME, using = "BankverbindungDescriptionID")
	WebElement ForuthSectionDesc;

	// Kontoinhaber
	@FindBy(how = How.NAME, using = "Bankverbindung-KontoinhaberKeyID")
	WebElement ForuthSectionFirstKey;

	// Jan Beitzer
	@FindBy(how = How.NAME, using = "Bankverbindung-Jan BeitzerValueID")
	WebElement ForuthSectionFirstValue;

	// Ändern
	@FindBy(how = How.NAME, using = "BankverbindungEditID")
	WebElement ForuthSectionEditBtn;

	// Bankverbindung
	@FindBy(how = How.NAME, using = "BankDetailsTitleID")
	WebElement BankPageTitle;

	// Überprüfe und bearbeite Deine Bankverbindung
	@FindBy(how = How.NAME, using = "BankDetailsSubTitleID")
	WebElement BankPageDesc;

	// Jan Beitzer
	@FindBy(how = How.NAME, using = "EditCardKontoinhaberID")
	WebElement BankPageUser;

	// DE54500105175413070740
	@FindBy(how = How.NAME, using = "EditCardIBANID")
	WebElement BankPageBanID;

	// INGDDEFFXXX
	@FindBy(how = How.NAME, using = "EditCardBICID")
	WebElement BankPageBicID;

	// ING-DiBa Frankfurt am Main
	@FindBy(how = How.NAME, using = "EditCardBankID")
	WebElement BankPageBankID;

	@FindBy(how = How.NAME, using = "EditCardspeichernID")
	WebElement BankPageBtn;

	@FindBy(how = How.NAME, using = "back button")
	WebElement BackBtn;

	@FindBy(how = How.XPATH, using = "//*[@label='Einstellungen & Infos']")
	WebElement Einstellungen;

	@FindBy(how = How.NAME, using = "Überblick")
	WebElement EinstellungenHeader;

	@FindBy(how = How.NAME, using = "Logout und Neuanmeldung")
	WebElement LogoutBtn;

	@FindBy(how = How.NAME, using = "Logout")
	WebElement LogoutPageBtn;

	@Test(priority = 0)
	public void InitializingObjects() {
		PageFactory.initElements(Appium, this);
		CommanMethods = new CommanlyUsedFunctions(Appium);
		RC = new RecyclerViewActions(Appium);
	}

	//@Test(priority = 1)
	public void DisableCaptchaFromConfigPage() throws InterruptedException {
		CommanMethods.WaitingWebElemnt(OpenConfigButton, 30);
		CommanMethods.ClickingOnWebElement(OpenConfigButton);
		CommanMethods.WaitingWebElemnt(CMSTestEnv, 10);
		CommanMethods.ClickingOnWebElement(CMSTestEnv);
		RC.ScrollToWebElement(CaptchaToggler);
		if (CaptchaSwitcher.getAttribute("value").equals("0"))
			CommanMethods.ClickingOnWebElement(CaptchaSwitcher);
		RC.ScrollToWebElement(SaveBtn);
		CommanMethods.ClickingOnWebElement(SaveBtn);
		CommanMethods.WaitingWebElemnt(OKbtn, 30);
		CommanMethods.ClickingOnWebElement(OKbtn);
		Appium.launchApp();

	}

	//@Test(priority = 2)
	public void LoginToHomePage() {
		CommanMethods.WaitingWebElemnt(MobileLoginTab, 30);
		CommanMethods.ClickingOnWebElement(MobileLoginTab);
		if (CommanMethods.FoundElmt(MobileLoginButton, 10))
			CommanMethods.ClickingOnWebElement(MobileLoginButton);
		CommanMethods.WaitingWebElemnt(UserNameField, 30);
		CommanMethods.WritingText(UserNameField, "491724512833");
		CommanMethods.WaitingWebElemnt(PasswordField, 30);
		CommanMethods.WritingText(PasswordField, "vodafone15");
		CommanMethods.ClickingOnWebElement(LoginBtn);
		if (CommanMethods.FoundElmt(confirmPopupGDPRMessage_btn, 10))
			CommanMethods.ClickingOnWebElement(confirmPopupGDPRMessage_btn);
		if (CommanMethods.FoundElmt(confirmPopupGDPRMessage_btn, 3))
			CommanMethods.ClickingOnWebElement(confirmPopupGDPRMessage_btn);
		try {
			CommanMethods.WaitingWebElemnt(BEWOfferBtn, 40);
			CommanMethods.ClickingOnWebElement(BEWOfferCloseBtn);
		} catch (Exception e) {
			CommanMethods.WaitingWebElemnt(WelcomeMessage, 30);
		}

	}

	//@Test(priority = 3)
	public void ClickOnMienDatenReact() {
		RC.ScrollToWebElement(MeineDatenReact);
		CommanMethods.ClickingOnWebElement(MeineDatenReact);

	}

	@Test(priority = 4)
	public void CheckMeinDatenPage() {
		CommanMethods.WaitingWebElemnt(MeineDatenReactHeaderName, 120);
		assertEquals(MeineDatenReactHeaderName.getText().trim(), "Jan Beitzer");
		assertEquals(MeineDatenReactHeaderNum.getText().trim(), "01724512833");
		assertEquals(MeineDatenReactHeaderDesc.getText().trim(), "Daten Prūten und verwalten");
		RC.ScrollToWebElement(ForuthSectionTitle);
		assertEquals(ForuthSectionTitle.getText().trim(), "Bankverbindung");
		CommanMethods.ClickingOnWebElement(ForuthSectionEditBtn);
		CommanMethods.WaitingWebElemnt(BankPageTitle, 120);
		CommanMethods.WaitingWebElemnt(BankPageUser, 120);
		CommanMethods.WritingText(BankPageBanID, "DE54500105175413070740");
		CommanMethods.ClickingOnWebElement(BankPageUser);
		CommanMethods.WritingText(BankPageBicID, "INGDDEFFXXX");
		CommanMethods.ClickingOnWebElement(BankPageUser);
		RC.ScrollToWebElement(BankPageBtn);
		CommanMethods.ClickingOnWebElement(BankPageBtn);
		CommanMethods.ClickingOnWebElement(BackBtn);
		RC.ScrollUpToWebElement(MeineDatenReactHeaderName);
		CommanMethods.WaitingWebElemnt(MeineDatenReactHeaderName, 120);
		CommanMethods.ClickingOnWebElement(BackBtn);
		CommanMethods.WaitingWebElemnt(MeineDatenReact, 120);

	}

	@Test(priority = 5)
	public void Logout() {
		RC.ScrollToWebElement(Einstellungen);
		CommanMethods.ClickingOnWebElement(Einstellungen);
		CommanMethods.WaitingWebElemnt(EinstellungenHeader, 30);
		RC.ScrollToWebElement(LogoutBtn);
		CommanMethods.ClickingOnWebElement(LogoutBtn);
		CommanMethods.WaitingWebElemnt(LogoutPageBtn, 30);
		CommanMethods.ClickingOnWebElement(LogoutPageBtn);
		CommanMethods.WaitingWebElemnt(OpenConfigButton, 30);
		System.out.println("I'm Done");

	}
}
