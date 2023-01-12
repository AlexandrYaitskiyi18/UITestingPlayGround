package Test;

import Page.ElementsPage;
import Page.WebTableElementsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWebTablesElements extends TestInit {

    public void goToWebTables() {
        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.menuWebTables().click();
    }

    @Test
    public void testElementsForWebTables() {

        goToWebTables();
        WebTableElementsPage webTableElementsPage = new WebTableElementsPage(driver);

        Assert.assertTrue(webTableElementsPage.addButtonWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputSearchWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputPageWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.selectWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.buttonPreviousWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.buttonNextWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.editElementWebTables().isDisplayed());
        Assert.assertTrue(webTableElementsPage.deleteElementWebTables().isDisplayed());
    }

    @Test
    public void testRegistrationElementsForWebTables() {
        goToWebTables();
        WebTableElementsPage webTableElementsPage = new WebTableElementsPage(driver);
        webTableElementsPage.addButtonWebTables().click();

        Assert.assertTrue(webTableElementsPage.inputFirstNameRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputLastNameRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputUserEmailRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputAgeRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputSalaryRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.inputDepartmentRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.buttonSubmitRegistration().isDisplayed());
        Assert.assertTrue(webTableElementsPage.buttonCloseRegistration().isDisplayed());

        webTableElementsPage.buttonCloseRegistration().click();
    }

    @Test
    public void testRegistrationForWebTables() {
        String firstName = "John";
        String lastname = "Smith";
        String email = "test@test.ua";
        String age = "25";
        String salary = "5000";
        String department = "Administration";
        goToWebTables();
        WebTableElementsPage webTableElementsPage = new WebTableElementsPage(driver);
        webTableElementsPage.addButtonWebTables().click();

        webTableElementsPage.inputFirstNameRegistration().sendKeys(firstName);
        webTableElementsPage.inputLastNameRegistration().sendKeys(lastname);
        webTableElementsPage.inputUserEmailRegistration().sendKeys(email);
        webTableElementsPage.inputAgeRegistration().sendKeys(age);
        webTableElementsPage.inputSalaryRegistration().sendKeys(salary);
        webTableElementsPage.inputDepartmentRegistration().sendKeys(department);
        webTableElementsPage.buttonSubmitRegistration().click();

        Assert.assertEquals(firstName,webTableElementsPage.firstNameTable().getText());
        Assert.assertEquals(lastname,webTableElementsPage.lastNameTable().getText());
        Assert.assertEquals(email,webTableElementsPage.emailTable().getText());
        Assert.assertEquals(age,webTableElementsPage.ageTable().getText());
        Assert.assertEquals(salary,webTableElementsPage.salaryTable().getText());
        Assert.assertEquals(department,webTableElementsPage.departmentTable().getText());

        webTableElementsPage.deleteElementWebTables().click();

        webTableElementsPage.inputSearchWebTables().sendKeys("Alden");
        webTableElementsPage.editElementWebTables().click();
        webTableElementsPage.inputFirstNameRegistration().clear();
        webTableElementsPage.inputFirstNameRegistration().sendKeys("Emmi");
        webTableElementsPage.buttonSubmitRegistration().click();
    }
//wdaefea
}
