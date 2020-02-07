package batchRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="dcucum.feature",glue="sdef",
tags= {"@datadriven, @Smoke"},plugin="json:target/cucumber-report.json")
public class TestBatchRun {

}
