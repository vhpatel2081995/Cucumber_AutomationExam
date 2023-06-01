package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;
import pages.TestBase;

public class ListStepDefination extends TestBase {

	ListPage listpage;
 
	@Before
	public void beforeStartMethod() {
		init();
		listpage = PageFactory.initElements(driver, ListPage.class); 
		driver.get("https://techfios.com/test/101/");
		takeScreenShot(driver);
	}
	

@Given("The {string} button exists in {string} field")
public void the_button_exists_in_field(String button, String buttonField) {
	switch(buttonField){
	case "SetSkyBlueBackground":
		listpage.validatSkyBlueBackgroundButtonExists();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		break;
	
	case "SetWhiteBackground":
		listpage.validateWhiteBackgroundButtonExists();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		break;
		
	default:
		System.out.println("Unable to Validate that Change Background Color Buttons Exist");	
	}
}

@When("I click on the {string} button in the {string} field")
public void i_click_on_the_button_in_the_field(String button, String buttonField) {
	switch(buttonField){
	case "SetSkyBlueBackground":
		listpage.clickOnSetSkyBlueBackground();
		break;
		
	case "SetWhiteBackground":
		listpage.clickOnSetWhiteBackground();
		break;
		
	default:
		System.out.println("Unable to click on Change Background Color Buttons");	
	}
}

@Then("The background color will change to {string} in the {string} field")
public void the_background_color_will_change_to_in_the_field(String buttonBackground , String buttonBackgroundField) {
	switch(buttonBackgroundField){
	case "SkyBlueBackground":
		listpage.validateSkyBlueBackground();
		break;
		
	case "WhiteBackground":
		listpage.validateWhiteBackground();
		break;
		
	default:
		System.out.println("Unable to Validate Background Color has Changed");	
		
	}
}

@After
public void tearDown() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
		}
	driver.close();
	driver.quit();
}

}
