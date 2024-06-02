package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderlPage {
    private final WebDriver driver;

    // локатор для текстового поля "* Имя"
    private final By nameTextField = By.xpath(".//input[@placeholder='* Имя']");
    // локатор для текстового поля "* Фамилия"
    private final By secondNameTextField = By.xpath(".//input[@placeholder='* Фамилия']");
    // локатор для текстового поля "* Адрес: куда привезти заказ"
    private final By adressTextField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // локатор для текстового поля "* Станция метро"
    private final By metroStationDropDown = By.xpath("//div[]");
    // локатор для текстового поля "* Телефон: на него позвонит курьер"
    private final By telephoneTextField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // локатор для кнопки "Далее"
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    // локатор для поля "* Когда привезти самокат"
    private final By dateDeliveryField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // локатор для текстового поля "* Срок аренды"
    private final By rentalPeriodTextField = By.xpath(".//div[text()='* Срок аренды']");
    // локатор для поля с чек боксами "Цвет самоката"
    private final By colorScooterHeader = By.xpath(".//div[text()='Цвет самоката']");
    // локатор для текстового поля "Комментарий для курьера"
    private final By commentTextField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // локатор для кнопки "Заказать" при завершении оформления заказа
    private final By modalOrderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']");
    // локатор для кнопки "Да" в модальном окне подтверждения заказа
    private final By modalYesButton = By.xpath(".//button[text()='Да']");
    // локатор заголовка "Заказ оформлен"
    private final By headerOrderBeenPlaced = By.xpath(".//div[text()='Заказ оформлен']");

    public OrderlPage(WebDriver driver){
        this.driver = driver;
    }

    //метод вводит Имя
    public void setNameTextField (String nameText) {
        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(nameTextField));
        driver.findElement(nameTextField).sendKeys(nameText);
    }
    //метод вводит Фамилию
    public void setSecondNameTextFieldField (String secondNameText) {
        driver.findElement(secondNameTextField).sendKeys(secondNameText);
    }
    //метод вводит Адрес: куда привезти заказ
    public void setAdressTextField (String adressText) {
        driver.findElement(adressTextField).sendKeys(adressText);
    }
    //метод открывает выпадающий список Станция метро и выбирает значение из него
    public void setMetroStationDropDown (String metroStation) {
        driver.findElement(metroStationDropDown).click();
        driver.findElement(By.xpath(".//div[@class='select-search']//*[text()='"+metroStation+"']")).click();
    }
    //метод вводит Телефон: на него позвонит курьер
    public void setTelephoneText (String telephoneText) {
        driver.findElement(telephoneTextField).sendKeys(telephoneText);
    }
    //метод кликает кнопку Далее
    public void clickNextButton () {
        driver.findElement(nextButton).click();
    }
    //метод вводит Когда привезти самокат
    public void setDateDelivery (String dateDelivery) {
        driver.findElement(dateDeliveryField).sendKeys(dateDelivery);
    }
    //метод выбирает Срок аренды из выпадающего списка
    public void setRentalPeriodText (String rentalPeriodText) {
        driver.findElement(By.xpath(rentalPeriodTextField +"/parent::div/parent::div//*[text()='"+rentalPeriodText+"']")).click();
    }
    //метод ставит чек бокс цвету самоката
    public void setColorScooter (String colorScooter) {
        driver.findElement(By.xpath(colorScooterHeader +"/parent::div/label[text()='"+colorScooter+"']")).click();
    }
    //метод вводит Комментарий для курьера
    public void setCommentText (String commentText) {
        driver.findElement(commentTextField).sendKeys(commentText);
    }
    //метод кликает кнопку Заказать при завершении оформления заказа
    public void clickModalOrderButton () {
        driver.findElement(modalOrderButton).click();
    }
    //метод кликает кнопку Да в модальном окне подтверждения заказа
    public void clickModalYesButton () {
        driver.findElement(modalYesButton).click();
    }
    //метод проверяет заголовок Заказ оформлен
    public void checkOrderBeenPlaced () {
        driver.findElement(headerOrderBeenPlaced);
    }













}
