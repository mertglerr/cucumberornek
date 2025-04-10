package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement uname;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement buton;

    @FindBy(className = "post-title")
    private WebElement success;

    public Loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void USERNAME(String user){
        uname.sendKeys(user);
    }
    public void PASSWORD(String pass){
        password.sendKeys(pass);
    }
    public void clickbuton(){
        buton.click();
    }
    public void SUCCESS(){
        Assert.assertTrue(success.isDisplayed());
    }


}
