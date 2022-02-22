package com.openlyCrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features", //in default locator doesnt know where my file
        glue = "com/openlyCrm/step_definitions",  //cukesrunner doesnt know where my step definitions locaoted
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
