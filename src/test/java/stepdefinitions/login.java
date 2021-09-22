package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver=null;
	@Given("^User navigates to login page of the application$")
	public void navigatestologinpage() {
	    System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.get("https://www.amazon.com/");
	}

	@When("^User enters Username (.*) and Password (.*) into the fields$")
	public void enterusernameandpassword(String Username,String Password) 
	{
	  //driver.findElement(By.id("input-email")).sendKeys(Username);
	  //driver.findElement(By.id("input-password")).sendKeys(Password);
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  driver.findElement(By.id("ap_email")).sendKeys(Username);
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys(Password);
	  
	  
	}
	@And("^Clicks on Login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.id("signInSubmit")).click();
		//driver.findElement(By.cssSelector("input [type='submit'],[value='Login']")).click();
	}
	@Then("^User should successfully login$")
	public void usershouldsuccessfullylogin() 
	{
		WebElement element=null;
		try {
			
		      //element=driver.findElement(By.linkText("Register for an affiliate account"));  
			element=driver.findElement(By.linkText("Your Amazon.com"));
	     }catch(Exception exc)
		{
	    	 System.out.println("user has not logged in ");
		}
		Assert.assertNotNull("user has not logged in", element);
	}

}
