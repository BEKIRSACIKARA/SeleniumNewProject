package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//sayfayı buyutur
               driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());//CDwindow-6672D40DE0C2554DD7B169F74C495640

    }

}