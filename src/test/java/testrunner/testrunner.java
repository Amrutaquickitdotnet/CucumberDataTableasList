package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\CucumberProject\\CucumberProject_3_Data_Driven_With_ExampleKeyword2\\src\\test\\java\\Features\\login.feature",
		
		glue= {"stepDefination"}
		
		)


public class testrunner 
{


}
