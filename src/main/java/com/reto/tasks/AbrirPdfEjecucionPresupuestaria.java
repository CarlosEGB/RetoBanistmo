package com.reto.tasks;

import com.reto.interactions.SwitchToTagPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import static com.reto.userinterfaces.ElementosInformacionFinanciera.*;


public class AbrirPdfEjecucionPresupuestaria implements Task {


    public static Performable abrirPdf() {
        return Tasks.instrumented(AbrirPdfEjecucionPresupuestaria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_INFO_FINANCIERA)
        );

        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        driver.switchTo().frame(0);

        actor.attemptsTo(
                Click.on(BTN_PRESUPUESTARIA)
        );

        actor.attemptsTo(
                Click.on(BTN_PDF),
                SwitchToTagPage.switchTag(1)
        );
    }
}
