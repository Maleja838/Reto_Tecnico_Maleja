package co.sqasa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "classpath:features",
        glue = "co.sqasa.StepDef",
        snippets = SnippetType.CAMELCASE,
        tags = "@datepicker"
)
public class testRunner {
}
