package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findelements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //  Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");

        //  Amazon ssayfasındaki a tag'ların sayısınıyazdırın.
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("a taglarinin sayisi = "+tag.size());


        //  Amazon ssayfasındaki input tag'ların sayısınıyazdırın.
        List<WebElement> tag2 = driver.findElements(By.tagName("input"));
        System.out.println("input taglarinin sayisi = "+tag.size());

    }


}
