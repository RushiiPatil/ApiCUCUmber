package cucumber.Option;

import io.cucumber.datatable.internal.difflib.DiffRow;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.swing.text.html.HTML;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature",glue ={"org.example.StepDefination","Resources" },plugin = "json:target/jsonReports/cucumber-report.json", tags = "@DeletePlaceApi")
public class Testrunnerf {
}
