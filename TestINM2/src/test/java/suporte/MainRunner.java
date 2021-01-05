package suporte;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src\\test\\java\\feature"},
		glue = {""},
		monochrome = true,
		strict = true,
		tags = "@test"
			)		


public class MainRunner {

}
