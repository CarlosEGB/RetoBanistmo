package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementosInformacionFinanciera {
    public static final Target BTN_INFO_FINANCIERA = Target.the("Boton de informacion financiera").locatedBy("//a[contains(.,'INFORMACIÓN FINANCIERA')]");
    public static final Target BTN_PRESUPUESTARIA = Target.the("Boton de ejecucion presupuestaria 2020").locatedBy("//p[contains(.,'Informes Ejecución Presupuestaria 2020')]");
    public static final Target BTN_PDF = Target.the("pdf de ejecucion presupuestaria 2020").locatedBy("//a[contains(.,'Ejecución Presupuestaria julio 2020')]");

}
