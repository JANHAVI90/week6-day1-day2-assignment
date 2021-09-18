package runner;

import Steps1.BaseClassForServiceNowCucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="steps",dryRun=true,monochrome=true,publish=true,tags="@sanity")
public class cucumberRunner extends BaseClass {

}
