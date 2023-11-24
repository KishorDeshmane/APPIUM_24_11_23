package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0301_Profile_manage_tenants_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement manage_tenants_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement back_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Add new Tenant\"]")
	private WebElement plus_add_new_tenant_button;

	/**
	 * 
	 * 
	 * 
	 */

	public F0301_Profile_manage_tenants_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */

	public boolean manage_tenants_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_tenants_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_tenants_title_text);
		}
		return manage_tenants_title_text.isDisplayed();
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

	public boolean plus_add_new_tenant_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, plus_add_new_tenant_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, plus_add_new_tenant_button);
		}
		return plus_add_new_tenant_button.isDisplayed();
	}

	public boolean plus_add_new_tenant_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		return plus_add_new_tenant_button.isEnabled();
	}

	public void plus_add_new_tenant_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		plus_add_new_tenant_button.click();
	}

}
