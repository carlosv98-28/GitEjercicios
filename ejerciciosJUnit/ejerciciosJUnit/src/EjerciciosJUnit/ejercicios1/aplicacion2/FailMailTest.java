package EjerciciosJUnit.ejercicios1.aplicacion2;

import EjerciciosJUnit.ejercicios1.base.basee;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class FailMailTest extends basee {
    @Test
    public void FailMail() {
        driver.findElement(By.id("email")).sendKeys("totruetimegmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("2814love");
        driver.findElement(By.id("SubmitLogin")).click();
        assertEquals(driver.findElement(By.cssSelector("#center_column > div:nth-child(2) > ol:nth-child(2)")).getText(),"Invalid email address.");
    }
}
