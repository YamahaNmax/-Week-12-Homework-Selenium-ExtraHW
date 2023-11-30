package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://automationexercise.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void loginUserWithCorrectEmailAndPassword() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement loginText = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[4]/a"));
        loginText.click();

        String actualText2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedText2 = "Login to your account";
        Assert.assertEquals(actualText2, expectedText2);

        WebElement emailLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[2]"));
        emailLoginField.sendKeys("m4mitzcodebuster@gmail.com");

        WebElement passwordLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[3]"));
        passwordLoginField.sendKeys("Codebuster");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='login-form']/form/button"));
        loginButton.click();

        String actualText3 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]/a")).getText();
        String expectedText3 = "Logged in as Miten";
        Assert.assertEquals(actualText3, expectedText3);

    }

    @Test
    public void loginUserWithIncorrectEmailAndPassword() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement loginText = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[4]/a"));
        loginText.click();

        String actualText2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedText2 = "Login to your account";
        Assert.assertEquals(actualText2, expectedText2);

        WebElement emailLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[2]"));
        emailLoginField.sendKeys("m4mitzcodebuster1@gmail.com");

        WebElement passwordLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[3]"));
        passwordLoginField.sendKeys("Codebuster");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='login-form']/form/button"));
        loginButton.click();

        String actualText3 = driver.findElement(By.xpath("//div[@class='login-form']/form/p")).getText();
        String expectedText3 = "Your email or password is incorrect!";
        Assert.assertEquals(actualText3, expectedText3);
    }

    @Test
    public void logoutUser() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement loginText = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[4]/a"));
        loginText.click();

        String actualText2 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedText2 = "Login to your account";
        Assert.assertEquals(actualText2, expectedText2);

        WebElement emailLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[2]"));
        emailLoginField.sendKeys("m4mitzcodebuster@gmail.com");

        WebElement passwordLoginField = driver.findElement(By.xpath("//div[@class='login-form']/form/input[3]"));
        passwordLoginField.sendKeys("Codebuster");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='login-form']/form/button"));
        loginButton.click();

        String actualText3 = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[10]/a")).getText();
        String expectedText3 = "Logged in as Miten";
        Assert.assertEquals(actualText3, expectedText3);

        WebElement logoutText = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a"));
        logoutText.click();

        String actualText4 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        String expectedText4 = "Login to your account";
        Assert.assertEquals(actualText4, expectedText4);

    }

    @Test
    public void registerUserWithExistingEmail() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement loginText = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[4]/a"));
        loginText.click();

        String actualText2 = driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
        String expectedText2 = "New User Signup!";
        Assert.assertEquals(actualText2, expectedText2);

        WebElement nameField = driver.findElement(By.xpath("//div[@class='signup-form']/form/input[2]"));
        nameField.sendKeys("Yamaha");

        WebElement emailRegisterField = driver.findElement(By.xpath("//div[@class='signup-form']/form/input[3]"));
        emailRegisterField.sendKeys("m4mitzcodebuster@gmail.com");

        WebElement signUpButton = driver.findElement(By.xpath("//div[@class='signup-form']/form/button"));
        signUpButton.click();

        String actualText3 = driver.findElement(By.xpath("//div[@class='signup-form']/form/p")).getText();
        String expectedText3 = "Email Address already exist!";
        Assert.assertEquals(actualText3, expectedText3);
    }

    @Test
    public void verifyTestCasePage() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement testCasesButton = driver.findElement(By.xpath("//div[@class='carousel-inner']/div[1]/div[1]/a[1]/button"));
        testCasesButton.click();

        String actualText2 = driver.findElement(By.xpath("//h2[@class='title text-center']/b")).getText();
        String expectedText2 = "TEST CASES";
        Assert.assertEquals(actualText2, expectedText2);

    }

    @Test
    public void verifyAllProductsAndProductDetailPage() {

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement productsButton = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[2]/a"));
        productsButton.click();

        String actualText2 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        String expectedText2 = "ALL PRODUCTS";
        Assert.assertEquals(actualText2, expectedText2);

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,250)", "");

        WebElement firstProduct = driver.findElement(By.xpath("//div[@class='features_items']/div[2]/div[1]/div[2]/ul/li/a/i"));
        firstProduct.click();

        String actualText3 = driver.findElement(By.xpath("//div[@class='product-information']/h2")).getText();
        String expectedText3 = "Blue Top";
        Assert.assertEquals(actualText3, expectedText3);

        String actualText4 = driver.findElement(By.xpath("//div[@class='product-information']/p")).getText();
        String expectedText4 = "Category: Women > Tops";
        Assert.assertEquals(actualText4, expectedText4);

        String actualText5 = driver.findElement(By.xpath("//div[@class='product-information']/span/span")).getText();
        String expectedText5 = "Rs. 500";
        Assert.assertEquals(actualText5, expectedText5);

        String actualText6 = driver.findElement(By.xpath("//div[@class='product-information']/p[2]/b")).getText();
        String expectedText6 = "Availability:";
        Assert.assertEquals(actualText6, expectedText6);

        String actualText7 = driver.findElement(By.xpath("//div[@class='product-information']/p[3]/b")).getText();
        String expectedText7 = "Condition:";
        Assert.assertEquals(actualText7, expectedText7);

        String actualText8 = driver.findElement(By.xpath("//div[@class='product-information']/p[4]/b")).getText();
        String expectedText8 = "Brand:";
        Assert.assertEquals(actualText8, expectedText8);

    }

    @Test

    public void searchProduct(){

        String actualText1 = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[1]/a")).getText();
        String expectedText1 = "Home";
        Assert.assertEquals(actualText1, expectedText1);

        WebElement productsButton = driver.findElement(By.xpath("//div[@class='header-middle']/div[1]/div[1]/div[2]/div/ul/li[2]/a"));
        productsButton.click();

        String actualText2 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        String expectedText2 = "ALL PRODUCTS";
        Assert.assertEquals(actualText2, expectedText2);

        WebElement searchField = driver.findElement(By.xpath("//div[@class='container']/input"));
        searchField.sendKeys("Top");

        WebElement searchButton = driver.findElement(By.xpath("//div[@class='container']/button"));
        searchButton.click();

        String actualText3 = driver.findElement(By.xpath("//h2[@class='title text-center']")).getText();
        String expectedText3 = "SEARCHED PRODUCTS";
        Assert.assertEquals(actualText3, expectedText3);

    }


    @After
    public void endTest() {
        closeBrowser();
    }
}
