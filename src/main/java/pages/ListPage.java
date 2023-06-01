package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListPage {

	WebDriver driver;

	public ListPage(WebDriver driver) {
		this.driver =driver;
	}

	@FindBy(how=How.CSS, using = "button[onclick='myFunctionSky()']" ) WebElement SKYBLUE_BACKGROUND_BUTTON;
	@FindBy(how=How.CSS, using = "button[onclick='myFunctionWhite()']" ) WebElement WHITE_BACKGROUND_BUTTON;
	@FindBy(how=How.CSS, using = "body[style='background-color: white;']" ) WebElement WHITE_BACKGROUND_VALIDATION_ELEMENT;
	@FindBy(how=How.CSS, using = "body[style='background-color: skyblue;']" ) WebElement SKYBLUE_BACKGROUND_VALIDATION_ELEMENT;
	
	public void clickOnSetSkyBlueBackground() {
      SKYBLUE_BACKGROUND_BUTTON.click();
      try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

	public void clickOnSetWhiteBackground() {
         WHITE_BACKGROUND_BUTTON.click();
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean validatSkyBlueBackgroundButtonExists() {
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return SKYBLUE_BACKGROUND_BUTTON.isDisplayed();
		 
	 }
	 public boolean validateWhiteBackgroundButtonExists() {

		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return WHITE_BACKGROUND_BUTTON.isDisplayed();
		 
	 }
	
	
	 public boolean validateSkyBlueBackground() {
			SKYBLUE_BACKGROUND_VALIDATION_ELEMENT.click(); 
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return SKYBLUE_BACKGROUND_BUTTON.isDisplayed();
		 
	 }
	 
	 public boolean validateWhiteBackground() {
			WHITE_BACKGROUND_VALIDATION_ELEMENT.click(); 
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return WHITE_BACKGROUND_BUTTON.isDisplayed();
		 
	 }
	
}
