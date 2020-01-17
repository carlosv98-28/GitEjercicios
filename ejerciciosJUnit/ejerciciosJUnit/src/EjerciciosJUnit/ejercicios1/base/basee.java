package EjerciciosJUnit.ejercicios1.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class basee {
    protected WebDriver driver;

    @Before
    public void iniciarbefore() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.findElement(By.linkText("Sign in")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).click();

    }
    @After
    public void iniciarAfter(){
        driver.quit();
    }
}
