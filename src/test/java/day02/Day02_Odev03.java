package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Odev03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    //  a.) http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        Thread.sleep(3000);

    //  b.) Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        Thread.sleep(3000);

    //  c.) email textbox,password textbox, and signin button elementlerini locate ediniz..
    //    Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //    Username : testtechproed@gmail.com
    //    Password : Test1234!
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");
        Thread.sleep(3000);

        driver.findElement(By.name("commit")).click();
        Thread.sleep(3000);

    //    Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualPageWebElement=driver.findElement(By.tagName("h1"));//referansini verir

        String actualPage=actualPageWebElement.getText();   //getText()metoduyla texti getirir
        String expectedPage="Welcome to Address Book";

        if (actualPage.equals(expectedPage)){
            System.out.println("User id PASS");
        }else System.out.println("User id FAILED");

    //    “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

    //    Sayfada kac tane link oldugunu bulun.



    }


}
