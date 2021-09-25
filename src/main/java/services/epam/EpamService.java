package services.epam;

import enums.RemoteOffice;
import pages.epam.EpamPage;

import static com.codeborne.selenide.Selenide.$;

public class EpamService {

    private final EpamPage epamPage = new EpamPage();
    public void language(){
        epamPage.getLanguage().click();
        epamPage.getEn().click();
    }
    public void search(
    ){
        epamPage.getKeyword().select("Jenkins");
        epamPage.getLocation().clearAndType("Belarus");
        epamPage.getSkills().click();
        epamPage.getTestSoftware().click();
        epamPage.getRemote(RemoteOffice.OFFICE).check();

    }
}
