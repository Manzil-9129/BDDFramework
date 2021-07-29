package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\SHIV\\eclipse-workspace\\PracticeBDDFramework\\src\\main\\java\\Features\\Login.feature"
		,glue= {"Stepdefinitons"},
		monochrome=true,
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.jnuit"},
		dryRun=false,
		strict=true
		//tags= {"~@SmokeTest"}  //~ g=for skiping test
	//OR : tags={"@SmokeTest,@RegressionTest" }
	//AND : tags={"@SmokeTest","@RegressionTest"}
		)

public class testrunner {

}
