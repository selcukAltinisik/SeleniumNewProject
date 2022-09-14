package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Odev02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    //    Youtube web sayfasına gidin.
        driver.get("https://youtube.com");
        Thread.sleep(3000);

    //    Sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test is PASSED");
        }else System.out.println("Title test is FAILED. The correct title: "+actualTitle);
    //    Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "youtube";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("URL Control test is PASSED");
        }else System.out.println("URL Control test is FAILED. The correct URL: "+actualUrl);

    //    Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

    //    Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

    //    Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

    //    Amazon sayfasina donun
         driver.navigate().forward();
         Thread.sleep(3000);

    //    Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

    //    Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Amazon";

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Title test is PASSED");
        }else System.out.println("Title test is FAILED. Actual Title: "+actualTitle2);

    //    Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualUrl2 = driver.getCurrentUrl();
        String expectedUrl2 = "https://www.amazon.com/";

        if (actualUrl2.contains(expectedUrl2)){
            System.out.println("URL Control test is PASSED");
        }else System.out.println("URL Control test is FAILED. The correct URL: "+actualUrl);


    //    Sayfayi kapatin
        driver.close();

    }


}
