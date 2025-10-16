
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    @Test
    void test(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.36.0-win32\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary("C:\\Firefox\\Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
        WebElement elementsTab = driver.findElement((By.xpath("//h5[text()= 'Elements']")));
        elementsTab.click();

        WebElement textBoxTab = driver.findElement(By.xpath("//span[text()= 'Text Box']"));
        textBoxTab.click();

        WebElement userNameInput = driver.findElement(By.cssSelector("input[id='userName']"));
        userNameInput.sendKeys("Альбина Абжетова");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitButton.click();

        WebElement output = driver.findElement(By.id("name"));
        Assertions.assertEquals("Name:Альбина Абжетова",output.getText(),"Название не соответствует значению");






    }



}
