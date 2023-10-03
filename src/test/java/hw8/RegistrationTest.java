package hw8;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationTest extends TestBase {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Julia");
        $("#lastName").setValue("Ivanova");
        $("#userEmail").setValue("Ivanova@mail.com");
        $(byText("Female")).click();
        $("#userNumber").setValue("9187832345");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").$(byText("June")).click();
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__day--019").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("Ivanova.jpg");
        $("#currentAddress").setValue("Currect Address");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();
        $("#submit").click();

        $(".modal-dialog").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(
                text("Julia Ivanova"),
                text("Ivanova@mail.com"),
                text("Female"),
                text("9187832345"),
                text("19 June,1994"),
                text("Computer Science"),
                text("Ivanova.jpg"),
                text("Currect Address"),
                text("Haryana Karnal")
        );
    }
}
