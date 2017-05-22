package ui_tests;

import core.TestBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.Login;
import pages.ResultPage;
import pages.xKomWelcomePage;
import pages.ADATA_128_GB_2_5;

import static org.testng.Assert.*;

public class SSDSearchTest extends TestBase {

    xKomWelcomePage page = new xKomWelcomePage();

    Login loginPage = new Login();

    ADATA_128_GB_2_5 ADATA128GB25 = new ADATA_128_GB_2_5();

    ResultPage searchPage = new ResultPage();

    Login loginClick = new Login();

    @Test
    public void setUpPreconditions(){

        page.open();

        assertTrue(page.isOpened());

    }

    @Test(dependsOnMethods = {"setUpPreconditions"})

    public void searchSmartphoneAndVerifyCharacteristics(){

        page.searchProduct(TestData.ADATA_128_GB_2_5);

        assertEquals(searchPage.verifyProductLink(), TestData.ADATA_128_GB_2_5);

        searchPage.openProductLink();

        assertTrue(ADATA128GB25.verifyProductContent().getText().contains(TestData.PRODUCT_NAME));

    }

    @Test(dependsOnMethods = {"setUpPreconditions"})
    public void loginWithCredentials() throws InterruptedException {

        loginClick.clickOnLogin();

        loginClick.credentialsEnter();

        loginClick.isOpened("https://www.x-kom.pl/logowanie/");

    }

}
