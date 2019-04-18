package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.InnPage;

public class InnSteps {
    private InnPage innPage = new InnPage();

    @Step("Заполняем поле Фамилия - {0}")
    public void fillSurnameField(String surname){
        innPage.clickElement(innPage.surnameField);
        BaseSteps.getDriver().findElement(By.xpath("//*[contains(@id, 'uni_text_1')]")).click();
        BaseSteps.getDriver().findElement(By.xpath("//*[contains(@id, 'uni_text_1')]")).sendKeys(surname);
    }
}