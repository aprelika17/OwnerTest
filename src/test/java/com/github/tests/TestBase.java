package com.github.tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import com.github.helpers.Attach;
import com.github.config.WebDriverProvider;


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
