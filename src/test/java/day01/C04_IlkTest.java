package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        ///1.amozana git
        // 2 başlığın amazon içerdiğini test et
        //3. url nin amazon içerdiğini test et sayfayı kapat
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String istenenkelime="Amozon";
        if (actualTitle.contains(istenenkelime)){
            System.out.println("Title testi passet");
        }else System.out.println("Title testi failed");
        System.out.println("url nin amazon = " + driver.getCurrentUrl());
        driver.close();

    }





}
