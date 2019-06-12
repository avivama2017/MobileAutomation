package TestHomePage;

import HomePage.HomePage;
import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI {
    HomePage homePage;
    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(appiumDriver, HomePage.class); }

    @Test
    public void testAccountButton() throws InterruptedException {
        homePage.clickAccountButton();
    sleep(2);
    }

   @Test
    public void  testTitleButton() throws InterruptedException {
        homePage.clickTitle();
    sleep(2);
    }
   @Test
    public void getTitleText() throws InterruptedException {

       homePage.clickTitle();
    sleep(2);}

   @Test
    public void testTopStories() throws InterruptedException {
       homePage.clickTopStories();
    sleep(2);}
    @Test
    public void testTopStoriesTexts() throws InterruptedException {
        homePage.clickTopStories();
    sleep(2);}
    //@Test
    public void testTopVideos() throws InterruptedException {
        homePage.clickTopVideos();
    sleep(2);}

    @Test
    public void testOriginalsLink() throws InterruptedException {
        homePage.clickOriginalOption();
    sleep(2);}

    @Test
    public void testTrendingLink() throws InterruptedException {
        homePage.clickTrending();
    sleep(2);}
    @Test
    public void testTrendingText() throws InterruptedException {
        homePage.clickTrending();
    sleep(2);}
    @Test
    public void testSearchButton() throws InterruptedException {
        homePage.clickHomePageSearch();
        sleep(2);
        homePage.searchBar("movie");}
        @Test
        public void testStory() throws InterruptedException {
            homePage.clickFirstStory();
            sleep(2);}


    @Test
    public void testShare() throws InterruptedException {
        homePage.clickShare();
        sleep(2);}
    /*@Test
    public void testBookmark() throws InterruptedException {
        homePage.clickBookmark();
        sleep(2);}
    @Test
    public void testsecStory() throws InterruptedException {
        homePage.clickSecondStory();
        sleep(2);}
*/
}