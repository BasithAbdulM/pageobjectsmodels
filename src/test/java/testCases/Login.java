package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.LoginPageObj;

public class Login {

    @Test
    public void signin(){
        System.setProperty("webdriver.chrome.driver", "src/drives/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        PageFactory.initElements(driver,LoginPageObj.class);

        LoginPageObj.username.sendKeys("Admin");
        LoginPageObj.password.sendKeys("admin123");
        LoginPageObj.submit.click();


//        LoginPageObj.username(driver).sendKeys("Admin");
//        LoginPageObj.password(driver).sendKeys("admin123");
//        LoginPageObj.submit(driver).click();
//

//        LoginPageObj loginPageObj=new LoginPageObj();
//        loginPageObj.username(driver).sendKeys("Admin");
//        loginPageObj.password(driver).sendKeys("admin123");
//        loginPageObj.submit(driver).click();
        driver.quit();

    }


}
