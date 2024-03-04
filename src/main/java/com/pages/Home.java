package com.pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	private By mobileBtn   = By.xpath("//*[contains(@resource-id, 'btnmobileNumber')]");
	private By userNameFld = By.xpath("//*[contains(@resource-id, 'editText_username')]");
	private By passwordBtn = By.xpath("//*[contains(@resource-id, 'editText_password')");
	private By loginBtn    = By.xpath("//*[contains(@resource-id, 'button_login')]");
	private By NationalIdFld  = By.xpath("//*[contains(@resource-id, 'et_nationa_id')]");
	private By NationalIDConfirmBtn = By.xpath("//*[contains(@resource-id, 'btn_nation_id_confirm')]");

    private WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public Home dismissAlert() {
		// dismiss alert message
		new TouchActions( driver)
				.performElementAction();

		return this;
	}

	// Generic method to click on navigation menu icons in home page
	public void clickOnNavigationMenuLinks(String navigationLink) {
		new TouchActions( driver)
				//.tap(MobileBy.id(String.format(navigation_link, navigationLink)))
				.performElementAction();
	}



}
