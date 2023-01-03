package Test;

import Page.ElementsPage;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class TestElements extends TestInit {

    @Test
    public void getMenuElements() {
        ElementsPage elementsPage = new ElementsPage(driver);

        Assert.assertTrue(elementsPage.menuElements().isDisplayed());
        Assert.assertTrue(elementsPage.menuTextBox().isDisplayed());
        Assert.assertTrue(elementsPage.menuCheckBox().isDisplayed());
        Assert.assertTrue(elementsPage.menuRadioButton().isDisplayed());
        Assert.assertTrue(elementsPage.menuWebTables().isDisplayed());
        Assert.assertTrue(elementsPage.menuLinks().isDisplayed());
        Assert.assertTrue(elementsPage.menuBrokenLinksImages().isDisplayed());
        Assert.assertTrue(elementsPage.menuDynamicProperties().isDisplayed());
        Assert.assertTrue(elementsPage.menuUploadAndDownload().isDisplayed());

        elementsPage.menuTextBox().click();


    }

    @Test
    public void inputTextBox() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.menuTextBox().click();

        Assert.assertTrue(elementsPage.inputFullName().isDisplayed());
        Assert.assertTrue(elementsPage.inputEmail().isDisplayed());
        Assert.assertTrue(elementsPage.textAreaCurrentAddress().isDisplayed());
        Assert.assertTrue(elementsPage.textAreaPermanentAddress().isDisplayed());
        Assert.assertTrue(elementsPage.buttonSubmit().isDisplayed());

        elementsPage.inputFullName().sendKeys("Alexandr");
        elementsPage.inputEmail().sendKeys("Alex@gmail.com");
        elementsPage.textAreaCurrentAddress().sendKeys("Ukraine");
        elementsPage.textAreaPermanentAddress().sendKeys("Ukraine");
        elementsPage.buttonSubmit().click();

        Assert.assertTrue(elementsPage.outPut().isDisplayed());
    }

    @Test
    public void inputCheckBox() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.menuCheckBox().click();

        Assert.assertTrue(elementsPage.checkBox().isDisplayed());
        Assert.assertTrue(elementsPage.clickCheckBox().isDisplayed());
        Assert.assertTrue(elementsPage.clickExpandAll().isDisplayed());
        Assert.assertTrue(elementsPage.clickCollapseAll().isDisplayed());

        elementsPage.checkBox().click();
        elementsPage.clickCheckBox().click();
        elementsPage.clickExpandAll().click();
        elementsPage.clickCollapseAll().click();

        Assert.assertTrue(elementsPage.outResult().isDisplayed());
    }

    @Test
    public void inputRadioButton() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.menuRadioButton().click();

        Assert.assertTrue(elementsPage.textElement().isDisplayed());
        Assert.assertTrue(elementsPage.inputRBYes().isDisplayed());
        Assert.assertTrue(elementsPage.inputRBImpressive().isDisplayed());
        Assert.assertTrue(elementsPage.inputRBNo().isDisplayed());

        elementsPage.inputRBYes().click();
        elementsPage.inputRBImpressive().click();

        Assert.assertTrue(elementsPage.outResultRB().isDisplayed());

    }

    @Test
    public void clickButtons(){
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.menuButtons().click();

        Assert.assertTrue(elementsPage.doubleClickMe().isDisplayed());
        Assert.assertTrue(elementsPage.rightClickMe().isDisplayed());
       // Assert.assertTrue(elementsPage.clickMe().isDisplayed());







    }
}
