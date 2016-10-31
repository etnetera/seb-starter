package cz.etnetera.qa.projects.test;

import cz.etnetera.qa.projects.configuration.SebConfig;
import cz.etnetera.seb.Seb;
import org.junit.After;
import org.junit.Before;

public abstract class SebTest {

    protected Seb seb;

    @Before
    public void setUp() throws Exception {
        seb = new Seb(true).withConfiguration(SebConfig.class);
    }


    @After
    public void tearDown() throws Exception {
        seb.quit();
    }



}