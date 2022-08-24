package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.netology.data.DataGenerator;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryPatternsTest {

    String firstMeetDate = DataGenerator.generateDate();
    String secondtMeetDate = DataGenerator.generateDate();

    @BeforeEach
    void setup() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");

    }

    @Test
    void cardDeliveryTest() {
        var validUser = DataGenerator.Registration.generateUser();

        $("[data-test-id=city] input").setValue(validUser.getCity());
        $("[data-test-id=date] input").doubleClick().sendKeys(firstMeetDate);
        $("[data-test-id=name] input").setValue(validUser.getName());
        $("[data-test-id=phone] input").setValue(validUser.getPhone());
        $("[data-test-id=agreement]").click();
        $(By.className("button")).click();

        $(".notification__content")
                .shouldHave(text("Встреча успешно запланирована на " + firstMeetDate))
                .shouldBe(visible);

        $("[data-test-id=date] input").doubleClick().sendKeys(secondtMeetDate);
        $(By.className("button")).click();
        $x("//span[contains(text(),'Перепланировать')]").click();

        $(".notification__content")
                .shouldHave(text("Встреча успешно запланирована на " + secondtMeetDate))
                .shouldBe(visible);
    }
}