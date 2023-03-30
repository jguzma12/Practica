package co.com.practica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
public static final Target BTN_JOIN_TODAY =Target.the("Button to start the process").
        located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));
public static final Target INPUT_FNAME = Target.the("Input of first name").located(By.id("firstName"));
public static final Target INPUT_LNAME = Target.the("Input of last name").located(By.id("lastName"));
public static final Target INPUT_EMAIL = Target.the("Input of email").located(By.id("email"));
public static final Target BTN_MONTH = Target.the("Input of Month").located(By.id("birthMonth"));
public static final Target INPUT_MONTH = Target.the("Input day").
        located(By.xpath("(//*[@value='number:10'])[1]"));

public static final Target INPUT_DAY = Target.the("Input day").
        located(By.xpath("(//*[@value='number:10'])[1]"));
public static final Target INPUT_YEAR = Target.the("Input year").located(By.id("birthYear"));
public static final Target BTN_NEXT_STAGE = Target.the("Button next stage").
        located(By.xpath("//*[@class='btn btn-blue']"));
}