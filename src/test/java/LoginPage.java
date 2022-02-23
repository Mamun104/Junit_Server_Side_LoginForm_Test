import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginPageTest(){

        WebElement userName = driver.findElement(By.cssSelector("[placeholder = 'Enter Username']"));
        WebElement userPassword = driver.findElement(By.cssSelector("[placeholder = 'password']"));
        WebElement loginBtn = driver.findElement(By.tagName("button"));
        userName.sendKeys("SomeName");
        userPassword.sendKeys("TopSecret1234!");
        loginBtn.click();


        String text = driver.findElement(By.tagName("div")).getText();
        Assert.assertTrue(text.contains("If you do not have an account, contact an admin"));

    }

}
