package com.pages.profile;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0501_profile_legal_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement legal_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement back_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"FAQ\"]/android.widget.TextView")
	private WebElement faq_link;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Privacy Policy\"]/android.widget.TextView")
	private WebElement privacy_policy_link;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Terms & Conditions\"]/android.widget.TextView")
	private WebElement term_and_conditions_link;

	/**
	 * 
	 * 
	 * 
	 *
	 */

	public F0501_profile_legal_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */

	public boolean legal_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal_title_text);
		}
		return legal_title_text.isDisplayed();
	}

	public boolean back_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		}
		return back_button.isDisplayed();
	}

	public boolean back_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		return back_button.isEnabled();
	}

	public void back_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		back_button.click();
	}

	public boolean faq_link_is_dislayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, faq_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, faq_link);
		}
		return faq_link.isDisplayed();
	}

	public boolean faq_link_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, faq_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, faq_link);
		}
		return faq_link.isEnabled();
	}

	public void faq_link_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, faq_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, faq_link);
		}
		faq_link.click();
	}

	public boolean privacy_policy_link_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, privacy_policy_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, privacy_policy_link);
		}
		return privacy_policy_link.isDisplayed();
	}

	public boolean privacy_policy_link_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, privacy_policy_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, privacy_policy_link);
		}
		return privacy_policy_link.isEnabled();
	}

	public void privacy_policy_link_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, privacy_policy_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, privacy_policy_link);
		}
		privacy_policy_link.click();
	}

	public boolean term_and_conditions_link_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, term_and_conditions_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, term_and_conditions_link);
		}
		return term_and_conditions_link.isDisplayed();
	}

	public boolean term_and_conditions_link_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, term_and_conditions_link);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, term_and_conditions_link);
		}
		return term_and_conditions_link.isEnabled();
	}

	public void term_and_conditions_link_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, term_and_conditions_link);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, term_and_conditions_link);
		}
		term_and_conditions_link.click();
	}

}
