package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import pages.P01_Home;
import pages.P02_HomeII;
import utilities.Utility;

import java.io.IOException;

import static utilities.Utility.captureScreenshot;


public class TC001_Login extends TestBase{

@Test(priority = 1,description = "Check Login With random name selection")
public void loginwithvaliddata_P() throws InterruptedException {

new P01_Home(driver).clickoncusomerlogin();
Thread.sleep(1000);
new P02_HomeII(driver).chooserandomname().clickonlohinbutton();
    Thread.sleep(2000);
    captureScreenshot(driver,"P_Login");
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertTrue(new P02_HomeII(driver).checkwelcomemsg());
    softAssert.assertAll();
}


}

