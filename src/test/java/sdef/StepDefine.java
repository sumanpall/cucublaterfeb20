package sdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine {
	
 WebDriver driver;
 
 
 
 @Given("user is at the registration page")
 public void user_is_at_the_registration_page() {
     // Write code here that turns the phrase above into concrete actions
    // throw new cucumber.api.PendingException();
	 driver.findElement(By .linkText("Gmail")).click();
 }

 @When("user enters the credentials")
 public void user_enters_the_credentials(io.cucumber.datatable.DataTable dataTable) {
     // Write code here that turns the phrase above into concrete actions
     // For automatic transformation, change DataTable to one of
     // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
     // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
     // Double, Byte, Short, Long, BigInteger or BigDecimal.
     //
     // For other transformations you can register a DataTableType.
    // throw new cucumber.api.PendingException();
	List<String> lst_coll= dataTable.asList();
	    System.out.println(lst_coll.size());
	    
	    for(String temp: lst_coll) {
	    	System.out.println(temp);
	    	driver.findElement(By .linkText("")).sendKeys(temp);
	    }
	    
 }

 @Then("user registration success")
 public void user_registration_success() {
     // Write code here that turns the phrase above into concrete actions
     throw new cucumber.api.PendingException();
 }
 
 @When("new executive uses their ids")
 public void new_executive_uses_their_ids() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
 }

 @Then("Registration is success")
 public void registration_is_success() {
     // Write code here that turns the phrase above into concrete actions
     //throw new cucumber.api.PendingException();
 }

@When("Executive enter their userid as {string}")
public void executive_enter_their_userid_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user id is"+string);
	
	
	
}

@Then("system should accept her id")
public void system_should_accept_her_id() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("user id is accepted");
}

	
	@Given("App is opened")
	public void app_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	   System.out.println("app is opened");
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}
	
	@Given("Alice purchased microwave for {int} dollers")
	public void alice_purchased_microwave_for_dollers(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
	}

	@Given("Alice has a receipt")
	public void alice_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Alice returns the microwave")
	public void alice_returns_the_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Alice should get refund of {int} dollers")
	public void alice_should_get_refund_of_dollers(Integer int1) {    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	
	
	
}
