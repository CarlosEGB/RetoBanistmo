package com.reto.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

public class ValidarPdf implements Question<Boolean> {

    private String namePdf;

    public ValidarPdf(String namePdf) {
        this.namePdf = namePdf;
    }

    public static ValidarPdf isPdf(String namePdf) {
        return new ValidarPdf(namePdf);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        return driver.getCurrentUrl().contains(namePdf);
    }
}
