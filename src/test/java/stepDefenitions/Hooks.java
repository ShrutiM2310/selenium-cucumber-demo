package stepDefenitions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        BaseClass.setupDriver("chrome");
    }

    @After
    public void tearDown(){
        BaseClass.tearDown();
    }

}
