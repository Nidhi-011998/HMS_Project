package com.hms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientAppointmentPage {
	
	@FindBy(xpath = "//button[contains(text(),'Apply For Appointment')]")
	private WebElement ApplyAppointmentButton;
	
	public PatientAppointmentPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
	
}
