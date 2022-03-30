package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {
    ChromeDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().setSize(new Dimension(1062, 813));
  //      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test
    public void testGroupCreation() {

        wd.findElement(By.linkText("groups")).click();
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).sendKeys("Test1");
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).sendKeys("Test2");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).sendKeys("Test3");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();
    }

    @AfterMethod
    public void tearDown() {

        wd.quit();
    }

}