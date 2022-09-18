package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;


public class TextBox {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1980x1760";
        Configuration.holdBrowserOpen = true;

    }


    @Test
    void fillNameTest(){
        open("/automation-practice-form");
       $("[id=firstName]").setValue("Valeria");
       $("[id=lastName]").setValue("Bagrova");

      $("[id=userEmail]").setValue("vbagrova123456@gmail.com");

        $("[id=genterWrapper]").$(byText("Female")).click();
        $("#userNumber").setValue("1234567890");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
         $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__day--002").click();


        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();

        $(byText("Reading")).click();

        $("#uploadPicture").uploadFromClasspath("crow-of-judgement.jpg");

        $("#currentAddress").setValue("Address 123");

        $("#state").scrollTo().click();
        $("[id=stateCity-wrapper]").$(byText("Haryana")).click();
        $("#city").click();
        $("[id=stateCity-wrapper]").$(byText("Karnal")).click();
        $("#submit").scrollTo().click();

    }
}
