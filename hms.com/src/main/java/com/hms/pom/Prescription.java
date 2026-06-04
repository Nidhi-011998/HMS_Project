package com.hms.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Prescription {

	@FindBy(xpath="//span[text()='Prescription']")
	private WebElement prescriptionTab;
	
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement addPresBtn;

	@FindBy(xpath="//input[@placeholder='date here']")
	private WebElement dateDD;
	
	@FindBy(xpath="//td[@class='active day']")
	private WebElement selectDate;
	
	@FindBy(xpath="//input[@name='time_timestamp']")
	private WebElement pickTime;
	
	@FindBy(xpath="(//span[@class='select2-match'])[2]")
	private WebElement patientNameDropDown;
	
	@FindBy(xpath="//div[contains(@class, 'form-group')][3]//iframe[@class='wysihtml5-sandbox']")
	private WebElement patientCaseHistoryTextArea;
	
	@FindBy(xpath="//div[contains(@class, 'form-group')][4]//iframe[@class='wysihtml5-sandbox']")
	private WebElement patientMedicationTextArea;
	
	@FindBy(xpath="//div[contains(@class, 'form-group')][5]//iframe[@class='wysihtml5-sandbox']")
	private WebElement patientNoteTextArea;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	public Prescription(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getPrescriptionTab() {
		return prescriptionTab;
	}

	public WebElement getAddPresBtn() {
		return addPresBtn;
	}

	public WebElement getDateDD() {
		return dateDD;
	}

	public WebElement getSelectDate() {
		return selectDate;
	}

	public WebElement getPickTime() {
		return pickTime;
	}

	public WebElement getPatientNameDropDown() {
		return patientNameDropDown;
	}

	public WebElement getPatientCaseHistoryTextArea() {
		return patientCaseHistoryTextArea;
	}

	public WebElement getPatientMedicationTextArea() {
		return patientMedicationTextArea;
	}

	public WebElement getPatientNoteTextArea() {
		return patientNoteTextArea;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
}
