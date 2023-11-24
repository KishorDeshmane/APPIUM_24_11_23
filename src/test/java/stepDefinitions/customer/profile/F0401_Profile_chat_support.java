package stepDefinitions.customer.profile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.A0001_Landing_page_objects;
import com.pages.A0002_Login_page_objects;
import com.pages.A0003_Sign_up_page_objects;
import com.pages.A0004_Verify_otp_page_objects;
import com.pages.home.B0001_Home_page_objects;
import com.pages.profile.F0001_Profile_page_objects;
import com.pages.profile.F0401_Profile_chat_support_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class F0401_Profile_chat_support {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0401_Profile_chat_support_objects pc = new F0401_Profile_chat_support_objects(DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(F0401_Profile_chat_support.class);

	/**
	 * 
	 * 
	 * 
	 * 
	 */

	@Given("Verify that user is on the profile chat support page of the customer application")
	public void verify_that_user_is_on_the_profile_chat_support_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.scroll_body();
		pr.chat_support_tab_is_clicked();
		boolean actual = pc.chat_with_support_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that chat with support title text should be displayed in the profile chat support page")
	public void verify_that_chat_with_support_title_text_should_be_displayed_in_the_profile_chat_support_page() {
		boolean actual = pc.chat_with_support_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the profile chat support page")
	public void verify_that_back_button_should_be_displayed_in_the_profile_chat_support_page() {
		boolean actual = pc.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the profile chat support page")
	public void verify_that_back_button_should_be_clickable_in_the_profile_chat_support_page() {
		boolean actual = pc.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that message user field should displayed in the profile chat support page")
	public void verify_that_message_user_field_should_displayed_in_the_profile_chat_support_page() {
		boolean actual = pc.message_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that {string} mesasge text should be displayed in the message user field in the profile chat support page")
	public void verify_that_mesasge_text_should_be_displayed_in_the_message_user_field_in_the_profile_chat_support_page(
			String string) {
		String actual = pc.mesasge_text_is_displayed();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that message user field should be clickable in the chat support user field in profile chat support page")
	public void verify_that_message_user_field_should_be_clickable_in_the_chat_support_user_field_in_profile_chat_support_page() {
		boolean actual = pc.message_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that pin icon should be displayed in the profile chat support page")
	public void verify_that_pin_icon_should_be_displayed_in_the_profile_chat_support_page() {
		boolean actual = pc.pin_icon_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that pin icon should be clickable in the profile chat support page")
	public void verify_that_pin_icon_should_be_clickable_in_the_profile_chat_support_page() {
		boolean actual = pc.pin_icon_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that aeroplane icon button should be displayed in the profile chat support page")
	public void verify_that_aeroplane_icon_button_should_be_displayed_in_the_profile_chat_support_page() {
		boolean actual = pc.aeroplane_icon_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that aeroplane icon button should be clickable in the profile chat support page")
	public void verify_that_aeroplane_icon_button_should_be_clickable_in_the_profile_chat_support_page() {
		boolean actual = pc.aeroplane_icon_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
