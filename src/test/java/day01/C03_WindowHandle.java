package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());   //  CDwindow-8AE466BCAC9BD497CC4A5D4054A48BE2
        //  farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız.

    }

}
