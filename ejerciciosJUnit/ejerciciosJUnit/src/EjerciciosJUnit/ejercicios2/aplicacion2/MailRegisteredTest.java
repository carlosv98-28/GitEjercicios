package EjerciciosJUnit.ejercicios2.aplicacion2;

import EjerciciosJUnit.ejercicios2.base2.Base2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MailRegisteredTest extends Base2 {

     @Test
    public void MailRegistered(){
         driver.findElement(By.id("email_create")).sendKeys("web21@yopmail.com");
         driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         assertEquals(driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText(),
         "An account using this email address has already been registered. Please enter a valid password or request a new one.");
     }
}
