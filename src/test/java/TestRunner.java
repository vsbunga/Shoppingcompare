import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json"},
        features = "C:\\Shoppingcompare\\src\\test\\resources\\feature", glue="stepDefinations")
public class TestRunner {
}
