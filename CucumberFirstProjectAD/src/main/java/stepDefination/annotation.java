package stepDefination; 

import org.openqa.selenium.By;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class annotation extends TestBase{ 
	
	//  WebDriver driver;
	//LoginPage lp=new LoginPage(driver);
	  @Given("^I have open the browser$")
	  public void i_have_open_the_browser() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
		  TestBase.initialization();
	  }
	  @When("^I open Facebook website$")
	  public void i_open_Facebook_website() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println(driver.getTitle());
		  String s= lp.validateTitle();
		  System.out.println(s);
	  }

	  @Then("^Login button should exits$")
	  public void login_button_should_exits() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	      
	  }
	  
	  @When("^Enters Text \"(.*?)\"$")
	  public void enters_Text(String arg1) throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	      lp.EnterText(arg1);
	  }
	  
	  @After
	  public void AfterScenario()
	  {
		  driver.close();
		  System.out.println("scenario ends ");
	  }

}