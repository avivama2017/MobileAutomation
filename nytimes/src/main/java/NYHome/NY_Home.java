package NYHome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NY_Home {
    @FindBy(className = "android.widget.ImageButton")
    WebElement NYT;
    @FindBy(id = "com.nytimes.android:id/title")
    WebElement Sports;
    @FindBy(className = "android.widget.ImageView")
    WebElement Settings;
    @FindBy(className = "android.widget.TextView")
    WebElement LoginBtn;
    @FindBy(xpath = "\t/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]\n")
    WebElement mostpopular;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[3]\n")
    WebElement opinion;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[4]\n")
    WebElement world;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    WebElement option;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[2]\n")
   WebElement us;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[4]")
WebElement sports;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[5]\n")
    WebElement arts;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[6]\n")
    WebElement ny;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
    WebElement loginct;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.LinearLayout[12]/android.widget.RelativeLayout\n")
    WebElement photo;
    public void PHOTO(){
        photo.click();
    }
    public void LOGIN(){
        loginct.click();
    }
    public void NY(){
        ny.click();
    }
    public void ARTS(){
        arts.click();
    }
    public void Sports(){
        sports.click();
    }
   public void US(){
        us.click();
    }
    public void Option(){
        option.click();
    }
    public void World(){
        world.click();
    }
    public void Opinion(){
        opinion.click();
    }
    public void must(){
        mostpopular.click(); }
    public void tab() {
        NYT.click();
    }
    public void sp() {
        Sports.click();
    }
    public void set() {
        Settings.click();
    }
    public void login() {
        LoginBtn.click();
    }
}
