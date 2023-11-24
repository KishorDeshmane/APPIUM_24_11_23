package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0511_profile_legal_faq_page_objects {
	public AndroidDriver driver;

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement faq_title_text;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement back_button;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., WHAT ARE THE BENEFITS?\"]")
	private WebElement question_one;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., WHAT ARE THE BENEFITS?\"]/com.horcrux.svg.SvgView")
	private WebElement question_one_dropdown_arrow;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., WHAT IS PREMIUM PACKAGES?\"]")
	private WebElement question_two;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., WHAT IS PREMIUM PACKAGES?\"]/com.horcrux.svg.SvgView")
	private WebElement question_two_dropdown_arrow;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., LOREM IPSUM\"]")
	private WebElement question_three;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Q., LOREM IPSUM\"]/com.horcrux.svg.SvgView")
	private WebElement question_three_dropdown_arrow;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public F0511_profile_legal_faq_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean faq_title_text_is_displayed() {
		try {
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, faq_title_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, faq_title_text);
		}
		return faq_title_text.isDisplayed();
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

	public boolean question_one_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_one);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_one);
		}
		return question_one.isDisplayed();
	}

	public boolean question_one_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_one);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_one);
		}
		return question_one.isEnabled();
	}

	public boolean question_one_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_one_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_one_dropdown_arrow);
		}
		return question_one_dropdown_arrow.isEnabled();
	}

	public boolean question_two_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_two);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_two);
		}
		return question_two.isDisplayed();
	}

	public boolean question_two_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_two);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_two);
		}
		return question_two.isEnabled();
	}

	public boolean question_two_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_two_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_two_dropdown_arrow);
		}
		return question_two_dropdown_arrow.isEnabled();
	}

	public boolean question_three_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_three);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, question_three);
		}
		return question_three.isDisplayed();
	}

	public boolean question_three_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_three);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_three);
		}
		return question_three.isEnabled();
	}

	public boolean question_three_dropdown_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_three_dropdown_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, question_three_dropdown_arrow);
		}
		return question_three_dropdown_arrow.isEnabled();
	}

}
