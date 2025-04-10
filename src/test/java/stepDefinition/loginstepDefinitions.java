package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.Loginpage;
import utilities.Mydriver;

public class loginstepDefinitions {

    private static final Logger log = LoggerFactory.getLogger(loginstepDefinitions.class);
    private static WebDriver driver;
    Loginpage loginpage;


    @Given("login sayfasina git")
    public void login_sayfasina_git(){
       driver = Mydriver.getDriver();
       driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @And("username gir")
    public void username_gitt(){
        loginpage = new Loginpage(driver);
        loginpage.USERNAME("student");
    }

    @And("Password gir")
    public void password_gir(){
    loginpage.PASSWORD("Password123");

    }

    @When("Submit Butonuna tikla")
    public void Submit_Butonuna_tikla(){
        loginpage.clickbuton();
    }

    @Then("giris basarili oldumu")
    public void giris_basarili_oldumu(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginpage.SUCCESS();
        Mydriver.closeDriver();

    }

}
