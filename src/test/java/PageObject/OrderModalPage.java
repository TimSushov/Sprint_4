package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderModalPage {
    private WebDriver driver;

    // локатор для текстового поля "* Имя"
    private By nameTextField = By.xpath("//div[.//input[@placeholder='* Имя']]");
    // локатор для текстового поля "* Фамилия"
    private By secondNameTextField = By.xpath("//div[.//input[@placeholder='* Имя']]");
    // локатор для текстового поля "* Адрес: куда привезти заказ"
    private By adressTextField = By.xpath("//div[.//input[@placeholder='* Имя']]");
    // локатор для текстового поля "* Станция метро"
    private By metroStationDropDown = By.xpath("//div[]");
    // локатор для текстового поля "* Телефон: на него позвонит курьер"
    private By telephoneTextField = By.xpath("//div[]");
    // локатор для кнопки "Далее"
    private By nextButton = By.xpath("//div[]");
    // локатор для текстового поля "* Когда привезти самокат"
    private By dateDeliveryTextField = By.xpath("//div[]");
    // локатор для текстового поля "* Срок аренды"
    private By rentalPeriodTextField = By.xpath("//div[]");
    // локатор для текстового поля "Комментарий для курьера"
    private By commentTextField = By.xpath("//div[]");
    // локатор для кнопки "Заказать" в модальном окне подтверждения заказа
    private By modalOrderButton = By.xpath("//div[]");
    // локатор заголовка "Заказ оформлен"
    private By headerOrderBeenPlaced = By.xpath("//div[]");
















//
//    public OrderModalPage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    // метод скроллит до заголовка "Вопросы о важном"
//    public void scrollingToheaderMainQuestions () {
//        WebElement element = driver.findElement(headerMainQuestions);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
//    }
//    // метод открывающий кликающий по выпадающему списку с текстом
//    public void openDropDownQuestions (String textHeaderDropDown) {
//        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='" + textHeaderDropDown + "']")));
//        driver.findElement(By.xpath(".//div[text()='"+textHeaderDropDown+"']")).click();
//    }
//    // метод проверяющий текст в выпадающем списке
//    public void checkTextDropDownQuestions (String textInDropDown) {
//        driver.findElement(By.xpath(".//div/p[text()='"+textInDropDown+"']"));
//    }
}
