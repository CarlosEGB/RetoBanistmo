package com.reto.steps_definitions;

import com.reto.tasks.AbrirPdfEjecucionPresupuestaria;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ComprobarPdfEjecucionPresupuestaria {

    @When("^El abre el pdf de Ejecución Presupuestaria julio 2020$")
    public void elAbreElPdfDeEjecuciónPresupuestariaJulio2020() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirPdfEjecucionPresupuestaria.abrirPdf()
        );
    }
}
