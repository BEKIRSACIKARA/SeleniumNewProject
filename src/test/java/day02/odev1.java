package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev1 {
    public static void main(String[] args) throws InterruptedException {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.*/
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
        System.out.println("sayfaa başlığı = " + driver.getTitle());
//Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//        yazdirin.
        String actualTitle = driver.getTitle();
        String istenenkelime = "facebook";
        if (actualTitle.contains(istenenkelime)) {
            System.out.println("test başarılı " + istenenkelime + " kelimesi içeriyor");
        } else
            System.out.println("test başarısız " + istenenkelime + " kelimesi içermiyor" + "SAYFA URL Sİ :" + driver.getCurrentUrl());
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*https:// www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        */
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/");
        String actualTitle2 = driver.getTitle();
        String aranan = "youtube.com";
        if (actualTitle2.contains(aranan)) {
            System.out.println("true");
        } else System.out.println("false");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();


    }


}
