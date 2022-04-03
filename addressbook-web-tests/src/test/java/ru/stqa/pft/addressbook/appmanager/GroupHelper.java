package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
   private ChromeDriver wd;

    public GroupHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage() {
        wd.findElement(By.xpath("//a[text()='group page']")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getNamegroup());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {

        wd.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroup() {
        wd.findElement(By.xpath("//hr/preceding-sibling::input[@value='Delete group(s)']")).click();
    }

    public void selectGroup2() {
        wd.findElement(By.xpath("//span[@class='group'][2]//input")).click();
    }
}
