package pageObjects;

import jdk.nashorn.internal.runtime.regexp.joni.Warnings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObj {
    @FindBy(className = "button")
    public static WebElement subscribe;

//    public static WebElement subscribe(WebDriver driver){
//        return driver.findElement(By.className("button"));
//    }
}
