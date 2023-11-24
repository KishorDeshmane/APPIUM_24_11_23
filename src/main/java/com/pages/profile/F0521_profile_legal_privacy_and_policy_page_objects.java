package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0521_profile_legal_privacy_and_policy_page_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "")
	private WebElement privacy_and_policy_title_text;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public F0521_profile_legal_privacy_and_policy_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean privacy_and_policy_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, privacy_and_policy_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, privacy_and_policy_title_text);
		}
		return privacy_and_policy_title_text.isDisplayed();
	}

}
