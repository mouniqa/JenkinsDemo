package com.mouniqa.testng.test.locators;

public enum HomePageLocatorsEnum {
	userName("//*[@id='login-email']"),
	passWord("//*[@id='login-password']"),
	loginButton("//*[@id='login-submit']");
	
	 private final String name;

     private HomePageLocatorsEnum(String s) {
         name = s;
     }

 }
	
	

