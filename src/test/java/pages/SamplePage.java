package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.TestBase_Commands;

public class SamplePage extends TestBase_Commands {

    private final static By tf_Username = By.xpath("//input[@name='username']");
    private final static By tf_Password = By.name("password");

    public SamplePage(WebDriver driver) {
        this.driver = driver;
    }

    // Open the application
    public void bf_OpenApplication() {

        WriteToReport("=======Start of bf_OpenSelfCarePortal=============");

        // Open the browser
        Open("https://external.peotv.com/login/");


        WriteToReport("=======End of bf_OpenSelfCarePortal=============");
    }

    // Open the application
    public void bf_Login(String prm_Username) {

        WriteToReport("=======Start of bf_Login=============");


        //Type Username
        Type(tf_Username, prm_Username);
        //Type password
        Type(tf_Password,"mit_1234");

        WriteToReport("=======End of bf_Login=============");
    }
}
