package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

@Log4j2
public class HomeSteps extends BaseSteps {

    private HomePage homePage;

    public HomeSteps(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
    }

    @Step("Get user name.")
    public String getUserName() {
        log.info("Get displayed username.");
        return homePage.getUsernameLabel().getText();
    }

    @Step("Get user role.")
    public String getUserRole() {
        log.info("Get displayed user role.");
        return homePage.getUserRoleLabel().getText();
    }
}