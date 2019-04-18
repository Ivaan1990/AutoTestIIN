package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InnPage extends BasePage {
    @FindBy(xpath = "//*[contains(@name, 'fam')]")
    public WebElement surnameField;
}