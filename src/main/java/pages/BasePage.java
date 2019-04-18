package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class BasePage {

    private WebDriver driver = BaseSteps.getDriver();
    private Wait<WebDriver> waiter = new WebDriverWait(driver, 30, 1000);

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element){
        waiter.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void scrollPage(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",  element);
    }

    public void fillField(WebElement element, String surname){
        element.click();
        element.clear();
        element.sendKeys(surname);
    }
}