package EjerciciosJUnit.ejercicios1.aplicacion3;

import EjerciciosJUnit.ejercicios1.base.basee;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class FailPasswordTest extends basee {
    @Test
    public void FailPassword() {
        driver.findElement(By.id("email")).sendKeys("totruetime@gmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123456789");
        driver.findElement(By.id("SubmitLogin")).click();
        assertEquals(driver.findElement(By.cssSelector("#center_column > div:nth-child(2) > ol:nth-child(2) > li:nth-child(1)")).getText(),"Authentication failed.");
    }
}
