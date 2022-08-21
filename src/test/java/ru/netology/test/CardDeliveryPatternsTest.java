package ru.netology.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryPatternsTest {
    DataGenerator generator = new DataGenerator();


    @Test
    void cardDeliveryTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";
        var validUser = DataGenerator.Registration.generateUser("ru");
        //int firstMeetDate = Integer.parseInt(validUser.getDate());
        //int secondMeetDate = firstMeetDate + 3;

        open("http://localhost:9999");
        $("[data-test-id = city] input").setValue(validUser.getCity());
        $("[data-test-id = date] input").doubleClick();
        $("[data-test-id = date] input").sendKeys(Keys.BACK_SPACE);
        $("[data-test-id = date] input").setValue((validUser.getFirstDate()));
        $("[data-test-id = name] input").setValue(validUser.getName());
        $("[data-test-id = phone] input").setValue(validUser.getPhone());
        $("[data-test-id = agreement]").click();
        $$(By.className("button__content")).first().click();
        $("[data-test-id = notification]").shouldBe(Condition.visible, Duration.ofSeconds(15));
        $x(".//div[@class='notification__title']").shouldBe(text("Успешно!"));
        $x(".//div[@class='notification__content']").
                shouldBe(text("Встреча успешно забронирована на " + validUser.getFirstDate()));

        $("[data-test-id = date] input").doubleClick();
        $("[data-test-id = date] input").doubleClick();
        $("[data-test-id = date] input").sendKeys(Keys.BACK_SPACE);
        $("[data-test-id = date] input").setValue(validUser.getSecondDate());
        $$(By.className("button__content")).first().click();

        //При повторной отправке окно не выводиться, нет возможноститочно прописать селекторы - это заготовка
        //$("[data-test-id = notification]").shouldBe(Condition.visible, Duration.ofSeconds(15));
        //$x(".//div[@class='notification__title']").shouldBe(text("Необходимо подтверждение"));
        //$х(".//div[@class='notification__title']" ) Перепланировать").click();

        //$x(".//div[@class='notification__content']").
        //        shouldBe(text("Встреча успешно забронирована на " + validUser.getSecondDate()));



    }

}
