package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0302_profile_adding_a_tenant_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement adding_a_tenant_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement back_button;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement name_of_the_tenant_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement name_of_the_tenant_user_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement email_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement email_user_field;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, \"]")
	private WebElement country_code;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement mobile_number_user_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement select_permissions_to_tenant_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement ppm_text;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"+\"])[1]/android.widget.TextView")
	private WebElement ppm_plus_sign;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView")
	private WebElement ppm_integer_value;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"-\"])[1]/android.widget.TextView")
	private WebElement ppm_minus_sign;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
	private WebElement mep_text;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"+\"])[2]/android.widget.TextView")
	private WebElement mep_plus_sign;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
	private WebElement mep_integer_value;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"-\"])[2]/android.widget.TextView")
	private WebElement mep_minus_sign;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]")
	private WebElement credit_aed_text;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"+\"])[3]/android.widget.TextView")
	private WebElement credit_aed_plus_sign;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")
	private WebElement credit_aed_integer_value;

	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"-\"])[3]/android.widget.TextView")
	private WebElement credit_aed_minus_sign;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SAVE TENANT\"]")
	private WebElement save_tenant_button;

	/**
	 * 
	 * 
	 * 
	 */

	public F0302_profile_adding_a_tenant_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */

	public boolean adding_a_tenant_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, adding_a_tenant_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, adding_a_tenant_title_text);
		}
		return adding_a_tenant_title_text.isDisplayed();
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

	public boolean name_of_the_tenant_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_of_the_tenant_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_of_the_tenant_text);
		}
		return name_of_the_tenant_text.isDisplayed();
	}

	public boolean name_of_the_tenant_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_of_the_tenant_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_of_the_tenant_user_field);
		}
		return name_of_the_tenant_user_field.isDisplayed();
	}

	public boolean name_of_the_tenant_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_of_the_tenant_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_of_the_tenant_user_field);
		}
		return name_of_the_tenant_user_field.isEnabled();
	}

	public boolean email_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_text);
		}
		return email_text.isDisplayed();
	}

	public boolean email_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		}
		return email_user_field.isDisplayed();
	}

	public boolean email_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		}
		return email_user_field.isEnabled();
	}

	public boolean country_code_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code);
		}
		return country_code.isDisplayed();
	}

	public boolean country_code_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code);
		}
		return country_code.isEnabled();
	}

	public boolean mobile_number_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mobile_number_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mobile_number_user_field);
		}
		return mobile_number_user_field.isDisplayed();
	}

	public boolean mobile_number_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_number_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_number_user_field);
		}
		return mobile_number_user_field.isEnabled();
	}

	public String mobile_number_user_field_text() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_number_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_number_user_field);
		}
		return mobile_number_user_field.getText();
	}

	public boolean select_permissions_to_tenant_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_permissions_to_tenant_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_permissions_to_tenant_text);
		}
		return select_permissions_to_tenant_text.isDisplayed();
	}

	public boolean ppm_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_text);
		}
		return ppm_text.isDisplayed();
	}

	public boolean ppm_plus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_plus_sign);
		}
		return ppm_plus_sign.isDisplayed();
	}

	public boolean ppm_plus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, ppm_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, ppm_plus_sign);
		}
		return ppm_plus_sign.isEnabled();
	}

	public boolean ppm_integer_value_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_integer_value);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_integer_value);
		}
		return ppm_integer_value.isDisplayed();
	}

	public boolean ppm_minus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, ppm_minus_sign);
		}
		return ppm_minus_sign.isDisplayed();
	}

	public boolean ppm_minus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, ppm_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, ppm_minus_sign);
		}
		return ppm_minus_sign.isEnabled();
	}

	public boolean mep_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_text);
		}
		return mep_text.isDisplayed();
	}

	public boolean mep_plus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_plus_sign);
		}
		return mep_plus_sign.isDisplayed();
	}

	public boolean mep_plus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mep_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mep_plus_sign);
		}
		return mep_plus_sign.isEnabled();
	}

	public boolean mep_integer_value_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_integer_value);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_integer_value);
		}
		return mep_integer_value.isDisplayed();
	}

	public boolean mep_minus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mep_minus_sign);
		}
		return mep_minus_sign.isDisplayed();
	}

	public boolean mep_minus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mep_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mep_minus_sign);
		}
		return mep_minus_sign.isEnabled();
	}

	public boolean credit_aed_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_text);
		}
		return credit_aed_text.isDisplayed();
	}

	public boolean credit_aed_plus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_plus_sign);
		}
		return credit_aed_plus_sign.isDisplayed();
	}

	public boolean credit_aed_plus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, credit_aed_plus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, credit_aed_plus_sign);
		}
		return credit_aed_plus_sign.isEnabled();
	}

	public boolean credit_aed_integer_value_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_integer_value);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_integer_value);
		}
		return credit_aed_integer_value.isDisplayed();
	}

	public boolean credit_aed_minus_sign_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, credit_aed_minus_sign);
		}
		return credit_aed_minus_sign.isDisplayed();
	}

	public boolean credit_aed_minus_sign_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, credit_aed_minus_sign);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, credit_aed_minus_sign);
		}
		return credit_aed_minus_sign.isEnabled();
	}

	public boolean save_tenant_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_tenant_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_tenant_button);
		}
		return save_tenant_button.isDisplayed();
	}

}
