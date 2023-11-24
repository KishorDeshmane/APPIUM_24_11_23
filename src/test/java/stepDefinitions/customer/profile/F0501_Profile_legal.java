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
import com.pages.profile.F0501_profile_legal_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class F0501_Profile_legal {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0501_profile_legal_objects pl = new F0501_profile_legal_objects(DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(F0501_Profile_legal.class);

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Given("Verify that user is on the profile legal page of the customer application")
	public void verify_that_user_is_on_the_profile_legal_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.scroll_body();
		pr.legal_tab_is_clicked();
		boolean actual = pl.legal_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that legal title text should be displayed in the profile legal page")
	public void verify_that_legal_title_text_should_be_displayed_in_the_profile_legal_page() {
		boolean actual = pl.legal_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the profile legal page")
	public void verify_that_back_button_should_be_displayed_in_the_profile_legal_page() {
		boolean actual = pl.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the profile legal page")
	public void verify_that_back_button_should_be_clickable_in_the_profile_legal_page() {
		boolean actual = pl.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that FAQ link should be dislayed in the profile legal page")
	public void verify_that_faq_link_should_be_dislayed_in_the_profile_legal_page() {
		boolean actual = pl.faq_link_is_dislayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that FAQ link should be clickable in the profile legal page")
	public void verify_that_faq_link_should_be_clickable_in_the_profile_legal_page() {
		boolean actual = pl.faq_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that privacy policy link should be displayed in the profile legal page")
	public void verify_that_privacy_policy_link_should_be_displayed_in_the_profile_legal_page() {
		boolean actual = pl.privacy_policy_link_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that privacy policy link should be clickable in the profile legal page")
	public void verify_that_privacy_policy_link_should_be_clickable_in_the_profile_legal_page() {
		boolean actual = pl.privacy_policy_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that term and conditions link should be displayed in the profile legal page")
	public void verify_that_term_and_conditions_link_should_be_displayed_in_the_profile_legal_page() {
		boolean actual = pl.term_and_conditions_link_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that term and conditions link should be clickable in the profile legal page")
	public void verify_that_term_and_conditions_link_should_be_clickable_in_the_profile_legal_page() {
		boolean actual = pl.term_and_conditions_link_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
