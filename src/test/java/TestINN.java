import org.junit.Test;
import pages.BasePage;
import steps.AgreementSteps;
import steps.BaseSteps;
import steps.InnSteps;

public class TestINN extends BaseSteps {

    String surname = "Юшин";

    @Test
    public void Inn(){
        AgreementSteps agreementSteps = new AgreementSteps();
        InnSteps innSteps = new InnSteps();

        agreementSteps.aggrement();
        agreementSteps.continueButton();
        innSteps.fillSurnameField(surname);
    }
}