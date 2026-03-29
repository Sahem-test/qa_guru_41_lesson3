package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseGuruQa {

    @BeforeAll
    static void setup(){
        Configuration.baseUrl = "https://qa-guru.github.io";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
