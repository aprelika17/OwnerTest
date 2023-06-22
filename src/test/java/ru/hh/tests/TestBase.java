package ru.hh.tests;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.hh.config.WebDriverProvider;
import ru.hh.pages.PageObject;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach(){
        Selenide.closeWindow();
    }

    @AfterEach
    void addAttachments(){
        ru.hh.helpers.Attach.screenshotAs("Last screenshot");
        ru.hh.helpers.Attach.pageSource();
        ru.hh.helpers.Attach.browserConsoleLogs();
        ru.hh.helpers.Attach.addVideo();
    }
}
