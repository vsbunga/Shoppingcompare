package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;

    @Given("^launch next website$")
    public void launch_next_website() throws Throwable {

        System.setProperty("webdriver.chrome.driver","C:\\Library\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.next.co.uk/");

    }


    @When("^Search for mens shirt$")
    public void searchForMensShirt() {

    //driver.findElement(By.id("WebDriver ")).sendKeys("Mens Shirts");
    driver.findElement(By.xpath("//form[@id=\"newsearch\"]/input[4]")).click();

    }

    @Then("^print first two shirt prices$")
    public void printAnyTwoShirtPrices() {

     String FirstShirt = driver.findElement(By.xpath("//article[@id=\"i1\"]/section/div/div/a")).getText();
        System.out.println(FirstShirt);

        String SecondShirt = driver.findElement(By.xpath("//article[@id=\"i2\"]/section/div/div/a")).getText();
        System.out.println(SecondShirt);

    }
}
