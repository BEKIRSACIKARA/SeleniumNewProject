package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C05_panoroma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://88.255.161.100");
        WebElement kullaniciadi = driver.findElement(By.name("edtUserName"));
        kullaniciadi.sendKeys("dileksugida3");
        WebElement kullanicisifre = driver.findElement(By.id("edtPass"));
        kullanicisifre.sendKeys("Nbe102030" + Keys.ENTER);
        driver.findElement(By.id("ctl09_lblCloseText")).click();
        driver.findElement(By.xpath("(//*[@class='col-xs-2 col-sm-2 col-lg-2 col-xl-2 tab-item'])[2]")).click();
        driver.findElement(By.xpath("(//*[@class='col-xs-10 menu-text-container'])[172]")).click();
        //driver.findElement(By.xpath("(//td[@tabindex='0']")).click();
        //driver.findElement(By.id("reportGrid_Edt_R4_C1_343_TE")).click();
        //driver.findElement(By.xpath("(//*[@data-code='1246'])[1]")).click();
        driver.get("http://88.255.161.100/Interface/MobilSatisDagitim/TopluBelgeBasim/TopluFaturaBasimDML.aspx?DMLType=New&Title=FaturaTopluBasim&RK=&MeNo=53477&CK=TopluFaturaBasim\n");
        WebElement EArsivsablon = driver.findElement(By.id("edtEArsivSablon_NE_t"));
        Thread.sleep(3000);
        EArsivsablon.sendKeys("13" + Keys.ENTER);
        driver.findElement(By.id("MainNvgxToolbar_Item_0")).click();
        driver.findElement(By.id("Grd_Faturalar_Grd_FaturalarToggleCb")).click();
        driver.findElement(By.id("WebNavxToolbar_Item_10")).click();
        //driver.findElement(By.xpath("//*[text()='Yazdır']")).click();
        //yazdir.sendKeys(Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB);
        driver.findElement(By.xpath(//*[@id='dialog-body'])).click();
        driver.findElement(By.name("edtEbelgeBasimTipi$DL")).sendKeys("y");

        WebElement Efaturasablon = driver.findElement(By.id("edtEFaturaSablon_NE_t"));
        Efaturasablon.sendKeys("11" + Keys.ENTER);
        driver.findElement(By.id("MainNvgxToolbar_Item_0")).click();
        driver.findElement(By.id("Grd_Faturalar_Grd_FaturalarToggleCb")).click();

        // driver.findElement(By.id("ListGrid_R0RowCb")).click();
        //System.out.println("yükleme no " + driver.findElement(By.id("NvgxToolbar_Item_0")).getText());
        //System.out.println(driver.findElement(By.xpath("(//*[@id='NvgxToolbar_Item_0'])[1]")).getText());
    }
}
