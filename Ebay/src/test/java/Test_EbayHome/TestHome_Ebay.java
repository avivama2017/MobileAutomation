package Test_EbayHome;

import EbayHome.Ebay_Home;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome_Ebay extends MobileAPI {

    Ebay_Home ebay_home;


    @BeforeMethod
    public void initElemets123(){
        ebay_home= PageFactory.initElements(appiumDriver,Ebay_Home.class);

    }

@Test(priority = 2)
    public void testSSelling(){
        ebay_home.clickselling();

}
@Test(priority = 1)
    public void click_singin(){
        ebay_home.setSignin();
        ebay_home.setEmail();
}
//@Test(priority = 3)
//    public void click_email(){
//        ebay_home.setEmail();
}

