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
import com.pages.profile.F0201_Profile_manage_address_objects;
import com.pages.profile.F0202_profile_manage_address_location_confirmation_pop_up_objects;
import com.pages.profile.F0203_profile_manage_address_choose_delivery_location_objects;
import com.pages.profile.F0204_profile_manage_address_add_new_address_page_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class F0204_profile_manage_address_add_new_address_page {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0201_Profile_manage_address_objects pa = new F0201_Profile_manage_address_objects(DriverFactory.getDriver());
	F0202_profile_manage_address_location_confirmation_pop_up_objects plc = new F0202_profile_manage_address_location_confirmation_pop_up_objects(
			DriverFactory.getDriver());
	F0203_profile_manage_address_choose_delivery_location_objects cdl = new F0203_profile_manage_address_choose_delivery_location_objects(
			DriverFactory.getDriver());
	F0204_profile_manage_address_add_new_address_page_objects adn = new F0204_profile_manage_address_add_new_address_page_objects(
			DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(F0204_profile_manage_address_add_new_address_page.class);

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Given("Verify that user is on the profile manage address add new address page of the customer application")
	public void verify_that_user_is_on_the_profile_manage_address_add_new_address_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.manage_address_tab_is_clicked();
		pa.plus_add_new_address_button_is_clicked();
		plc.give_access_button_is_clicked();
		cdl.mobile_pop_up_allow_only_while_using_the_app_button_clicked();
		cdl.enter_complete_address_button_is_clicked();
		boolean actual = adn.add_new_address_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that add new address tilte text should be displayed in manage addresses add new address page")
	public void verify_that_add_new_address_tilte_text_should_be_displayed_in_manage_addresses_add_new_address_page() {
		boolean actual = adn.add_new_address_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in manage addresses add new address page")
	public void verify_that_back_button_should_be_displayed_in_manage_addresses_add_new_address_page() {
		boolean actual = adn.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in manage addresses add new address page")
	public void verify_that_back_button_should_be_clickable_in_manage_addresses_add_new_address_page() {
		boolean actual = adn.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save address as texxt should be displayed in the manage addresses add new address page")
	public void verify_that_save_address_as_text_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.save_address_as_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that home button should be displayed in the manage addresses add new address page")
	public void verify_that_home_button_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.home_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that home button should be clickable in the manage addresses add new address page")
	public void verify_that_home_button_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.home_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that work button should be displayed in the manage addreses add new address page")
	public void verify_that_work_button_should_be_displayed_in_the_manage_addreses_add_new_address_page() {
		boolean actual = adn.work_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that work button should be clickable in the manage addresses add new address page")
	public void verify_that_work_button_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.work_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that other button should be displayed in the manage addresses add new address page")
	public void verify_that_other_button_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.other_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that other button should be clickable in the manage addresses add new address page")
	public void verify_that_other_button_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.other_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save address here text should be displayed in the manage addresses add new address page")
	public void verify_that_save_address_here_text_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.save_address_here_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that address line 1 user field should be displayed in the manage addresses add new address page")
	public void verify_that_address_line_1_user_field_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.address_line_1_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that address line 1 user field should be clickable in the manage adddresses add new address page")
	public void verify_that_address_line_one_user_field_should_be_clickable_in_the_manage_adddresses_add_new_address_page() {
		boolean actual = adn.address_line_1_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that {string} one user field text should be displayed in the manage addresses add new address page")
	public void verify_that_one_user_field_text_should_be_displayed_in_the_manage_addresses_add_new_address_page(
			String string) {
		String actual = adn.address_line_1_user_field_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that address line 2 user field should be displayed in the manage addresses add new address page")
	public void verify_that_address_line_2_user_field_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.address_line_2_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that address line 2 user field should be clickable in the manage addresses add new address page")
	public void verify_that_address_line_user_field_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.address_line_2_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that {string} two user field text should be displayed in the manage addresses add new adddress page")
	public void verify_that_two_user_field_text_should_be_displayed_in_the_manage_addresses_add_new_adddress_page(
			String string) {
		String actual = adn.address_line_two_user_field_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that nearby landmark optional user field should be displayed in the manage addresses add new address page")
	public void verify_that_nearby_landmark_optional_user_field_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.nearby_landmark_optiona_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that nearby landmark optional user field should be clickable in the manage addresses add new address page")
	public void verify_that_nearby_landmark_optional_user_field_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.nearby_landmark_optiona_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that {string} landmark user field text should be displayed in the manage addresses add new adddress page")
	public void verify_that_landmark_user_field_text_should_be_displayed_in_the_manage_addresses_add_new_adddress_page(
			String string) {
		String actual = adn.landmark_user_field_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select city dropdown should be displayed in the manage addresses add new address page")
	public void verify_that_select_city_dropdown_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.select_city_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select city dropdown should be clickable in the manage addresses add new address page")
	public void verify_that_select_city_dropdown_should_be_clickable_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.select_city_dropdown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that UAE text should be displayed in the user field from manage addresses add new address page")
	public void verify_that_uae_text_should_be_displayed_in_the_user_field_from_manage_addresses_add_new_address_page() {
		boolean actual = adn.uae_text_should_be_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save address button should be displayed in the manage addresses add new address page")
	public void verify_that_save_address_button_should_be_displayed_in_the_manage_addresses_add_new_address_page() {
		boolean actual = adn.save_address_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
