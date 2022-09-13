package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {

    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    //    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

    //    b. Sign in butonuna basin
        Thread.sleep(2000);
        WebElement signInButton= driver.findElement(By.id("sign-in"));
        Thread.sleep(2000);
        signInButton.click();

    //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signIn = driver.findElement(By.name("commit"));

    //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //    i. Username : testtechproed@gmail.com
    //    ii. Password : Test1234!
        Thread.sleep(2000);
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        password.sendKeys("Test1234!");
        Thread.sleep(2000);
        signIn.click();

    //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUser = driver.findElement(By.className("navbar-text"));
        Thread.sleep(2000);
        if (actualUser.isDisplayed()){
            System.out.println("ExpectedUser testi PASSED - "+actualUser.getText());
            //  Bir WebElementin üzerindeki yazıyı konsolda yazdırabilmek için getText() methodu kullanılır.
        }else System.out.println("ExpectedUser testi FAILED");

    //  -----
        String actualUserYazisi = actualUser.getText();
        String istenenUserYazisi = "testtechproed@gmail.com";
    if (actualUserYazisi.equals(istenenUserYazisi)){
        System.out.println("TEST PASSED");
    }else System.out.println("TEST FAILED");


    //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
       WebElement addresses = driver.findElement(By.linkText("Addresses"));
       WebElement signOut = driver.findElement(By.linkText("Sign out"));
       if (addresses.isDisplayed()){
           System.out.println("Addresses testi PASSED");
       }else System.out.println("Addresses testi FAILED");

       if (signOut.isDisplayed()){
            System.out.println("signOut testi PASSED");
        }else System.out.println("signOut testi FAILED");


    //    3. Sayfada kac tane link oldugunu bulun.
       List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));

        System.out.println("Linklerin sayisi: "+linklerListesi.size());

    //  4.  Linkleri yazdırınız.
        for (WebElement each:linklerListesi) {
            System.out.println("Linkler: "+each.getText());
        }

    //  5.  Linkleri LAMBDA ile yazdırınız.
        linklerListesi.forEach(t-> System.out.println(t.getText()));

    //  6.  Sayfayı kapatınız.
        driver.close();



    }


}
