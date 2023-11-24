package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0204_profile_manage_address_add_new_address_page_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement add_new_address_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView")
	private WebElement back_button;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement save_address_as_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home\"]/android.widget.TextView")
	private WebElement home_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Work\"]/android.widget.TextView")
	private WebElement work_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Other\"]/android.widget.TextView")
	private WebElement other_button;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement save_address_here_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement address_line_1_user_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement address_line_2_user_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement nearby_landmark_optiona_user_field;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	private WebElement select_city_dropdown;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")
	private WebElement uae_text;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SAVE ADDRESS\"]")
	private WebElement save_address_button;

	/**
	 * 
	 * 
	 *
	 */

	public F0204_profile_manage_address_add_new_address_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 *
	 */

	public boolean add_new_address_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_new_address_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_new_address_title_text);
		}
		return add_new_address_title_text.isDisplayed();
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

	public boolean save_address_as_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_as_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_as_text);
		}
		return save_address_as_text.isDisplayed();
	}

	public boolean home_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, home_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, home_button);
		}
		return home_button.isDisplayed();
	}

	public boolean home_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, home_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, home_button);
		}
		return home_button.isEnabled();
	}

	public boolean work_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, work_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, work_button);
		}
		return work_button.isDisplayed();
	}

	public boolean work_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, work_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, work_button);
		}
		return work_button.isEnabled();
	}

	public boolean other_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, other_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, other_button);
		}
		return other_button.isDisplayed();
	}

	public boolean other_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, other_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, other_button);
		}
		return other_button.isEnabled();
	}

	public boolean save_address_here_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_here_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_here_text);
		}
		return save_address_here_text.isDisplayed();
	}

	public boolean address_line_1_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, address_line_1_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, address_line_1_user_field);
		}
		return address_line_1_user_field.isDisplayed();
	}

	public boolean address_line_1_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_1_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_1_user_field);
		}
		return address_line_1_user_field.isEnabled();
	}

	public String address_line_1_user_field_text() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_1_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_1_user_field);
		}
		return address_line_1_user_field.getText();
	}

	public boolean address_line_2_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, address_line_2_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, address_line_2_user_field);
		}
		return address_line_2_user_field.isDisplayed();
	}

	public boolean address_line_2_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_2_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_2_user_field);
		}
		return address_line_2_user_field.isEnabled();
	}

	public String address_line_two_user_field_text() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_2_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, address_line_2_user_field);
		}
		return address_line_2_user_field.getText();
	}

	public boolean nearby_landmark_optiona_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, nearby_landmark_optiona_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, nearby_landmark_optiona_user_field);
		}
		return nearby_landmark_optiona_user_field.isDisplayed();
	}

	public boolean nearby_landmark_optiona_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, nearby_landmark_optiona_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, nearby_landmark_optiona_user_field);
		}
		return nearby_landmark_optiona_user_field.isEnabled();
	}

	public String landmark_user_field_text() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, nearby_landmark_optiona_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, nearby_landmark_optiona_user_field);
		}
		return nearby_landmark_optiona_user_field.getText();
	}

	public boolean select_city_dropdown_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_city_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_city_dropdown);
		}
		return select_city_dropdown.isDisplayed();
	}

	public boolean select_city_dropdown_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_city_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_city_dropdown);
		}
		return select_city_dropdown.isEnabled();
	}

	public boolean uae_text_should_be_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, uae_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, uae_text);
		}
		return uae_text.isDisplayed();
	}

	public boolean save_address_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_address_button);
		}
		return save_address_button.isDisplayed();
	}

}
