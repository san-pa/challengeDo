package govtech.stepDefinitions;
import govtech.apiutils.ApiUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
public class ClerksAction  {
    public static  Response response;
    public static  RequestSpecification request;
    private JSONObject jsonBody;
    private JSONArray jsonArray;
String baseUrl= "http://localhost:9997/login";
    //DashboardPage dashboardPage;
    //LoginPage loginPage;
    @Given("I have a valid csv file named {string}")
    public void i_have_a_valid_csv_file_named(String string) {
        File filepath = new File("src/test/resources/testdata/working-hero.csv");
    }
    @When("I navigate to baseurl in chrome browser")
    public void i_navigate_to_baseurl_in_chrome_browser() throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Documents\\Projectwork\\Finalprj\\GovtechChallange\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.name("username")).sendKeys("clerk");
        driver.findElement(By.name("password")).sendKeys("clerk");
        //driver.findElement(By.className("btn btn-primary")).click();
        driver.findElement(By.cssSelector("html > body > form > div:nth-of-type(3) > div:nth-of-type(2) > input")).click();
        driver.findElement(By.id("dropdownMenuButton2")).click();
        driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div:nth-of-type(2) > div > div > div > ul > li:nth-of-type(2) > a")).click();
        driver.findElement(By.cssSelector("input#upload-csv-file")).sendKeys("C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Documents\\Projectwork\\Finalprj\\GovtechChallange\\src\\test\\resources\\testdata\\data.csv");
        driver.findElement(By.cssSelector("html > body > div:nth-of-type(2) > div:nth-of-type(3) > div:nth-of-type(3) > button")).click();
    }




    @Then("Clerks dashboard UI is shown")
    public void clerksDashboardUIIsShown() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\san.padmanabhan\\OneDrive - Accenture\\Documents\\Projectwork\\Finalprj\\GovtechChallange\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"notification-block\"]/div[1]/div[1]/p[1]"));

    }
}
