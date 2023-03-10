package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage extends BasePage {


    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    // MENU ELEMENTS:
    public WebElement menuElements() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']"));
    }

    public WebElement menuTextBox() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
    }

    public WebElement menuCheckBox() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']"));
    }

    public WebElement menuRadioButton() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
    }

    public WebElement menuWebTables() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
    }

    public WebElement menuButtons() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']"));
    }

    public WebElement menuLinks() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-5']"));
    }

    public WebElement menuBrokenLinksImages() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-6']"));
    }

    public WebElement menuUploadAndDownload() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-7']"));
    }

    public WebElement menuDynamicProperties() {
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-8']"));
    }


    //TEXT BOX ELEMENTS:
    public WebElement inputFullName() {
        return driver.findElement(By.xpath("//input[@id='userName']"));
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public WebElement textAreaCurrentAddress() {
        return driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
    }

    public WebElement textAreaPermanentAddress() {
        return driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
    }

    public WebElement buttonSubmit() {
        return driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']/button[@id='submit']"));
    }

    public WebElement outPut() {
        return driver.findElement(By.xpath("//div[@id='output']"));
    }

    //CHECK BOX ELEMENTS

    //???????????? ?????????????????????? ????????????
    public WebElement checkBox() {
        return driver.findElement(By.xpath("//button[@title='Toggle']"));
    }

    //?????????????????? ?????????????? ?? ??????????????
    public WebElement clickCheckBox() {
        return driver.findElement(By.xpath("//label[@for='tree-node-home']"));
    }

    //???????????? ?????????????????????? ???????????? ????????????
    public WebElement clickExpandAll() {
        return driver.findElement(By.xpath("//button[@title='Expand all']"));
    }

    //???????????? ?????????????????? ???????????? ????????????
    public WebElement clickCollapseAll() {
        return driver.findElement(By.xpath("//button[@title='Collapse all']"));
    }

    //?????????? ???????????????????? ????????????
    public WebElement outResult() {
        return driver.findElement(By.xpath("//div[@id='result']"));
    }

    //RADIO BUTTON ELEMENTS

    public WebElement textElement() {
        return driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
    }

    public WebElement inputRBYes() {
        return driver.findElement(By.xpath("//label[text()='Yes']"));
    }

    public WebElement inputRBImpressive() {
        return driver.findElement(By.xpath("//label[text()='Impressive']"));
    }

    public WebElement inputRBNo() {
        return driver.findElement(By.xpath("//label[text()='No']"));
    }

    public WebElement outResultRB() {
        return driver.findElement(By.xpath("//p[text()='You have selected ']"));
    }

    //BUTTONS ELEMENTS

    public WebElement doubleClickMe() {
        return driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    }

    public WebElement rightClickMe() {
        return driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    }

    public WebElement clickMe() {
        return driver.findElement(By.xpath("//button[@id='IXspq']"));
    }

    public WebElement outDoubleClickMe() {
        return driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
    }

    public WebElement outRightClickMe() {
        return driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
    }

    public WebElement outClickMe() {
        return driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
    }




}
