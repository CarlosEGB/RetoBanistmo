package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementosObjetosPerdidos {

    public static final Target BTN_SERVICIOS = Target.the("Lista de servicios").locatedBy("//a[contains(.,'SERVICIOS')]");
    public static final Target BTN_INFORMACION_VIAJERO = Target.the("Lista de informacion de viajero").locatedBy("(//a[contains(.,'Información del Viajero')])[1]");
    public static final Target BTN_OBJETOS_EXTRAVIADOS = Target.the("Boton de pagina extraviados").locatedBy("//a[contains(.,'Objetos Extraviados')]");
    public static final Target BTN_PDF_POLITICAS = Target.the("icon de pdf de objetos extraviados").locatedBy("(//img[@alt='pdf'])[1]");
}
