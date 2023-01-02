package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableElementsPage extends BasePage {

    public WebTableElementsPage(WebDriver driver) {
        super(driver);
    }

    //WEB TABLES ELEMENTS

    public WebElement addButtonWebTables() {
        return driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
    }

    public WebElement inputSearchWebTables() {
        return driver.findElement(By.xpath("//input[@id='searchBox']"));
    }

    public WebElement inputPageWebTables() {
        return driver.findElement(By.xpath("//input[@aria-label='jump to page']"));
    }

    public WebElement buttonPreviousWebTables() {
        return driver.findElement(By.xpath("//button[text()='Previous']"));
    }

    public WebElement buttonNextWebTables() {
        return driver.findElement(By.xpath("//button[text()='Next']"));
    }

    public WebElement selectWebTables() {
        return driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
    }

    public WebElement editElementWebTables() {
        return driver.findElement(By.xpath("//div[@class='action-buttons']/span[@id='edit-record-2']"));
    }

    public WebElement deleteElementWebTables() {
        return driver.findElement(By.xpath("//div[@class='action-buttons']//span[@id='delete-record-1']"));
    }

    //Registration Form Elements:
    public WebElement inputFirstNameRegistration() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement inputLastNameRegistration() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement inputUserEmailRegistration() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public WebElement inputAgeRegistration() {
        return driver.findElement(By.xpath("//input[@id='age']"));
    }

    public WebElement inputSalaryRegistration() {
        return driver.findElement(By.xpath("//input[@id='salary']"));
    }

    public WebElement inputDepartmentRegistration() {
        return driver.findElement(By.xpath("//input[@id='department']"));
    }

    public WebElement buttonSubmitRegistration() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    public WebElement buttonCloseRegistration() {
        return driver.findElement(By.xpath("//button[@class='close']"));
    }

    //TABLE ELEMENTS:
    public WebElement firstNameTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='John']"));
    }
    public WebElement lastNameTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='Smith']"));
    }
    public WebElement emailTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='test@test.ua']"));
    }
    public WebElement ageTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='25']"));
    }
    public WebElement salaryTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='5000']"));
    }
    public WebElement departmentTable() {
        return driver.findElement(By.xpath("//div[@class='rt-tr -even']//div[text()='Administration']"));
    }




}
