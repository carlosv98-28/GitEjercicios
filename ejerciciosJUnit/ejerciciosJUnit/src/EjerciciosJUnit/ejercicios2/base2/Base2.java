package EjerciciosJUnit.ejercicios2.base2;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base2 {
    protected static WebDriver driver;
    public static String GeneradorDeMail(){
        int numero;
        numero = (int) (Math.random() * 9999) + 1;
        return "webb"+numero+"@yopmail.com";
    }

    @Before
    public  void iniciarbefore() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Sign in")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email_create")).click();
    }
    @After
    public void iniciarAfter(){
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]")).click();
        driver.quit();
    }
}
