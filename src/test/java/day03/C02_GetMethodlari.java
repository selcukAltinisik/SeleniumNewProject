package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //  -Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

    //  -Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

    //  -Arama kutusunun tagName'inin input olduğunu test ediniz.
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";

        if (actualTagName.equals(expectedTagName)){
            System.out.println("Tagname testi PASSED "+actualTagName);
        }else System.out.println("Tagname testi FAILED");

    //  -Arama kutusunun name attribute'unun değerinin field-keywords olduğunu test ediniz.
        String expectedAttributeName = "field-keywords";
        String actualAttributeName = aramaKutusu.getAttribute("name");

        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute testi PASSED");
        }else System.out.println("Attribute testi FAILED");

    //  Arama kutusunun konumunu yazdırın.
        System.out.println("Arama kutusu konumu: "+aramaKutusu.getLocation());



    //  -Sayfayı kapatınız
        driver.close();



    }


}
