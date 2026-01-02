package cl.iplacex.ta4.bdd;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "cl.iplacex.ta4.bdd.steps",
  plugin = {
    "pretty",
    "json:target/cucumber.json",
    "html:target/cucumber-html-report/index.html"
  }
)
public class CucumberTest {}
