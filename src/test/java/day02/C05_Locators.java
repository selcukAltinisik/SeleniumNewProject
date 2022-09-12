package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://amazon.com");

        //  Amazonda nutella aratınız.

        //  WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //  aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);    //  id unique olduğu için bu sorunsuz çalışır.

         WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
         aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);    //  id unique olduğu için bu sorunsuz çalışır.

        //  WebElement aramaKutusu = driver.findElement(By.className("nav-search-field ")); //  Çalışmadı.
        //  aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        /* Bu locator çalışmadı.
           Locator alırken gözümüzden kaçan detaylar olabilir..
           Aldığımız bir locator çalışmazsa alternatif locatorlar denemeliyiz.
         */

        driver.findElement(By.linkText("Sell products on Amazon")).click();


        //  a tag'ındaki liknk isminden istediğimiz bir parçayla locate edebiliriz.
            driver.findElement(By.partialLinkText("oducts on Amazon")).click();




    }


}
