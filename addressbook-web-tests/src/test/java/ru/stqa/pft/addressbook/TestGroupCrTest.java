package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGroupCrTest {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
  }

  @Test
  public void testGroupCr() {
    driver.get("http://localhost/addressbook/group.php");
    driver.manage().window().setSize(new Dimension(1062, 813));
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
 //   driver.findElement(By.cssSelector(".admin font > font")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys("test1");
    driver.findElement(By.name("group_name")).sendKeys(Keys.ENTER);
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }

}
