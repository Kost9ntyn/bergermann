package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Log4Test;

import java.util.concurrent.TimeUnit;

public class Login extends TestBase {

    public boolean isOpened(String url)
    {
        Log4Test.info("Verify Login page");
        Log4Test.info(webDriver.getCurrentUrl());
        return webDriver.getCurrentUrl().equals(url);
    }

    public void clickOnLogin() {
        Log4Test.info("click on Login");
        WebElement hoverOver = webDriver.findElement(By.xpath("//div[contains(@class, 'dropdown-icon')]/a[contains(@href,'https://www.x-kom.pl/logowanie')]"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(hoverOver).build().perform();

        Log4Test.info("click on Zaloguj się");
        WebElement loginButton = webDriver.findElement(By.xpath("//a[contains(@href,'https://www.x-kom.pl/logowanie') and contains(@class, 'button')]"));
        loginButton.click();

    }

    public void credentialsEnter() throws InterruptedException {

        Log4Test.info("input credentials");

        WebElement searchField = webDriver.findElement(By.xpath("//*[@name='login']"));

        webDriver.findElement(By.xpath("//*[@name='login']")).clear();

        // Sends "XXXXXXXXXX" text into an input field
        webDriver.findElement(By.xpath("//*[@name='login']")).sendKeys("test.heyarnold@gmail.com");

        searchField = webDriver.findElement(By.xpath("//*[@name='password']"));

        // Sends "XXXXXXXXXX" text into an input field
        searchField.sendKeys("test.heyarnold");

        webDriver.findElement(By.xpath("//*[@type='submit']")).click(); //click "Login" key

    }

}
