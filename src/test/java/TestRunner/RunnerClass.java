package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\kumar\\eclipse-workspace\\BDDcucumeberBesantTambaramJuly2024\\Features\\"
		,glue="StepDefenition",publish=true)
public class RunnerClass {
	
	

}
