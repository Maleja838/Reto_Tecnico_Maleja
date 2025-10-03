package co.sqasa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( 
    features = "classpath:features/datepicker_scenario_1.feature",
    glue = "co.sqasa.StepDef",
    snippets = SnippetType.CAMELCASE
)
public class Scenario1Runner {
}
