package stepDefiniton;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefiniton"},
monochrome=true,
plugin = {"pretty","html:target/cucumber/index.html",
		"json:target/cucumber/report.json",
		"junit:target/cucumber/report.xml"
		}
		)
public class TestRunner {

}
