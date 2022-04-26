package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactCrTest {

    private WebDriver wb;

    @BeforeMethod
    public void setUp() {

        wb = new ChromeDriver();
        wb.get("http://localhost/addressbook/group.php");
        wb.manage().window().setSize(new Dimension(1062, 813));
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wb.findElement(By.name("user")).click();
        wb.findElement(By.name("user")).sendKeys(username);
        wb.findElement(By.name("pass")).click();
        wb.findElement(By.name("pass")).sendKeys(password);
        wb.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test
    public void testGroupCr() {

        gotoAddNew();
        fillcContactForm("Kesha", "Popovich", "Kozyvkin", "zayba", "Molvest", "Derevny Pupina", "pupinsc@ndf.uz", "1992");
        clickSaveContact();

    }

    private void clickSaveContact() {
        wb.findElement(By.xpath("//*[@name='notes']/following-sibling::input")).click();
    }

    private void fillcContactForm(String firstname, String middlename, String lastname, String title, String company, String address, String email, String byear) {
        wb.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
        wb.findElement(By.xpath("//input[@name='middlename']")).sendKeys(middlename);
        wb.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
        wb.findElement(By.xpath("//input[@name='title']")).sendKeys(title);
        wb.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
        wb.findElement(By.xpath("//textarea[@name='address']")).sendKeys(address);
        wb.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        wb.findElement(By.xpath("//select[@name='bday']//option[@value='29']")).click();
        wb.findElement(By.xpath("//select[@name='bmonth']//option[@value='December']")).click();
        wb.findElement(By.xpath("//input[@name='byear']")).sendKeys(byear);
        wb.findElement(By.xpath("//select[@name='new_group']//option[@value='14']")).click();


    }

    private void gotoAddNew() {
        wb.findElement(By.xpath("//a[@href='edit.php']")).click();
    }

    @AfterMethod
    public void tearDown() {
        wb.quit();
    }
}
