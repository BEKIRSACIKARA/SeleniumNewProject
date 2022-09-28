package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("Actual Title = " + driver.getTitle());//amazon başlık yazdır
        System.out.println("Actual Url = " + driver.getCurrentUrl());// girilen sayfanın url sini getirir.
        //System.out.println("driver.getPageSource() = " + driver.getPageSource()); //kaynak kodları getirir.

    }
}