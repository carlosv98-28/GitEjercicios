package EjerciciosJUnit.ejercicios2.aplicacion3;

import EjerciciosJUnit.ejercicios2.base2.Base1;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class InvalidDataTest extends Base1 {
    @Test
    @Order(1)
        public void RegisterPhone (){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[1]")).getText(),"You must register at least one phone number.");
        }
    @Test
    @Order(2)
        public void LastnameRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[2]")).getText(),"lastname is required.");
        }
    @Test
    @Order(3)
        public void FirstnameRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[3]")).getText(),"firstname is required.");
        }
    @Test
    @Order(4)
        public void PasswdRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[4]")).getText(),"passwd is required.");
        }
    @Test
    @Order(5)
        public void AddressRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[5]")).getText(),"address1 is required.");
        }
    @Test
    @Order(6)
        public void CityRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[6]")).getText(),"city is required.");
        }
    @Test
    @Order(7)
        public void PostalFormat(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[7]")).getText(),"The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
        }
    @Test
    @Order(8)
        public void CountryRequired(){
            assertEquals(driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li[8]")).getText(),"This country requires you to choose a State.");
        }
}

