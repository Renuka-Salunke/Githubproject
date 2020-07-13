package com.facebook.stepDefinitions;

import com.facebook.pageObjects.LoginPageObject;

import net.bytebuddy.asm.Advice.Thrown;

public class LoginStepDefinitions extends LoginPageObject{

	LoginPageObject lpo = new LoginPageObject();
	
	@Given("^I am a user of facebook application$")
	 public void i_am_a_user_of_facebook_application()
	 {
		 lpo.openURL();
	 }
	 
	 @When ("^I enter valid username$")
	 public void i_enter_valid_username()
	 {
		 lpo.enterusername();
	 }
	 
	 
	 @When ("^I enter valid password$")
	 public void i_enter_valid_Password()
	 {
		 lpo.enterpassword();
	 }
	 
	 
	 @When ("^I enter valid Login button$")
	 public void i_click_on_Login_button()
	 {
		 lpo.clickloginbutton();
	 }
	 
	 @Then ("^user should be able to log in successfully$")
	 public void user_should_be_able_to_log_in_successfully()
	 {
		 
	 }
	 
	 
}
