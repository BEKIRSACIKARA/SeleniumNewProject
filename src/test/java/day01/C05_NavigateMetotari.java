package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMetotari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().to("http://88.255.161.100/Login.aspx?ReturnUrl=%2FInterface%2FAnamenu%2FDefault.aspx");
        Thread.sleep(3000);
        driver.navigate().back();// bir önceki sayfaya geri döner
        Thread.sleep(3000);
        driver.navigate().forward();//tekrar geri gelir
        Thread.sleep(3000);
        driver.navigate().refresh();// sayfayı yeniler


        driver.close();

    }


}
