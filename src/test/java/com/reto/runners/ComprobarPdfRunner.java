package com.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/comprobar_pdf.feature",
        tags = "@ComprobarPdfs",
        glue = {"com.reto.steps_definitions", "com.reto.utils"},
        snippets = SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class ComprobarPdfRunner {
}
