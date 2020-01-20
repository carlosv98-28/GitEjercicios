package EjerciciosJUnit.ejercicios2.aplicacion1;

import EjerciciosJUnit.ejercicios2.base2.Base2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountTest extends Base2 {

    @Test
    public void CreateAnAccont(){

        driver.findElement(By.id("email_create")).sendKeys(GeneradorDeMail());
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Carlos");
        driver.findElement(By.id("customer_lastname")).sendKeys("vanegas");
        driver.findElement(By.id("passwd")).sendKeys("12345678");
        WebElement selectDay = driver.findElement(By.id("days"));
        selectDay.findElement(By.xpath("//*[@id=\"days\"]/option[18]")).click();
        WebElement selectMonths = driver.findElement(By.id("months"));
        selectMonths.findElement(By.xpath("//*[@id=\"months\"]/option[9]")).click();
        WebElement selectYears = driver.findElement(By.id("years"));
        selectYears.findElement(By.xpath("//*[@id=\"years\"]/option[35]")).click();
        driver.findElement(By.id("address1")).sendKeys("iceberg");
        driver.findElement(By.id("city")).sendKeys("CABA");
        WebElement selectState = driver.findElement(By.id("id_state"));
        selectState.findElement(By.xpath("//*[@id=\"id_state\"]/option[39]")).click();
        driver.findElement(By.id("postcode")).sendKeys("00000");
        WebElement selectCountry = driver.findElement(By.id("id_country"));
        selectCountry.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("1187784563");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).sendKeys("qwer");
        driver.findElement(By.id("submitAccount")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".info-account")).getText(),"Welcome to your account. Here you can manage all of your personal information and orders.");
    }
}
