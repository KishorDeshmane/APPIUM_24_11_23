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
import com.pages.profile.F0301_Profile_manage_tenants_objects;
import com.pages.profile.F0302_profile_adding_a_tenant_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class F0302_profile_adding_a_tenant {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0301_Profile_manage_tenants_objects pt = new F0301_Profile_manage_tenants_objects(DriverFactory.getDriver());
	F0302_profile_adding_a_tenant_objects pa = new F0302_profile_adding_a_tenant_objects(DriverFactory.getDriver());

	Logger logger = LogManager.getLogger(F0302_profile_adding_a_tenant.class);

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

	@Given("Verify that user is on the profile adding a tenant page of the customer application")
	public void verify_that_user_is_on_the_profile_adding_a_tenant_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.scroll_body();
		pr.add_a_tenant_tab_is_clicked();
		pt.plus_add_new_tenant_button_is_clicked();
		boolean actual = pa.adding_a_tenant_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that adding a tenant title text should be displayed in the adding a tenant manage page")
	public void verify_that_adding_a_tenant_title_text_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.adding_a_tenant_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the adding a tenant manage page")
	public void verify_that_back_button_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the adding a tenant manage page")
	public void verify_that_back_button_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name of the tenant text should be displayed in the user field in the adding a tenant manage page")
	public void verify_that_name_of_the_tenant_text_should_be_displayed_in_the_user_field_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.name_of_the_tenant_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name of the tenant user field should be displayed in the adding a tenant manage page")
	public void verify_that_name_of_the_tenant_user_field_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.name_of_the_tenant_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name of the tenant user field should be clickable in the adding a tenant manage page")
	public void verify_that_name_of_the_tenant_user_field_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.name_of_the_tenant_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email text should be displayed in the user field in the adding a tenant manage page")
	public void verify_that_email_text_should_be_displayed_in_the_user_field_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.email_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be displayed in the adding a tenant manage page")
	public void verify_that_email_user_field_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.email_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be clickable in the adding a tenant manage page")
	public void verify_that_email_user_field_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.email_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code should be displayed in the adding a tenant manage page")
	public void verify_that_country_code_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.country_code_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code should be clickable in the adding a tenant manage page")
	public void verify_that_country_code_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.country_code_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be displayed in the adding a tenant manage page")
	public void verify_that_mobile_number_user_field_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mobile_number_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be clickable in the adding a tenant manage page")
	public void verify_that_mobile_number_user_field_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mobile_number_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that {string} text should be displayed in the mobile number user field in adding a tenant manage page")
	public void verify_that_text_should_be_displayed_in_the_mobile_number_user_field_in_adding_a_tenant_manage_page(
			String string) {
		String actual = pa.mobile_number_user_field_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select permissions to tenant text should be displayed in the adding a tenant manage page")
	public void verify_that_select_permissions_to_tenant_text_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.select_permissions_to_tenant_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm text should be displayed in the adding a tenant manage page")
	public void verify_that_ppm_text_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm plus sign should be displayed in the adding a tenant manage page")
	public void verify_that_ppm_plus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_plus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm plus sign should be clickable in the adding a tenant manage page")
	public void verify_that_ppm_plus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_plus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm integer value should be displayed in the adding a tenant manage page")
	public void verify_that_ppm_integer_value_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_integer_value_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm minus sign should be displayed in the adding a tenant manage page")
	public void verify_that_ppm_minus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_minus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that ppm minus sign should be clickable in the adding a tenant manage page")
	public void verify_that_ppm_minus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.ppm_minus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep text should be displayed in the adding a tenant manage page")
	public void verify_that_mep_text_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep plus sign should be displayed in the adding a tenant manage page")
	public void verify_that_mep_plus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_plus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep plus sign should be clickable in the adding a tenant manage page")
	public void verify_that_mep_plus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_plus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep integer value should be displayed in the adding a tenant manage page")
	public void verify_that_mep_integer_value_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_integer_value_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep minus sign should be displayed in the adding a tenant manage page")
	public void verify_that_mep_minus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_minus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mep minus sign should be clickable in the adding a tenant manage page")
	public void verify_that_mep_minus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.mep_minus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed text should be displayed in the adding a tenant manage page")
	public void verify_that_credit_aed_text_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed plus sign should be displayed in the adding a tenant manage page")
	public void verify_that_credit_aed_plus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_plus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed plus sign should be clickable in the adding a tenant manage page")
	public void verify_that_credit_aed_plus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_plus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed integer value should be displayed in the adding a tenant manage page")
	public void verify_that_credit_aed_integer_value_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_integer_value_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed minus sign should be displayed in the adding a tenant manage page")
	public void verify_that_credit_aed_minus_sign_should_be_displayed_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_minus_sign_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that credit aed minus sign should be clickable in the adding a tenant manage page")
	public void verify_that_credit_aed_minus_sign_should_be_clickable_in_the_adding_a_tenant_manage_page() {
		boolean actual = pa.credit_aed_minus_sign_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save tenant button should be displayed in the adding a tenant page")
	public void verify_that_save_tenant_button_should_be_displayed_in_the_adding_a_tenant_page() {
		boolean actual = pa.save_tenant_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 */

}
