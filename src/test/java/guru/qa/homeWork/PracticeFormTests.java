package guru.qa.homeWork;

import guru.qa.TestBaseGuruQa;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests extends TestBaseGuruQa {

    @Test
    void FillPracticeFormPositiveTest(){
        open("/one-page-form/automation-practice-form.html");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("test@mail.com");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("8985426455");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").selectOption("1976");
        $(".react-datepicker__day--010").click();


        sleep(5000);
    }
}
//.react-datepicker__day react-datepicker__day--010