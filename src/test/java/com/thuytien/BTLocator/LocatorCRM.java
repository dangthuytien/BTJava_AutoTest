package com.thuytien.BTLocator;

public class LocatorCRM {

    //Xpath trang Login

    public static String headerLogo = "//img[@alt='Perfex CRM | Anh Tester Demo']";
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String buttonLogin = "//button[@type='submit']";
    public static String linkTextForgotPassword = "//a[normalize-space()='Forgot Password?']";

    //Xpath menu Customer

    public static String menuCustomers = "//span[normalize-space()='Customers']";
    //
    public static String buttonHideMenu = "//i[@class='fa fa-align-left']";
    public static String inputTopSearch = "//input[@id='search_input']";
    public static String buttonTopSearch = "//button[starts-with(@class, 'tw-outline-none')]";
    public static String buttonQuickCreate = "//span[starts-with(@class, 'tw-rounded-full')]";

    //Xpath trang New Customer
    public static String buttonCustomerDetails = "//a[@href='#contact_info']";
    public static String buttonBillingShipping = "//a[normalize-space()='Billing & Shipping']";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVAT = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroups = "//label[normalize-space()='Groups']/parent::div/descendant::div[normalize-space()='Nothing selected' and @class='filter-option-inner-inner']";
    public static String buttonAddNewCustomerGroups = "//i[@class='fa fa-plus']";
    public static String dropdownCurrency = "//label[normalize-space()='Currency']/parent::div/descendant::div[normalize-space()='System Default' and @class='filter-option-inner-inner']";
    public static String dropdownDefaultLanguage = "//label[normalize-space()='Default Language']/parent::div/descendant::div[normalize-space()='System Default' and @class='filter-option-inner-inner']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode ="//input[@id='zip']";
    public static String dropdownCountry = "//div[@app-field-wrapper='country']//div[@class='filter-option-inner-inner'][normalize-space()='Nothing selected']";
    public static String buttonSaveCreate = "//button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//button[text()='Save']";

    //Xpath Menu Project
    public static String menuProject = "//ul[@id='side-menu']/descendant::span[normalize-space()='Projects']";

    //Xpath trang New Project

    public static String buttonNewProject = "//a[contains(@class,'btn-with-tooltip')]/preceding-sibling::a[normalize-space()='New Project']";
    public static String buttonGantt = "//a[normalize-space()='New Project']/following-sibling::a[contains(@class,'btn-with-tooltip')]";
    public static String buttonFilter = "(//a[normalize-space()='New Project']/following-sibling::div)/descendant::i[contains(@class,'fa-filter')]";
    public static String totalNotStarted = "//span[normalize-space()='Not Started']/preceding-sibling::span";
    public static String totalInProgress = "//span[normalize-space()='In Progress']/preceding-sibling::span";
    public static String totalOnHold = "//span[normalize-space()='On Hold']/preceding-sibling::span";
    public static String totalCancelled ="//span[normalize-space()='Cancelled']/preceding-sibling::span";
    public static String totalFinished = "//span[normalize-space()='Finished']/preceding-sibling::span";
    public static String dropdownProjectLength = "(//span[normalize-space()='Export']/ancestor::div)/preceding-sibling::div/descendant::select";
    public static String buttonExport = "(//i[@class='fa fa-refresh']/ancestor::button)/preceding-sibling::button/child::span";
    public static String buttonReload = "(//span[normalize-space()='Export']/ancestor::button)/following-sibling::button/descendant::i";
    public static String inputProjectSearch = "(//span[@class='fa fa-search']/parent::span)/following-sibling::input";
    public static String sortColumn1 = "//th[contains(@aria-label,'Project Name')]/preceding-sibling::th";
    public static String sortProjectName = "//tr[@role='row']/child::th[contains(@aria-label,'Project Name')]";
    public static String sortCustomer = "//tr[@role='row']/child::th[contains(@aria-label,'Customer')]";
    public static String sortTags = "//tr[@role='row']/child::th[contains(@aria-label,'Tags')]";
    public static String sortStartDate = "//tr[@role='row']/child::th[contains(@aria-label,'Start Date')]";
    public static String sortDeadline = "//tr[@role='row']/child::th[contains(@aria-label,'Deadline')]";
    public static String sortMembers = "//tr[@role='row']/child::th[contains(@aria-label,'Members')]";
    public static String sortStatus = "//tr[@role='row']/child::th[contains(@aria-label,'Status')]";

    
}
