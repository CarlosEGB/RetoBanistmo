package com.reto.tasks;

import com.reto.interactions.SwitchToTagPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.userinterfaces.ElementosObjetosPerdidos.*;

public class AbrirPdfObjetosPerdidos implements Task {


    public static Performable abrirPdf() {
        return Tasks.instrumented(AbrirPdfObjetosPerdidos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SERVICIOS),
                Click.on(BTN_INFORMACION_VIAJERO),
                Click.on(BTN_OBJETOS_EXTRAVIADOS),
                Click.on(BTN_PDF_POLITICAS),
                SwitchToTagPage.switchTag(1)
        );

    }
}
