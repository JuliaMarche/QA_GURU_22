package hw8;

import com.codeborne.selenide.Configuration;
import hw8.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    protected RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
}

