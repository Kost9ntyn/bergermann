package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Log4Test;

public class ResultPage extends TestBase {


    protected By searchProductLink =

            By.xpath("//*[@id='productList']/div/div[1]/a[@href='/p/327330-dysk-ssd-adata-128gb-25-sata-ssd-ultimate-su800-3d-nand.html']");

    protected WebElement searchLinkElem;

    public String verifyProductLink(){

        Log4Test.info("Verify product link");

        searchLinkElem = webDriver.findElement(searchProductLink);

        return searchLinkElem.getText();

    }

    public void openProductLink(){

        Log4Test.info("Open product characteristics");

        searchLinkElem.click();
    }
}
