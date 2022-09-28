package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //amozan sayfanıza gidiniz
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        //sayfadaki tagları "a" olanların sayısını yazdırın
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("a tagının sayısı :" + tag.size());
        driver.close();

    }
}
