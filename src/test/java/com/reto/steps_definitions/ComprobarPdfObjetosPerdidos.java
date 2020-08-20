package com.reto.steps_definitions;

import com.reto.questions.ValidarPdf;
import com.reto.tasks.AbrirPdfObjetosPerdidos;
import com.reto.userinterfaces.TocumenPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprobarPdfObjetosPerdidos {

    private TocumenPage tocumenPage;

    @Given("^Que usuario esta en la pagina$")
    public void queUsuarioEstaEnLaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.browserOn(tocumenPage)
        );
    }

    @When("^El abre el pdf de politicas de objetos extraviados$")
    public void elAbreElPdfDePoliticasDeObjetosExtraviados() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirPdfObjetosPerdidos.abrirPdf()
        );
    }

    @Then("^Valida que el pdf (.*) sea el correcto$")
    public void validaQueElPdfSeaElCorrecto(String namePdf) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarPdf.isPdf(namePdf))
        );
    }
}
