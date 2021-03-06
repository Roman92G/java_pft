package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    protected ChromeDriver wd;

    public HelperBase(ChromeDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).sendKeys(text);
    }

    public void initGroupModification() {
        click(By.xpath("//hr/preceding-sibling::input[@value='Edit group']"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@value='Update']"));
    }
}
