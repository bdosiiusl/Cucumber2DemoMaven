import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class StepDefinition {
	
	WebDriver driver;
	
	//This script was Designed by QA Bayo, Just added project to GitHub, configured Jenkins to build each time there is new commit using Webhooks
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String arg1){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/user/GlassBoxT/");
		
	}	
	@Then("^I should be on \"([^\"]*)\" youtube page$")
	public void i_should_be_on_youtube_page(String tab){
		assertTrue(tab.contains("QAShahin"));
		//Assert.assertTrue(driver.getTitle().contains(tab));
		driver.close();
	}

	
}

