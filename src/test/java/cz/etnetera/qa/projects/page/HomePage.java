package cz.etnetera.qa.projects.page;

import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.page.Page;
import cz.etnetera.seb.page.PageConfig;
import org.openqa.selenium.support.FindBy;

@PageConfig(uri = "/")
public class HomePage extends Page {

    @FindBy(id = "elementId")
    protected SebElement someElement;


}
