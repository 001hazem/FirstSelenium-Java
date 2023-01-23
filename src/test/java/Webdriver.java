import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webdriver {
    protected static ChromeDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.calculator.net/");
    }

    @Test(priority = 4)
    public void verifyThatTheElementIsDisplayed(){

      WebElement element= HomePagePOM.getText();
        Assert.assertTrue(element.isDisplayed());
    }

    @Test(priority = 3)
    public void verifyThatTheTextIsCorrect(){
        String expectedResult="Free Online Calculators";

        WebElement element= HomePagePOM.getText();

        Assert.assertEquals(element.getText(),expectedResult);
    }

    @Test(priority = 2)
    public void verifyThatTheSearchFieldIsExist(){
       Assert.assertTrue(HomePagePOM.getSearchField().isDisplayed());
    }

    @Test(priority = 1)
    public void verifyThatWhenInputDataIsDisplayedInResult()
    {
        String notFound="hasjdiaspgfpyasf";
        String expectedResult="No calculator matches \""+notFound+"\".";

       HomePagePOM.getSearchField().sendKeys(notFound);
       Assert.assertEquals(HomePagePOM.inputGeneratedData().getText(),expectedResult);

    }

    @AfterClass
    public  void tearDown(){
//       driver.quit();
    }


}
