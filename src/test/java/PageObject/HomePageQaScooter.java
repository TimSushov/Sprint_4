package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageQaScooter {
    private WebDriver driver;

    // локатор заголовка "Вопросы о важном"
    private By headerMainQuestions = By.xpath("//div[text()='Вопросы о важном']");
    // локатор кнопки заказать в хэдере
    private By headerOrderButton = By.xpath(".//div[@class='Header_Header__214zg']//button[text()='Заказать']");
    // локатор кнопки заказать в футере
    private By footerOrderButton = By.xpath(".//div[@class='Home_ThirdPart__LSTEE']//button[text()='Заказать']");

    public HomePageQaScooter(WebDriver driver){
        this.driver = driver;
    }

    // метод скроллит до заголовка "Вопросы о важном"
    public void scrollingToheaderMainQuestions () {
        WebElement element = driver.findElement(headerMainQuestions);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    // метод открывающий кликающий по выпадающему списку с текстом
    public void openDropDownQuestions (String textHeaderDropDown) {
        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='" + textHeaderDropDown + "']")));
        driver.findElement(By.xpath(".//div[text()='"+textHeaderDropDown+"']")).click();
    }
    // метод проверяющий текст в выпадающем списке
    public void checkTextDropDownQuestions (String textInDropDown) {
        driver.findElement(By.xpath(".//div/p[text()='"+textInDropDown+"']"));
    }
    // метод нажимающий кнопку заказать в хэдере
    public void clickHeaderOrderButton () {
        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(headerOrderButton);
        driver.findElement(headerOrderButton).click();
    }
    //  метод скроллит и нажимает кнопку заказать в футере
    public void clickFooterOrderButton() {
        WebElement element = driver.findElement(footerOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(footerOrderButton).click();
    }
}
