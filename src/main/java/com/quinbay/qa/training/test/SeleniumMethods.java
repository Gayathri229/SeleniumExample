package com.quinbay.qa.training.test;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


//import com.quinbay.qa.training.Actions.HomePageActions;
//import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class SeleniumMethods{

    WebDriver drive;

    public SeleniumMethods(WebDriver driver)
    {
        drive=driver;
    }

    public void loadpage(String path)
    {
        drive.get(path);
    }

    public void search(String path) throws InterruptedException
    {
        WebElement searchBox = drive.findElement(By.id(path));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
    }

    public String list(String path)
    {
        List<WebElement> elements = drive.findElements(By.xpath(path));
        if(elements.isEmpty())
        {
            return ("false");
        }
        else
            return ("true");


    }

    public void neck(String path)
    {
        WebElement vneck = drive.findElement(By.xpath(path));
        vneck.click();
    }

    public void cart(String path)
    {
        WebElement cart = drive.findElement(By.name(path));
        cart.click();
    }

    public void viewc(String path)
    {
        WebElement viewcart = drive.findElement(By.xpath(path));
        viewcart.click();
    }

    public void proceed(String path)
    {
        WebElement proceed = drive.findElement(By.xpath(path));
        proceed.click();
    }

    public void firstname(String path)
    {
        WebElement firstname = drive.findElement(By.id(path));
        firstname.sendKeys("Gayathri");
    }

    public void laname(String path)
    {
        WebElement lastname = drive.findElement(By.xpath(path));
        lastname.sendKeys("Arumugam");

    }

    public void compny(String path)
    {
        WebElement company = drive.findElement(By.name(path));
        company.sendKeys("Quinbay");
    }

    public void county(String path)
    {
        Select country = new Select(drive.findElement(By.id(path)));
        country.selectByVisibleText("Hungary");
    }

    public void street1(String path)
    {
        WebElement streetadd1 = drive.findElement(By.xpath(path));
        streetadd1.sendKeys("17, Bhavani Street");
    }

    public void street2(String path)
    {
        WebElement stadd2 = drive.findElement(By.id(path));
        stadd2.sendKeys("TVS Nagar");
    }

    public void citty(String path)
    {
        WebElement city = drive.findElement(By.id(path));
        city.sendKeys("Coimbatore");
    }

    public void stat(String path)
    {
        Select state = new Select(drive.findElement(By.id(path)));
        state.selectByVisibleText("Baranya");
    }

    public void postal(String path)
    {
        WebElement zip = drive.findElement(By.id(path));
        zip.sendKeys("560102");
    }

    public void phne(String path)
    {
        WebElement phone = drive.findElement(By.name(path));
        phone.sendKeys("9876543210");
    }

    public void gmail(String path) {
        WebElement email = drive.findElement(By.id(path));
        email.sendKeys("xyc@abz.com");
    }

    public void creatAcc(String path) throws InterruptedException
    {
        WebElement createAcc = drive.findElement(By.id(path));
        Thread.sleep(3000);
        createAcc.click();
    }

    public void password(String path)
    {
        WebElement pass = drive.findElement(By.name(path));
        pass.sendKeys("4321*");
    }

    public void paymnt(String path)
    {
        WebElement payment = ((ChromeDriver) drive).findElementByXPath("//input[@id='payment_method_cod']");
        ((JavascriptExecutor) drive).executeScript("arguments[0].checked = true;", payment);
    }

    public void placeorder(String path)
    {
        WebElement place = drive.findElement(By.id(path));
        place.submit();
    }

}
