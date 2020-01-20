package EjerciciosJUnit.ejercicios2.aplicacion4;

import EjerciciosJUnit.ejercicios2.aplicacion1.CreateAccountTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerifyUserTest extends CreateAccountTest {
    @After
    public void VerifyUser(){
        assertEquals(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText(),"Carlos vanegas");
    }
}
