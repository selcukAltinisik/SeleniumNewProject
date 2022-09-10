package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {

        /* En temel haliyle bir otomasyon yapmak iin calss'ımıza otomasyoniçin gerekli olan
        webdriver'ın yerini göstermemiz gerekir.
           Bununiçin java kütüphanesinden System.setProperty() method'unu kullanırız.
           Ve method'uniçine ilk olarak driver'ı yazarız. İkinci olarak onun fiziki yolunu kopyalarız.
         */

    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.amazon.com");
        System.out.println("Actual Title : "+driver.getTitle()); //  gidilen sitenin başlığını yazdırır.
        System.out.println("Actual url : "+driver.getCurrentUrl()); //  Gidilen sayfanın url'ini getirir.
        System.out.println("Kaynak kodları: "+driver.getPageSource());

    }
}
