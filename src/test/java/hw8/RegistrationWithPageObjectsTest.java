package hw8;

import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectsTest extends TestBase {

    @Test
    void fillFormTest() {
        String firstName = "Julia";
        String lastName = "Ivanova";
        String userEmail = "Ivanova@mail.com";
        String gender = "Female";
        String userPhone = "9187832345";
        String day = "30";
        String month = "June";
        String year = "1994";
        String subjects = "Computer Science";
        String hobby1 = "Music";
        String hobby2 = "Reading";
        String image = "Ivanova.jpg";
        String address = "Currect Address";
        String state = "Haryana";
        String city = "Karnal";


        registrationPage.openPage()
                .deleteBanner()
                .deleteFooter()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserPhone(userPhone)
                .setBirthData(day, month, year)
                .setSubjects(subjects)
                .setHobby(hobby1)
                .setHobby(hobby2)
                .uploadImage(image)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .registerForm();


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", userEmail)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", userPhone)
                .verifyResult("Date of Birth", day +" "+ month + "," + year)
                .verifyResult("Subjects", subjects)
                .verifyResult("Hobbies", hobby1 + ", " + hobby2 )
                .verifyResult("Picture", image)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);

    }
}
