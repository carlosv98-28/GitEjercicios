package EjerciciosJUnit.ejercicios1.aplicacion1;

import EjerciciosJUnit.ejercicios1.base.basee;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoginOkTest extends basee {
    @Test
    public void pruebaLogin() {
        driver.findElement(By.id("email")).sendKeys("totruetime@gmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("2814love");
        driver.findElement(By.id("SubmitLogin")).click();
        assertEquals(driver.findElement(By.cssSelector(".info-account")).getText(),"Welcome to your account. Here you can manage all of your personal information and orders.");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]")).click();
    }
}
