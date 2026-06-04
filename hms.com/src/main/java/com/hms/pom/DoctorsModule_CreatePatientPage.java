package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorsModule_CreatePatientPage {
	@FindBy(xpath = "//button[contains(text(),'Add Patient')]")
	private WebElement addPatientBtn;
	
	//ADD Patient Modal
	@FindBy(name = "name")
	private WebElement patientNameTxtField;
	
	@FindBy(name = "email")
	private WebElement patientEmailTxtField;
	
	@FindBy(name = "password")
	private WebElement patientPasswordTxtField;
	
	@FindBy(name="address")
	private WebElement patientAddressTxtField;
	
	@FindBy(name="phone")
	private WebElement patientPhoneNumberTxtField;
	
	@FindBy(name = "sex")
	private WebElement patientGenderDropdown;
	
	@FindBy(name = "birth_date")
	private WebElement patientBirthDateField;
	
	@FindBy(name = "age")
	private WebElement patientAgeTxtField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement patientSubmitBtn;
	
	public DoctorsModule_CreatePatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddPatientBtn() {
		return addPatientBtn;
	}

	public WebElement getPatientNameTxtField() {
		return patientNameTxtField;
	}

	public WebElement getPatientEmailTxtField() {
		return patientEmailTxtField;
	}

	public WebElement getPatientPasswordTxtField() {
		return patientPasswordTxtField;
	}

	public WebElement getPatientAddressTxtField() {
		return patientAddressTxtField;
	}

	public WebElement getPatientPhoneNumberTxtField() {
		return patientPhoneNumberTxtField;
	}

	public WebElement getPatientGenderDropdown() {
		return patientGenderDropdown;
	}

	public WebElement getPatientBirthDateField() {
		return patientBirthDateField;
	}

	public WebElement getPatientAgeTxtField() {
		return patientAgeTxtField;
	}

	public WebElement getPatientSubmitBtn() {
		return patientSubmitBtn;
	}	
}
