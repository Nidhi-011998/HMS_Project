package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPatient {
	
	@FindBy(xpath="//button[@data-toggle='dropdown' and contains(.,'Action')]")
	private WebElement actionbtn;

@FindBy(xpath="//a[contains(@onclick,'edit_patient/10')]")
private WebElement editpatientclick;

@FindBy(name="name")
private WebElement editPatientNamefld;

@FindBy(name="email")
private WebElement editPatientEmailfield;

@FindBy(name="address")
private WebElement editPatientAddressfld;

@FindBy(name="phone")
		private WebElement editPatientPhonefld;

@FindBy(name="sex")
private WebElement editPatientGenderDropDown;

@FindBy(name="birth_date")
private WebElement editPatientDobfld;

@FindBy(name="age")
private WebElement editPatientagefld;

@FindBy(name="blood_group")
private WebElement editPatientBloodgrpfld;

@FindBy(name="image")
private WebElement editPatienteditPatientmagefld;

@FindBy(xpath="//input[@class='btn btn-success']")
private WebElement editPatientUpdatebtn;


public EditPatient(WebDriver driver) {
	PageFactory.initElements(driver, this);	

}


public WebElement getActionbtn() {
	return actionbtn;
}


public WebElement getEditpatientclick() {
	return editpatientclick;
}


public WebElement getEditPatientNamefld() {
	return editPatientNamefld;
}


public WebElement getEditPatientEmailfield() {
	return editPatientEmailfield;
}


public WebElement getEditPatientAddressfld() {
	return editPatientAddressfld;
}


public WebElement getEditPatientPhonefld() {
	return editPatientPhonefld;
}


public WebElement getEditPatientGenderDropDown() {
	return editPatientGenderDropDown;
}


public WebElement getEditPatientDobfld() {
	return editPatientDobfld;
}


public WebElement getEditPatientagefld() {
	return editPatientagefld;
}


public WebElement getEditPatientBloodgrpfld() {
	return editPatientBloodgrpfld;
}


public WebElement getEditPatienteditPatientmagefld() {
	return editPatienteditPatientmagefld;
}


public WebElement getEditPatientUpdatebtn() {
	return editPatientUpdatebtn;
}

}
