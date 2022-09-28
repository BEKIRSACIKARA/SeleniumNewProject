package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        String expectedTagName= "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName TESTI PASSED : "+actualTagName);
        }else {
            System.out.println("TagName TESTI FAILED" +actualTagName);
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(expectedAtributuName)){
            System.out.println("Atribute TESTI PASSED");
        } else System.out.println("Atribute TESTI FAILED");
        //arama kutusu konumu
        System.out.println("Arama kutusu konumu "+aramaKutusu.getLocation());
        //-Sayfayı kapatınız
        driver.close();
    }





}
