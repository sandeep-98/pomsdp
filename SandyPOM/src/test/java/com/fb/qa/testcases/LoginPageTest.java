package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage homepage;
	
	public LoginPageTest(){
		super();
	}	
		@BeforeMethod
		public void SetuP(){
			initilization();
			LoginPage login = new LoginPage();
		}
		@Test(priority = 1)
		public void loginPageTitleTest(){
			String title =login.ValidateLoginPageTitle();
			Assert.assertEquals(title, "(46)Facebook");
		}
		@Test(priority = 2)
		public void fbLogoTest(){
		boolean b =	login.ValidateFacebookImage();
		Assert.assertTrue(b);
		}
		@Test(priority= 3)
		public void logintest(){
			homepage = login.Login(prop.getProperty("username"), prop.getProperty("password"));
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
	}


