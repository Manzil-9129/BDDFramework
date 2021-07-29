package Stepdefinitons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.ContactPage;
import Pages.CreateAccountPage;
import Util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import java.io.IOException;


import org.junit.Assert;

public class Stepdefinition extends TestBase {
ContactPage CP;
CreateAccountPage C_A_P;
	public Stepdefinition() throws IOException {
		super();
	}
  @Given("^user launches the browser$")
 public void user_launches_the_browser() throws IOException
		{
		  browserinitialize();
		}
		
  
  @Then("^user clicks on the sign link$")
		public void User_clicks() throws IOException{
	  CP=new ContactPage();
	  CP.signB.click();
	  
		}
		
  
		
  @Then("^user enters the email to create new Account$")
		public void user_enter_email() throws IOException
		{
	     C_A_P=new CreateAccountPage();
		 CP.verifydetailspage(pro.getProperty("email3")); 
		 }

  @Then("^user enter the contact details$")
		public void user_enter_the_contact_details()
		{

		 C_A_P.Filldetails_1(pro.getProperty("name"),pro.getProperty("last"),pro.getProperty("pwd"));// Need to fill data
		 
		}
 @Then("^verify the contact details missing error$")
		public void verify_the_contact_details_missing_errors() throws IOException{
			C_A_P.Registerbutton();
			boolean flag=C_A_P.Verifysign_Up_page();
			Assert.assertTrue(flag);
		}

 @Then("^browser get close$")
		public void browser_get_close() {
			driver.quit();
		}
	
	
	


	
	
	
}
