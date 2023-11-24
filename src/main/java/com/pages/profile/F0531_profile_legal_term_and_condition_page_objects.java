package com.pages.profile;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0531_profile_legal_term_and_condition_page_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement term_and_condition_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement back_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"1, APP USAGE\"]")
	private WebElement one_app_usage_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"1, APP USAGE\"]/com.horcrux.svg.SvgView")
	private WebElement one_app_usage_dropdown_arrow;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"2, USER ACCOUNT\"]")
	private WebElement two_user_account_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"2, USER ACCOUNT\"]/com.horcrux.svg.SvgView")
	private WebElement two_user_account_dropdown_arrow;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"3, SERVICE LISTINGS AND TRANSACTIONS\"]")
	private WebElement three_service_listing_and_transactions_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"3, SERVICE LISTINGS AND TRANSACTIONS\"]/com.horcrux.svg.SvgView")
	private WebElement three_service_listing_and_transactions_dropdown_arrow;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"4, PAYMENTS\"]")
	private WebElement four_payments_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"4, PAYMENTS\"]/com.horcrux.svg.SvgView")
	private WebElement four_payments_dropdown_arrow;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public F0531_profile_legal_term_and_condition_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean term_and_condition_title_text_is_displayed() {
		try {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, term_and_condition_title_text);
		} catch (StaleElementReferenceException e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, term_and_condition_title_text);
		}
		return term_and_condition_title_text.isDisplayed();
	}

	public boolean back_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		return back_button.isEnabled();
	}

	public boolean back_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		}
		return back_button.isDisplayed();
	}

	public boolean one_app_usage_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, one_app_usage_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, one_app_usage_text);
		}
		return one_app_usage_text.isEnabled();
	}

	public boolean one_app_usage_text_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, one_app_usage_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, one_app_usage_text);
		}
		return one_app_usage_text.isEnabled();
	}

	public boolean one_app_usage_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, one_app_usage_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, one_app_usage_dropdown_arrow);
		}
		return one_app_usage_dropdown_arrow.isEnabled();
	}

	public boolean two_user_account_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, two_user_account_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, two_user_account_text);
		}
		return two_user_account_text.isDisplayed();
	}

	public boolean two_user_account_text_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, two_user_account_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, two_user_account_text);
		}
		return two_user_account_text.isEnabled();
	}

	public boolean two_user_account_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, two_user_account_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, two_user_account_dropdown_arrow);
		}
		return two_user_account_dropdown_arrow.isEnabled();
	}

	public boolean three_service_listing_and_transactions_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, three_service_listing_and_transactions_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, three_service_listing_and_transactions_text);
		}
		return three_service_listing_and_transactions_text.isDisplayed();
	}

	public boolean three_service_listing_and_transactions_text_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, three_service_listing_and_transactions_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, three_service_listing_and_transactions_text);
		}
		return three_service_listing_and_transactions_text.isEnabled();
	}

	public boolean three_service_listing_and_transactions_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10,
					three_service_listing_and_transactions_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10,
					three_service_listing_and_transactions_dropdown_arrow);
		}
		return three_service_listing_and_transactions_dropdown_arrow.isEnabled();
	}

	public boolean four_payments_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, four_payments_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, four_payments_text);
		}
		return four_payments_text.isDisplayed();
	}

	public boolean four_payments_text_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, four_payments_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, four_payments_text);
		}
		return four_payments_text.isEnabled();
	}

	public boolean four_payments_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, four_payments_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, four_payments_dropdown_arrow);
		}
		return four_payments_dropdown_arrow.isEnabled();
	}

}
