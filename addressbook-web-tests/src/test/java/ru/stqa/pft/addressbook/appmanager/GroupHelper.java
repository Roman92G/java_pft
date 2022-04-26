package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(ChromeDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {

        click(By.xpath("//a[text()='group page']"));
    }

    public void submitGroupCreation() {

        click(By.xpath("//input[@type='submit']"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getNamegroup());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {

        click(By.name("new"));
    }

    public void deleteSelectedGroup() {

        click(By.xpath("//hr/preceding-sibling::input[@value='Delete group(s)']"));
    }

    public void selectGroup2() {

        click(By.xpath("//span[@class='group'][2]//input"));
    }
}
