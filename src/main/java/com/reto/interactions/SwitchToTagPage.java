package com.reto.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class SwitchToTagPage implements Interaction {

    private int tag;

    public SwitchToTagPage(int tag) {
        this.tag = tag;
    }

    public static Performable switchTag(int tag) {
        return Tasks.instrumented(SwitchToTagPage.class, tag);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(tag));
    }
}
