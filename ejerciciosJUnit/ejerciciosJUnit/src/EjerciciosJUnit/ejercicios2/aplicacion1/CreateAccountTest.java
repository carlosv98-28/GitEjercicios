package EjerciciosJUnit.ejercicios2.aplicacion1;

import EjerciciosJUnit.ejercicios2.base2.Base2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountTest extends Base2 {
    Base2 codig = new Base2();
    Base2 nb = new Base2();
    public String nombre;
    public String apellido;

    @Test
    public void CreateAnAccont(){
        driver.findElement(By.id("email_create")).sendKeys(GeneradorDeMail());
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys(nb.generarNombresAleatorios(1));
        nombre = driver.findElement(By.id("customer_firstname")).getAttribute("value");
        driver.findElement(By.id("customer_lastname")).sendKeys(nb.generarApellidoAleatorios(1));
        apellido = driver.findElement(By.id("customer_lastname")).getAttribute("value");
        driver.findElement(By.id("passwd")).sendKeys(codig.GeneradorDePassword());
        SelectorDay();
        SelectorMonths();
        SelectorYear();
        driver.findElement(By.id("address1")).sendKeys("iceberg");
        driver.findElement(By.id("city")).sendKeys("CABA");
        SelectorState();
        driver.findElement(By.id("postcode")).sendKeys("00000");
        SelectorCountry();
        driver.findElement(By.id("phone_mobile")).sendKeys("1178451285");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).sendKeys("qwer");
        driver.findElement(By.id("submitAccount")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".info-account")).getText(),"Welcome to your account. Here you can manage all of your personal information and orders.");
    }

    public void SelectorDay(){
        WebElement selectDay = driver.findElement(By.id("days"));
        selectDay.findElement(By.xpath("//*[@id=\"days\"]/option[18]")).click();
    }
    public void SelectorMonths(){
        WebElement selectMonths = driver.findElement(By.id("months"));
        selectMonths.findElement(By.xpath("//*[@id=\"months\"]/option[9]")).click();
    }
    public void SelectorYear(){
        WebElement selectYears = driver.findElement(By.id("years"));
        selectYears.findElement(By.xpath("//*[@id=\"years\"]/option[35]")).click();
    }
    public void SelectorState(){
        WebElement selectState = driver.findElement(By.id("id_state"));
        selectState.findElement(By.xpath("//*[@id=\"id_state\"]/option[39]")).click();
    }
    public void SelectorCountry(){
        WebElement selectCountry = driver.findElement(By.id("id_country"));
        selectCountry.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
    }

}
