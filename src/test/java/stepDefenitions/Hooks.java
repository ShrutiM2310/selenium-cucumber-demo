package stepDefenitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Hooks {
    @Before
    public void setup(){
        String browser=ConfigReader.getProperty("browser");
        BaseClass.setupDriver(browser);
    }

    @After
    public void tearDown(){
        BaseClass.tearDown();
    }

}
