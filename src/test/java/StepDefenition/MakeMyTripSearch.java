package StepDefenition;

import java.io.IOException;

import org.junit.*;

import com.aventstack.extentreports.Status;

import BrowserDriver.Browsers;
import ElementUtils.Elements;
import Pages.MakeMyTripSearchPage;
import Pages.SearchResultPage;
import Utils.PropertyFileRead;
import io.cucumber.java.en.*;

public class MakeMyTripSearch extends Browsers {
	String exepectedError ="NETWORK PROBLEM";
	
	@Given("Launch the borwser and enter the URL")
	public void launch_the_borwser_and_enter_the_url() throws IOException {
		LaunchTheBrowser();
		String url = PropertyFileRead.GetDataFromPropFile().getProperty("url");
		driver.get(url);
	    
	}
	
	@When("i see a popup please close it")
	public void i_see_a_popup_please_close_it() throws InterruptedException {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickOnPopup();
	}
	

	@When("i Select From location")
	public void i_select_from_location() {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickFromLocation();
		M.SelectValueFromList("MAA");
	}

	@When("i select To Location")
	public void i_select_to_location() {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickToLocation();
		M.SelectValueFromList("PNQ");
	}

	@When("i select Date")
	public void i_select_date() {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.SelectDate("25");
	}

	@When("i click on SearchButton")
	public void i_click_on_search_button() {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickOnSearchButton();
		
	}

	@Then("i validate the search result displays as per the search criteria")
	public void i_validate_the_search_result_displays_as_per_the_search_criteria() {
		SearchResultPage s = new SearchResultPage(driver);
		Assert.assertEquals(exepectedError, s.GetSearchResultText());
		Elements.ClickBackButton(driver);
	}
	
	@Given("Close the browser")
	public void Close_the_browser() throws IOException {
		CloseTheBrowser();
	    
	}

}
