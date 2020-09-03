package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomeWithOutFindBy  {

    public static WebElement menu__Performance;


    @Test
    public void home  (){
        System.setProperty("webdriver.chrome.driver", "src/drives/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");




        PageFactory.initElements(driver,HomeWithOutFindBy.class);
        PageFactory.initElements(driver,LoginWithOutFindBy.class);




        menu__Performance.click();




    }
}
