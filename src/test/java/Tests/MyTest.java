package Tests;

import Adapter.Bases.BaseMobileTest;
import Adapter.Screens.GlobalNavigationScreen;
import org.testng.annotations.Test;


public class MyTest extends BaseMobileTest {

    @Test
    public void test(){
        GlobalNavigationScreen globalNavigationScreen = new GlobalNavigationScreen(driver);

    }

}


