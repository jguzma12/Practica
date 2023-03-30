package co.com.practica.tasks;

import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.swing.event.CaretListener;

import static co.com.practica.userinterfaces.MainPage.*;

public class JoinToday implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(BTN_JOIN_TODAY),
            Enter.theValue("Juan Pablo").into(INPUT_FNAME),
            Enter.theValue("Guzman Quintero").into(INPUT_LNAME),
            Enter.theValue("juan97guzman@gmail.com").into(INPUT_EMAIL),
            Click.on(BTN_MONTH),
            Click.on(INPUT_MONTH)
    );
    }

public static JoinToday with(){
return Tasks.instrumented(JoinToday.class);

}
}