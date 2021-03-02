package com.quinbay.qa.training.test;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.String;

import java.util.concurrent.TimeUnit;

public class SeleniumExample {
    public static void main (String []args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        SeleniumMethods seleniumMethods=new SeleniumMethods(driver);

        //driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        String siteurl= "https://www.edgewordstraining.co.uk/demo-site/";
        seleniumMethods.loadpage(siteurl);

        HomePageActions actions= new HomePageActions(driver);
        Thread.sleep(5000);

        String searchfield = "woocommerce-product-search-field-0";
        seleniumMethods.search(searchfield);
//        WebElement searchBox = driver.findElement(By.id("woocommerce-product-search-field-0"));
//        searchBox.click();
//        searchBox.sendKeys("Tshirt");
//        searchBox.sendKeys(Keys.RETURN);
        //Thread.sleep(3000);

        String elementlist = "//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/tshirt.jpg']";
        String empt = seleniumMethods.list(elementlist);
        System.out.print(empt);

//        List<WebElement> elements=driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/tshirt.jpg']"));
//        if (elements.isEmpty())
//            System.out.print("Element not found");
//        else
//            System.out.print("Element found");

        String vneck = "//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']";
        seleniumMethods.neck(vneck);
//        WebElement vneck = driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
//        vneck.click();

        String cartt = "add-to-cart";
        seleniumMethods.cart(cartt);
//        WebElement cart = driver.findElement(By.name("add-to-cart"));
//        cart.click();

        String viewcar = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/']";
        seleniumMethods.viewc(viewcar);

//        WebElement viewcart = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/']"));
//        viewcart.click();

        String proc = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']";
        seleniumMethods.proceed(proc);

//        WebElement proceed = driver.findElement(By.xpath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']"));
//        proceed.click();

        String fname = "billing_first_name";
        seleniumMethods.firstname(fname);


//        WebElement firstname = driver.findElement(By.id("billing_first_name"));
//        firstname.sendKeys("Gayathri");

        String lname = "//input[@id='billing_last_name']";
        seleniumMethods.laname(lname);
//        WebElement lastname = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
//        lastname.sendKeys("Arumugam");

        String comp = "billing_company";
        seleniumMethods.compny(comp);
//        WebElement company = driver.findElement(By.name("billing_company"));
//        company.sendKeys("Quinbay");

        String cntry = "billing_country";
        seleniumMethods.county(cntry);
//        Select country = new Select(driver.findElement(By.id("billing_country")));
//        country.selectByVisibleText("Hungary");

        String st1 = "//input [@placeholder='House number and street name']";
        seleniumMethods.street1(st1);

//        WebElement streetadd1 = driver.findElement(By.xpath("//input [@placeholder='House number and street name']"));
//        streetadd1.sendKeys("17, Bhavani Street");

        String st2 = "billing_address_2";
        seleniumMethods.street2(st2);

//        WebElement stadd2 = driver.findElement(By.id("billing_address_2"));
//        stadd2.sendKeys("TVS Nagar");

        String ct = "billing_city";
        seleniumMethods. citty(ct);

//        WebElement city = driver.findElement(By.id("billing_city"));
//        city.sendKeys("Coimbatore");

        String st = "billing_state";
        seleniumMethods.stat(st);
//        Select state = new Select(driver.findElement(By.id("billing_state")));
//        state.selectByVisibleText("Baranya");

        String post = "billing_postcode";
        seleniumMethods.postal(post);
//        WebElement zip = driver.findElement(By.id("billing_postcode"));
//        zip.sendKeys("560102");

        String ph = "billing_phone";
        seleniumMethods.phne(ph);
//        WebElement phone = driver.findElement(By.name("billing_phone"));
//        phone.sendKeys("9876543210");

        String mail = "billing_email";
        seleniumMethods.gmail(mail);
//        WebElement email = driver.findElement(By.id("billing_email"));
//        email.sendKeys("xyc@abz.com");

        String acc="createaccount";
        seleniumMethods.creatAcc(acc);
//        WebElement createAcc = driver.findElement(By.id("createaccount"));
//        Thread.sleep(3000);
//        createAcc.click();

        String pwrd = "account_password";
        seleniumMethods.password(pwrd);

//        WebElement pass = driver.findElement(By.name("account_password"));
//        pass.sendKeys("4321*");

        String pay = "//input[@id='payment_method_cod']";
        seleniumMethods.paymnt(pay);
//        WebElement payment=((ChromeDriver) driver).findElementByXPath("//input[@id='payment_method_cod']");
//        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);

        String order = "place_order";
        seleniumMethods.placeorder(order);
//        WebElement place = driver.findElement(By.id("place_order"));
//        place.submit();


        //driver.close();
    }
}
