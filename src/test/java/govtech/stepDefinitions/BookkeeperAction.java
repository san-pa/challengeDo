package govtech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.rauschig.jarchivelib.FileType;
import org.testng.Assert;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.*;

import java.io.File;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.TimeUnit;

import static java.nio.file.Files.getFileStore;
import static java.nio.file.Files.readAttributes;

public class BookkeeperAction {
    public static  Response response;
    public static  RequestSpecification request;
    private JSONObject jsonBody;
    private JSONArray jsonArray;
WebDriver driver ;
String baseUrl= "http://localhost:9997/login";


    @Given("I have a login credentials")
    public void iHaveALoginCredentials() {
        String baseUrl= "http://localhost:9997/login";
        String dirPath ="C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Downloads";
    }

    @When("I navigate to baseurl in chrome browser for Bookkeeper")
    public void iNavigateToBaseurlInChromeBrowserForBookkeeper() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.name("username")).sendKeys("bk");
        driver.findElement(By.name("password")).sendKeys("bk");
        //driver.findElement(By.className("btn btn-primary")).click();
        driver.findElement(By.cssSelector("html > body > form > div:nth-of-type(3) > div:nth-of-type(2) > input")).click();
       driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div > div")).click();

        String reg1 = "S:[natid-number[0-9999999]]";

        String reg2 = "V:[number]";

        System.out.println("S:1".matches(reg1));
        System.out.println("S:3".matches(reg1));
        System.out.println("S:11".matches(reg1));

        System.out.println("V:1e0".matches(reg2));
        System.out.println("V:1e01".matches(reg2));
        System.out.println("V:1e3".matches(reg2));

        File f = new File("C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Downloads\tax_relief_file.txt");
        f.exists();
        f.length();
        f.canRead();
        f.isDirectory();

    }
    @Then("Check Relief Egress File")
    public void checkReliefEgressFile() {
    }

    @Then("no records generated only with footer")
    public void noRecordsGeneratedOnlyWithFooter() {
    }

    @When("I navigate to baseurl in chrome browser Egress Tax Relief file process in progress")
    public void iNavigateToBaseurlInChromeBrowserEgressTaxReliefFileProcessInProgress() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.name("username")).sendKeys("bk");
        driver.findElement(By.name("password")).sendKeys("bk");
        //driver.findElement(By.className("btn btn-primary")).click();
        driver.findElement(By.cssSelector("html > body > form > div:nth-of-type(3) > div:nth-of-type(2) > input")).click();
        driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div > div"));

    }
}
