package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Hooks {

    private static final String BASE_URL = "https://www.epam.com/careers";

    @Before
    public void openBrowser(Scenario scenario) {
        open(BASE_URL);
        getWebDriver().manage().window().maximize();

    }

    @After
    public void afterScenario(){
        clearBrowserCache();
        closeWebDriver();
    }
}



