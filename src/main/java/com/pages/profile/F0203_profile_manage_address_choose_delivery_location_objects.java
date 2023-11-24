package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0203_profile_manage_address_choose_delivery_location_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * mobile Nokia C3 Pop up
	 * 
	 */

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement mobile_pop_up_allow_only_while_using_the_app;

	/**
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement choose_delivery_location_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement back_button;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement search_icon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement search_user_field;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Sharjah International Airport - Sharjah - United Arab Emirates\"]")
	private WebElement searched_location_sharjah_international_airport;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")
	private WebElement map;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
	private WebElement map_location_red_icon_in_mid;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement map_location_blue_icon;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"ENTER COMPLETE ADDRESS\"]")
	private WebElement enter_complete_address_button;

	/**
	 * 
	 * 
	 * 
	 *
	 */

	public F0203_profile_manage_address_choose_delivery_location_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 */

	public void mobile_pop_up_allow_only_while_using_the_app_button_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_pop_up_allow_only_while_using_the_app);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_pop_up_allow_only_while_using_the_app);
		}
		mobile_pop_up_allow_only_while_using_the_app.click();
	}

	public boolean choose_delivery_location_title_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, choose_delivery_location_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, choose_delivery_location_title_text);
		}
		return choose_delivery_location_title_text.isDisplayed();
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

	public boolean search_icon_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_icon);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_icon);
		}
		return search_icon.isDisplayed();
	}

	public boolean search_icon_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_icon);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_icon);
		}
		return search_icon.isEnabled();
	}

	public boolean search_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_user_field);
		}
		return search_user_field.isDisplayed();
	}

	public boolean search_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		}
		return search_user_field.isEnabled();
	}

	public void search_user_field_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		}
		search_user_field.click();
	}

	public void search_user_field_send_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, search_user_field);
		}
		search_user_field.sendKeys(string);
	}

	public String searched_location_name_of_sharjah() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10,
					searched_location_sharjah_international_airport);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10,
					searched_location_sharjah_international_airport);
		}
		return searched_location_sharjah_international_airport.getAttribute("content-desc");
	}

	public String search_user_field_placeholder_text() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, search_user_field);
		}
		return search_user_field.getText();
	}

	public boolean map_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map);
		}
		return map.isDisplayed();
	}

	public boolean map_location_red_icon_in_mid_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map_location_red_icon_in_mid);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map_location_red_icon_in_mid);
		}
		return map_location_red_icon_in_mid.isDisplayed();
	}

	public boolean map_location_blue_icon_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map_location_blue_icon);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, map_location_blue_icon);
		}
		return map_location_blue_icon.isDisplayed();
	}

	public boolean enter_complete_address_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, enter_complete_address_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, enter_complete_address_button);
		}
		return enter_complete_address_button.isDisplayed();
	}

	public boolean enter_complete_address_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_complete_address_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_complete_address_button);
		}
		return enter_complete_address_button.isEnabled();
	}

	public void enter_complete_address_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_complete_address_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, enter_complete_address_button);
		}
		enter_complete_address_button.click();
	}

}
