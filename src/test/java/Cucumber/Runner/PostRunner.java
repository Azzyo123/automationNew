package Cucumber.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Cucumber/features/posts.feature"},
        glue = {"Cucumber/Steps"},
        plugin = {"pretty","junit:target/report.xml"},
        dryRun = false
)





public class PostRunner {
}
