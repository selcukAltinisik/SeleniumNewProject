package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {

    public static void main(String[] args) {
    System.setProperty("webdirver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        İleride wait konusunu daha geniş olarak ele alacağız..
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir
        yükleme süresine ihtiyaç vardır veya bir webelementin kullanılabilmesi için zamana ihtiyaç olabilir.
        implicitlyWait() bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanagi tanir.
         */


    }


}
