package guru.qa.classWork;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulFillFormTest() {
        open("/text-box");

        $("#userName").setValue("Ivanov Ivan");
        $("#userEmail").setValue("test@gmail.com");
        $("#currentAddress").setValue("Moscow, st.Plehanova");
        $("#permanentAddress").setValue("Moscow, st.Bratskaya");
        $("#submit").click();

        $("#output #name").shouldHave(text("Ivanov Ivan"));
        $("#output #email").shouldHave(text("test@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Moscow, st.Plehanova"));
        $("#output #permanentAddress").shouldHave(text("Moscow, st.Bratskaya"));
    }
}
