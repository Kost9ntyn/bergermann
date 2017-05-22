package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Log4Test;


public class ADATA_128_GB_2_5 extends TestBase {

//    protected By productDescription = By.className("text-left");
    protected By productDescription = By.xpath(".//*[@id='pageWrapper']/div[3]/section[2]/div/div/section/div/div/div[1]/div[2]/h2");

    protected WebElement productContent;

    public WebElement verifyProductContent(){

        Log4Test.info("Verify product content");

        return  productContent = webDriver.findElement(productDescription);


    }
}
