package pages.epam;

import elements.*;
import enums.RemoteOffice;
import org.openqa.selenium.By;

public class EpamPage {

    private final Button language = new Button(By.xpath("//*[@class=\"location-selector__button\"]"));
    private final Button en = new Button(By.xpath("//*[@lang=\"en\"]"));
    private final Selector keyword = new Selector(By.id("new_form_job_search_1445745853_copy-keyword"));
    private final Input location = new Input(By.xpath("//*[@class=\"select2-selection__rendered\"]"));
    private final Button skills = new Button(By.xpath("//*[@class=\"selected-params \"]"));
    private final Button testSoftware = new Button(By.xpath("//*[@class=\"checkbox-custom-label\"]//*[@data-value=\"Software Test Engineering\"]"));
    private final Checkbox opentToRelocation = new Checkbox(By.xpath("//*[@for=\"id-ce1e74aa-e69b-3bd2-9f9f-41628029ec68-relocation\"]"));
    private final Checkbox office = new Checkbox(By.xpath("//*[@for=\"id-ce1e74aa-e69b-3bd2-9f9f-41628029ec68-office\"]"));
    private final Checkbox remote = new Checkbox(By.xpath("//*[@for=\"id-ce1e74aa-e69b-3bd2-9f9f-41628029ec68-remote\"]"));
    private final Button juniorTest = new Button(By.xpath("//*[@class=\"search-result__item-apply\"]"));


    public Button getLanguage() {
        return language;
    }

    public Button getEn() {
        return en;
    }

    public Selector getKeyword() {
        return keyword;
    }


    public Input getLocation() {
        return location;
    }

    public Button getSkills() {
        return skills;
    }

    public Button getTestSoftware() {
        return testSoftware;
    }

    public Checkbox getOpentToRelocation() {
        return opentToRelocation;
    }

    public Checkbox getOffice() {
        return office;
    }

    public Checkbox getRemote(RemoteOffice office) {
        return remote;
    }

    public Button getJuniorTest() {
        return juniorTest;
    }
}

