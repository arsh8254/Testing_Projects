package TestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src\\test\\resources\\test\\test1.feature"},
glue = {"Steps"}    // we write the package name here   //Steps is package but Def is class
)
public class Run extends AbstractTestNGCucumberTests{

}
