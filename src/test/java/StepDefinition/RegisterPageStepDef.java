package StepDefinition;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterPageStepDef extends BaseClass {

	RegisterPage registerpage;
	@Given("User open register page url on {string} browser")
	public void user_open_register_page_url_on_browser(String browsername) {
	   initialization(browsername);
	}

	List<List<String>> ls;
	
	@Then("User enter Firstname lastname phone email")
	public void user_enter_firstname_lastname_phone_email(DataTable dataTable) {
	   
		ls = dataTable.asLists();
		String fisrtname=ls.get(0).get(0);
		String lastname=ls.get(0).get(1);
		String phonenum=ls.get(0).get(2);
		String email=ls.get(0).get(3);
		registerpage=new RegisterPage();
		registerpage.contactInfoFunctionality(fisrtname, lastname, phonenum, email);
		
	}

	@Then("user enters address city state pincode and country")
	public void user_enters_address_city_state_pincode_and_country(DataTable dataTable) {
		ls = dataTable.asLists();
		String address=ls.get(0).get(0);
		String city=ls.get(0).get(1);
		String state=ls.get(0).get(2);
		String postalcode=ls.get(0).get(3);
		String cntry=ls.get(0).get(4);
		//registerpage=new RegisterPage();
		registerpage.mailingFunctionality(address, city, state, postalcode, cntry);
	}

	@Then("User enter username and password and confirm password and click on submit button")
	public void user_enter_username_and_password_and_confirm_password_and_click_on_submit_button(DataTable dataTable) {
		ls = dataTable.asLists();
		String username=ls.get(0).get(0);
		String password=ls.get(0).get(1);
		String cinfirmpass=ls.get(0).get(2);
		registerpage.userInfoFunctionality(username, password, cinfirmpass);
	}
}
