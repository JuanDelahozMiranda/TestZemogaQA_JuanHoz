package com.carnival.www.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/features/main.feature",
        glue = "com.carnival.www.Stepdefinitions",
        tags = "@step1",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CarnivalRunner {
}
