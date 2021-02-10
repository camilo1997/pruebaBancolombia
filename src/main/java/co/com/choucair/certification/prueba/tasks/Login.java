package co.com.choucair.certification.prueba.tasks;

import co.com.choucair.certification.prueba.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String srtUser;

    public Login(String srtUser, String srtPassword) {
        this.srtUser = srtUser;
        this.srtPassword = srtPassword;
    }

    private String srtPassword;
    public static Login onThePage(String srtUser, String srtPassword) {
        return Tasks.instrumented(Login.class,srtUser,srtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(srtUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(srtPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
