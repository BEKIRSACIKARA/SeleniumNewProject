package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
Yeni bir class olusturun (TekrarTesti)
Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
*/
        driver.navigate().to("https://www.youtube.com/");
        String actualTitle = driver.getTitle();
        String istenenkelime = "youtube";
        if (actualTitle.contains(istenenkelime)) {
            System.out.println("verify");
        } else System.out.println("başlık = " + driver.getTitle());
        if (driver.getCurrentUrl().contains("youtube")) {
            System.out.println("url " + istenenkelime + " kelimesini içermekte");
        } else System.out.println("seyfa url si = " + driver.getCurrentUrl());

/*Daha sonra Amazon sayfasina gidin https://www.amazon.com/
Youtube sayfasina geri donun
Sayfayi yenileyin*/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.manage().window().maximize();

        String actualTitle1 = driver.getTitle();
        String istenenkelime1 = "Amazon";
        if (actualTitle1.contains(istenenkelime1)) {
            System.out.println("verify");
        } else System.out.println("başlık = " + driver.getTitle());
        if (driver.getCurrentUrl().contains("Amazon")) {
            System.out.println("url " + istenenkelime1 + " kelimesini içermekte");
        } else System.out.println("seyfa url si = " + driver.getCurrentUrl());
        driver.close();



/*Amazon sayfasina donun
Sayfayi tamsayfa yapin
Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
Sayfayi kapatin
         */


    }
}
