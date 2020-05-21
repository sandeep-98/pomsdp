package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage  extends TestBase{
	//page factory---or
		@FindBy(xpath="//input[@id='email']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='pass']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='u_0_b']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//i[@class='fb_logo img sp_ZgriaaiF44o sx_da979b']")
		WebElement fbLogo;
		
		//initialize the page objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		//actions/functionalities:
		public String ValidateLoginPageTitle(){
			return driver.getTitle();
		}
		public boolean ValidateFacebookImage(){
			return fbLogo.isDisplayed();
		}
		public HomePage Login(String un,String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			return new HomePage();
		}
	}



