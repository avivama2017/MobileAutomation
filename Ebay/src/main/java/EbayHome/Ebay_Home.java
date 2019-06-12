package EbayHome;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ebay_Home extends MobileAPI {


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement selling;


    public void clickselling() {
        selling.click();
    }
        @FindBy(id = "com.ebay.mobile:id/button_sign_in")
                WebElement signin;

    public void setSignin(){
        signin.click();

    }
    @FindBy (id = "com.ebay.mobile:id/button_classic")
    WebElement email;
    public void setEmail(){
        email.click();
        
    }



}
//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
//    public static WebElement accountButton;
//    public void clickAccountButton() {
//        accountButton.click();
//    }
//    @FindBy(xpath = "\t//android.widget.TextView[@content-desc=\"YAHOO NEWS. Heading.\"]")
//    public static WebElement yahooNewsTitle;
//    public void clickTitle() {
//        yahooNewsTitle.click();
//    }
