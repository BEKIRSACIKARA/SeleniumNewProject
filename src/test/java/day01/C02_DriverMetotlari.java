package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C02_DriverMetotlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//sayfayı buyutur
        //amazon sayfası acın
        //kaynak kodları içinde "Dresses kelimesinin olduğugunu test edin
        driver.get("https://www.amazon.com");
        //System.out.println(driver.getPageSource());
        String istenenkelime="Dresses";
        if (driver.getPageSource().contains(istenenkelime)){
            System.out.println("PageSourse Testi PASSED");
        }
            else System.out.println("PageSourse Testi FAILED");
    driver.close();
    driver.quit();//birden fazla sayfa varsa hepsini kapatır

    }

    }