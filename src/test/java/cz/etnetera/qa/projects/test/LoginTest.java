package cz.etnetera.qa.projects.test;

import cz.etnetera.qa.projects.page.HomePage;
import org.junit.Test;

public class LoginTest extends SebTest {

    @Test
    public void login() throws Exception {
        seb.goTo(HomePage.class);

    }
}
