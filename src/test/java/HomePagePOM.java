import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePagePOM {
    static public WebElement getText(){
       return Webdriver.driver.findElement(By.xpath("//*[@id=\"contentout\"]/table/tbody/tr/td[2]/h1"));
    }
    static public WebElement getSearchField()
    {
        return Webdriver.driver.findElement(By.id("calcSearchTerm"));
    }

    static public WebElement inputGeneratedData()
    {
        return Webdriver.driver.findElement(By.id("calcSearchOut"));
    }

}
