package Odev;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_Odev01 {
    public static void main(String[] args) throws InterruptedException {

     //  1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

     //  2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
     //  oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        Thread.sleep(2000);

        String actualTitleWords = driver.getTitle();
        String expectedTitleWord = "facebook";

        if (actualTitleWords.contains(expectedTitleWord)) {
            System.out.println("Facebook Title testi PASSED");
        }else {
            System.out.println("Facebook Title testi FAILED");
        }

     //  3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualUrlWords = driver.getCurrentUrl();
        String expectedUrlWord = "facebook";

        if (actualUrlWords.contains(expectedUrlWord)) {
            System.out.println("Facebook Current URL testi PASSED");
        } else {
            System.out.println("Facebook Current URL tesi FAILED");
        }

     //  4. https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://walmart.com");
        Thread.sleep(2000);

        //  5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitleWords2 = driver.getTitle();
        String expectedTitleWord2 = "Walmart.com";

        if (actualTitleWords2.contains(expectedTitleWord2)) {
            System.out.println("Walmart Title testi PASSED");
        } else {
            System.out.println("Walmart Title testi FAILED");
        }

     //  6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);

        //  7. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //  8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);

     //  9.Browser'i kapatin
        driver.close();









        /*
        Facebook Title testi FAILED : Facebook - Giriş Yap veya Kaydol
        Facebook Current URL testi PASSED
        Walmart Title testi PASSED
         */
    }
}