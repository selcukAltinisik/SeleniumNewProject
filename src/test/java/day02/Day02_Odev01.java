package Odev;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_Odev1 {
    public static void main(String[] args) throws InterruptedException {

     //  1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

     //  2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
     //  oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        String titleKelime = "facebook";
        if (driver.getTitle().contains(titleKelime)) {
            System.out.println("Facebook Title testi PASSED");
        }else {
            System.out.println("Facebook Title testi FAILED : " + driver.getTitle());
        }

     //  3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String urlKelime = "facebook";
        if (driver.getCurrentUrl().contains(urlKelime)) {
            System.out.println("Facebook Current URL testi PASSED");
        } else {
            System.out.println("Facebook Current URL tesi FAILED : " + driver.getCurrentUrl());
        }

     //  4. https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://walmart.com");

     //  5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String titleKelime2= "Walmart.com";
        if (driver.getTitle().contains(titleKelime2)) {
            System.out.println("Walmart Title testi PASSED");
        } else {
            System.out.println("Walmart Title testi FAILED : " + driver.getTitle());
        }


     //  6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();

     //  7. Sayfayi yenileyin
        driver.navigate().refresh();

     //  8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

     //  9.Browser'i kapatin
        driver.close();









        /*
        Facebook Title testi FAILED : Facebook - Giriş Yap veya Kaydol
        Facebook Current URL testi PASSED
        Walmart Title testi PASSED
         */
    }
}