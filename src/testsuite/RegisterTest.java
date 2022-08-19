package testsuite;
//5. Write down the following test into ‘RegisterTest’ class
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup () {
        openBrowser(baseUrl);
    }

    @Test
    /*1. userShouldNavigateToRegisterPageSuccessfully
    * click on the ‘Register’ link * Verify the text ‘Register’
     */
    public void userShouldNavigateToRegisterPageSuccessfully () {
//        driver.findElement(By.linkText("Register"));
//        String actualmes = driver.findElement(By.linkText("Register")).getText();
        WebElement reg = driver.findElement(By.linkText("Register"));
        reg.click();
        WebElement register = driver.findElement(By.linkText("Register"));
        String actualmes = register.getText();
        System.out.println(actualmes);
        String expectedmes = "Register";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
    * Select gender radio button * Enter First name
    * Enter Last name * Select Day Month and Year * Enter Email address
    * Enter Password * Enter Confirm password * Click on REGISTER button
    * Verify the text 'Your registration completed
     */
    public void userShouldRegisterAccountSuccessfully () {
        WebElement reg = driver.findElement(By.linkText("Register"));
        reg.click();
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("uk");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("lord");
        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        ////div[@class='date-picker-wrapper']
        day.sendKeys("1");
        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("January");
        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1981");
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("lorduk11@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        WebElement conpass = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        conpass.sendKeys("123456");
        WebElement register = driver.findElement(By.xpath("//button[@id='register-button']"));
        register.click();
        WebElement regi = driver.findElement(By.xpath("//div[@class='result']"));
        String actualmes = regi.getText();
        System.out.println(actualmes);
        String expectedmes = "Your registration completed";
        Assert.assertEquals(expectedmes,actualmes);
    }


    @After
    public void teardown (){
        closeBrowser();
    }


}
