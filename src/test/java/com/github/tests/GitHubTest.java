package com.github.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest extends TestBase{

    @Test
    void testEnterprize() {

        open("");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div.position-relative h1").shouldHave(text("Let’s build from here"));

    }
}
