package StepDefenition;

import BrowserDriver.Browsers;
import Pages.MakeMyTripSearchPage;
import io.cucumber.java.en.When;

public class MakemytripSearchdynamicdata extends Browsers{
	
	@When("i Select From location as following ([^\"]*)$")
	public void i_select_from_location(String from) {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickFromLocation();
		M.SelectValueFromList(from);
	}

	@When("i select To Location as following ([^\"]*)$")
	public void i_select_to_location(String to) {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.ClickToLocation();
		M.SelectValueFromList(to);
	}

	@When("i select Date as following ([^\"]*)$")
	public void i_select_date(String date) {
		MakeMyTripSearchPage M = new MakeMyTripSearchPage(driver);
		M.SelectDate(date);
	}

}
