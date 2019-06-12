package NY_Test;

import NYHome.NY_Home;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NYHomeTest extends MobileAPI {
   @Test
    public void Testmust() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.must();
        sleep(2);
    }
    @Test
    public void TestPHOTO() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.PHOTO();
        sleep(2);
    }
    @Test
    public void Us() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.US();
        sleep(2);
    }
    @Test
    public void Sport() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.Sports();
        sleep(2);
    }
   @Test
    public void Arts() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.ARTS();
        sleep(2);
    }
    @Test
    public void NewYork() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.NY();
        sleep(2);
    }
    @Test
    public void Testopinion() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.Opinion();
        sleep(2);
    }
    @Test
    public void Testoption() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.Option();
        sleep(2);
    }
    @Test
    public void Testworld() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.World();
        sleep(2);
    }
    @Test
    public void TestNTTab() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.tab();
        sleep(2);
    }
   @Test
    public void TestSports() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.tab();
        home.sp();
        sleep(2);
    }
   @Test
    public void TestSttings() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.set();
        sleep(2);
    }
   // @Test
    public void Testlogin() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.login();
        sleep(2);
    }
   @Test
    public void TestLogin() throws InterruptedException {
        NY_Home home = PageFactory.initElements(appiumDriver, NY_Home.class);
        home.Option();
        home.LOGIN();
        sleep(2);
    }

}