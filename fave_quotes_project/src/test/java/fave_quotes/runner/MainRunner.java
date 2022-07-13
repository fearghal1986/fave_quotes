package fave_quotes.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/fave_quotes/feature_files/"},
//      features = {"."}, // Leaving the "." as the path to be able to populate the rerun.txt file with the whole path for the feature files that fail as per https://stackoverflow.com/a/40326021/12439311
        glue = {"fave_quotes.steps"},
        tags = {""},
        monochrome = true,
        plugin = {"pretty","json:logs/cucumber.json"}
)

public class MainRunner {

    @AfterClass
    public static void generateReport(){
        String RootDir = System.getProperty("user.dir");

        File reportDirectory = new File(RootDir + "\\logs\\cucumber-report");
        String jsonFilePath = RootDir + "\\logs\\cucumber.json";

        List<String> jsonFile = Arrays.asList(jsonFilePath);
        net.masterthought.cucumber.Configuration config = new Configuration(reportDirectory, "fave_quotes_project");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFile, config);
        reportBuilder.generateReports();
    }

}
