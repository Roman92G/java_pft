package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion(){
        app.gotoGroupPage();
        app.selectGroup2();
        app.deleteSelectedGroup();
        app.returnToGroupPage();
    }

}
