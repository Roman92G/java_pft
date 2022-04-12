package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    ChromeDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;



    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().setSize(new Dimension(1062, 813));
        //      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {

        wd.quit();
    }

    public GroupHelper getGroupHelper() {

        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {

        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

}
