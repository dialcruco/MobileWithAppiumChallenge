package Adapter.Bases;


import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;


public class BaseMobileTest {

    protected AndroidDriver<AndroidElement> driver;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        driver = MobileAppDriver.GetMoviesAppDriver(ConfigCapabilities.GetCapabilities());
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {

    }
}



