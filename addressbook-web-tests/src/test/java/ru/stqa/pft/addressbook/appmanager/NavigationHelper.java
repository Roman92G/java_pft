package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(ChromeDriver wd) {

        super(wd);
    }

    public void gotoGroupPage() {

        click(By.xpath("//a[@href='group.php']"));
    }
    public void gotoContactPage() {
        click(By.xpath("//a[@href='edit.php']"));
    }
}

