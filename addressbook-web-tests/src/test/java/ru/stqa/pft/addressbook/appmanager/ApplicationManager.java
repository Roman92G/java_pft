package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class ApplicationManager {
    ChromeDriver wd;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().setSize(new Dimension(1062, 813));
        //      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@type='submit']")).click();
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

    public void gotoGroupPage() {

        wd.findElement(By.xpath("//a[@href='group.php']")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void deleteSelectedGroup() {
        wd.findElement(By.xpath("//hr/preceding-sibling::input[@value='Delete group(s)']")).click();
    }

    public void selectGroup2() {
        wd.findElement(By.xpath("//span[@class='group'][2]//input")).click();
    }
}
