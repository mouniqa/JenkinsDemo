package com.mouniqa.testng.test;

import org.testng.annotations.Test;

import com.mouniqa.testng.test.methods.HomePage;

public class TestNgMavenExampleTest {

	@Test
	public void exampleOfTestNgMaven() {

		System.out.println("This is TestNG-Maven Example");

	}

	@Test
	public void callLogin() {
		System.out.println("Before Login");
		HomePage.login();
		System.out.println("After Login");
	}
}
