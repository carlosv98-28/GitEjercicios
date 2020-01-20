package EjerciciosJUnit.ejercicios2.base2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import EjerciciosJUnit.ejercicios2.base2.Base2;

public class Base1 {
    protected static WebDriver driver;

    @BeforeClass
        public static void a_Iniciar(){
            Base2 n= new Base2();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.linkText("Sign in")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.id("email_create")).click();
            driver.findElement(By.id("email_create")).sendKeys(n.GeneradorDeMail());
            driver.findElement(By.id("SubmitCreate")).click();
            driver.findElement(By.id("submitAccount")).click();
        }
    @AfterClass
        public static void iniciarAfter(){
            driver.quit();
        }
}

