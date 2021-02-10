package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Botón que nos muestra para iniciar sesión")
            .located(By.xpath("//nav[@id='nav-menu']/ul[2]/li/a/strong"));
    public static final Target INPUT_USER = Target.the("Donde escribimos al usuario")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Donde escribimos la contraseña")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON =Target.the("Botón para ingresar")
            .located(By.xpath("//button[@type='submit']"));

}
