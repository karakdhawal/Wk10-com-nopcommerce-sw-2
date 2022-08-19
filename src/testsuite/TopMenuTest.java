package testsuite;
// Write down the following test into ‘TopMenuTest’ class

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.After;
import org.junit.Test;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup () {
        openBrowser(baseUrl);
    }

    @Test
    /*1. userShouldNavigateToComputerPageSuccessfully
    * click on the ‘Computers’ Tab * Verify the text ‘Computers’
     */


public void userShouldNavigateToComputerPageSuccessfully () {
        //driver.findElement(By.linkText("Computers"));
        WebElement computersClick = driver.findElement(By.linkText("Computers"));
        computersClick.click();
        //String actualMessage = driver.findElement(By.linkText("Computers")).getText();
        WebElement computerstab = driver.findElement(By.linkText("Computers"));
        String actualmes = computerstab.getText();
        System.out.println(actualmes);
        String expectedmes = "Computers";
        Assert.assertEquals(expectedmes,actualmes);
    }

    @Test
    /*2. userShouldNavigateToElectronicsPageSuccessfully
    * click on the ‘Electronics’ Tab * Verify the text ‘Electronics’
     */
    public void userShouldNavigateToElectronicPageSuccessfully () {
//        driver.findElement(By.linkText("Electronics"));
//        String actualmes = driver.findElement(By.linkText("Electronics")).getText();

        WebElement electronictab = driver.findElement(By.linkText("Electronics"));
        electronictab.click();
        WebElement electronic = driver.findElement(By.linkText("Electronics"));
        String actualmes = electronic.getText();
        System.out.println(actualmes);
        String expectedmes = "Electronics";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*3. userShouldNavigateToApparelPageSuccessfully
    *  click on the ‘Apparel’ Tab * Verify the text ‘Apparel’
     */
    public void userShouldNavigateToApparelPageSuccessfully () {
//        driver.findElement(By.linkText("Apparel"));
//        String actualmes = driver.findElement(By.linkText("Apparel")).getText();

        WebElement appareltab = driver.findElement(By.linkText("Apparel"));
        appareltab.click();
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        String actualmes = apparel.getText();
        System.out.println(actualmes);
        String expectedmes = "Apparel";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*4. userShouldNavigateToDigitalDownloadsPageSuccessfully
    * click on the ‘Digital downloads’ Tab * Verify the text ‘Digital downloads’
        */
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully () {
//        driver.findElement(By.linkText("Digital downloads"));
//        String actualmes = driver.findElement(By.linkText("Digital downloads")).getText();

        WebElement digitaldow = driver.findElement(By.linkText("Digital downloads"));
        digitaldow.click();
        WebElement digital = driver.findElement(By.linkText("Digital downloads"));
        String actualmes = digital.getText();
        System.out.println(actualmes);
        String expectedmes = "Digital downloads";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*5. userShouldNavigateToBooksPageSuccessfully
    * click on the ‘Books’ Tab * Verify the text ‘Books’
     */
    public void userShouldNavigateToBooksPageSuccessfully () {
//        driver.findElement(By.linkText("Books"));
//        String actualmes = driver.findElement(By.linkText("Books")).getText();
        WebElement bookstab = driver.findElement(By.linkText("Books"));
        bookstab.click();
        WebElement books = driver.findElement(By.linkText("Books"));
        String actualmes = books.getText();
        System.out.println(actualmes);
        String expectedmes = "Books";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*6. userShouldNavigateToJewelryPageSuccessfully
    * click on the ‘Jewelry’ Tab * Verify the text ‘Jewelry’
     */
    public void userShouldNavigatToJewelryPageSuccessfully () {
//        driver.findElement(By.linkText("Jewelry"));
//        String actualmes = driver.findElement(By.linkText("Jewelry")).getText();
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        WebElement jewelrytab = driver.findElement(By.linkText("Jewelry"));
        String actualmes = jewelrytab.getText();
        System.out.println(actualmes);
        String expectedmes = "Jewelry";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully () {
//        driver.findElement(By.linkText("Gift Cards"));
//        String actualmes = driver.findElement(By.linkText("Gift Cards")).getText();
        WebElement giftcards = driver.findElement(By.linkText("Gift Cards"));
        giftcards.click();
        WebElement gift = driver.findElement(By.linkText("Gift Cards"));
        String actualmes = gift.getText();
        System.out.println(actualmes);
        String expectedmes = "Gift Cards";
        Assert.assertEquals(expectedmes,actualmes);
    }

    @After
    public void teardown () {
        closeBrowser();
    }

}
