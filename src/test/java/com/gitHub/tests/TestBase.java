package com.gitHub.tests;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.gitHub.helpers.Attach;
import com.gitHub.config.WebDriverProvider;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
