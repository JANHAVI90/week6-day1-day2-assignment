package runner1;

import Steps1.BaseClassForServiceNowCucumber;
import io.cucumber.testng.CucumberOptions;

public class cucumberrunner1 {
	@CucumberOptions(features="src/test/java/features1/ServiceNow.feature",
			glue="steps1",dryRun=true,monochrome=true,publish=true,tags="@functionality")
			public class cucumberRunner extends BaseClassForServiceNowCucumber {

			}

}
