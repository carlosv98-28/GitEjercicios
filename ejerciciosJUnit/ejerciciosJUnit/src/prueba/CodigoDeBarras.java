package prueba;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class CodigoDeBarras  {

    static WebDriver driver;

    public static String GeneradorDeCodi(){
        int numero;
        numero = (int) (Math.random() * 999999999) + 1;
        return numero+"89";
    }
    @Test
    @RepeatedTest(5)
       public void generadorCodBarras() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://barcode.tec-it.com/es");
        //Thread.sleep(12*1000);
        driver.findElement(By.id("Data")).clear();
        driver.findElement(By.id("Data")).sendKeys(GeneradorDeCodi());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"infoTarget\"]/div[1]/a[3]/span")).click();
        Thread.sleep(3*1000);
        driver.quit();
    }
}

