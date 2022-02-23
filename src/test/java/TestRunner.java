import org.junit.Test;

public class TestRunner extends Setup  {

    LoginPage loginPage;


    @Test
    public void testLoginForm(){

        driver.get("http://localhost:8080");
        loginPage = new LoginPage(driver);
        loginPage.loginPageTest();
    }

}
