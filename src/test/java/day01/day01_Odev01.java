package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_Odev01 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //  Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi: "+driver.getTitle());

        //  Sayfa basliginin “Amazon” icerdigini test edin
        String istenenKelime = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(istenenKelime)){
            System.out.println("Sayfa basligi '"+istenenKelime+"' kelimesini iceriyor. (+)");
        }else System.out.println("Sayfa basligi '"+istenenKelime+"' kelimesini icermiyor.(-)");

        //  Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //  Sayfa url’inin “amazon” icerdigini test edin.
        String arananKelime = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(arananKelime)){
            System.out.println("Sayfa URL'si 'amazon' kelimesini iceriyor. (+)");
        }else System.out.println("Sayfa URL'si 'amazon' kelimesini icermiyor. (-)");

        //  Sayfa handle degerini yazdirin
        System.out.println("Sayfa Handle degeri: "+driver.getWindowHandle());

        //  Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String htmlArananKelime = "Gateway";
        String actualPageSource = driver.getPageSource();

        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sayfa HTML kodlarinda "+arananKelime+" kelimesi geciyor. (+)");
        }else System.out.println("Sayfa HTML kodlarinda "+arananKelime+" kelimesi gecmiyor. (-)");


        //  Sayfayi kapatin.
        driver.close();





    }


}
