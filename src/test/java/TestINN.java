import org.junit.Test;
import pages.BasePage;
import steps.AgreementSteps;
import steps.BaseSteps;
import steps.InnSteps;

public class TestINN extends BaseSteps {

    // заменить на актуальные данные
    private String
            surname = "Юшин",
            name = "Иван",
            patronymic = "Евгеньевич",
            birthDate = "01111990",
            placeOfBirth = "город Москва",
            document = "21"; // код документа на сайте

    @Test
    public void Inn(){
        AgreementSteps agreementSteps = new AgreementSteps();
        InnSteps innSteps = new InnSteps();

        agreementSteps.aggrement();
        agreementSteps.continueButton();
        innSteps.fillSurnameField(surname);
        innSteps.fillFirstName(name);
        innSteps.fillPatronymicField(patronymic);
        innSteps.fillBirthDate(birthDate);
        innSteps.fillPlaceOfBirth(placeOfBirth);
        innSteps.fillCertificateDocument(document);
        innSteps.fillSerialAndNumber("1111111111"); // заменить на актуальные паспортные данные
        innSteps.sendRequest();
        innSteps.getInnNumber();

    }
}