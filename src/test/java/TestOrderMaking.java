import PageObject.HomePageQaScooter;
import PageObject.OrderlPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@RunWith(Parameterized.class)
public class TestOrderMaking {

    private static WebDriver driver;

    private  String nameText;
    private  String secondNameText;
    private  String adressText;
    private  String metroStation;
    private  String telephoneText;
    private  String dateDelivery;
    private  String rentalPeriodText;
    private  String colorScooter;
    private  String commentText;



    public TestOrderMaking(String nameText, String secondNameText, String adressText, String metroStation, String telephoneText, String dateDelivery, String rentalPeriodText, String colorScooter, String commentText) {
        this.nameText = nameText;
        this.secondNameText = secondNameText;
        this.adressText = adressText;
        this.metroStation = metroStation;
        this.telephoneText = telephoneText;
        this.dateDelivery = dateDelivery;
        this.rentalPeriodText = rentalPeriodText;
        this.colorScooter = colorScooter;
        this.commentText = commentText;

    }

    @Parameterized.Parameters (name = "{index}:Проверка заказа: имя({0}), фамилия ({1}) клиента")
        public static Object[][] getDropdowntexts() {
            //Проверяем текст вопроса и верный ответ на него
            return new Object[][]{
                    {"Иван","Иванов","улица Иванова 42 кв 2","Сокольники","89138882255","12.12.2024","сутки","чёрный жемчуг","йа тестеровщег"},
                    {"Петр","петров","улица Петрова 142 кв 232","Черкизовская","+71233212244","11.02.2024","двое суток","серая безысходность","йа автатестеровщег"},


            };
        }


        @Test
        public void checkMakingOrderHeaderBottom() throws InterruptedException {
            // драйвер для браузера Firefox
//            WebDriverManager.firefoxdriver().setup();
//            WebDriver driver = new FirefoxDriver();
            // драйвер для браузера Chrome
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            // переход на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru/");

            // создается объект класса главной страницы
            HomePageQaScooter objHomePageQaScooter = new HomePageQaScooter(driver);
            //Кликаем по кнопке Заказать в хэдере
            objHomePageQaScooter.clickHeaderOrderButton();
            // создается объект класса  страницы заказа
            OrderlPage objOrderlPage = new OrderlPage(driver);
            // заполняется поле имя
            objOrderlPage.setNameTextField(nameText);
            // заполняется поле фамилия
            objOrderlPage.setSecondNameTextFieldField(secondNameText);
            // заполняется Адрес: куда привезти заказ
            objOrderlPage.setAdressTextField(adressText);
            // из выпадающего списка выбирается Станция метро
            objOrderlPage.setMetroStationDropDown(metroStation);
            // заполняется Телефон: на него позвонит курьер
            objOrderlPage.setTelephoneText(telephoneText);
            // клик по кнопке далее
            objOrderlPage.clickNextButton();
            // заполняется Когда привезти самокат
            objOrderlPage.setDateDelivery(dateDelivery);
            // из выпадающего списка выбирается Срок аренды
            objOrderlPage.setRentalPeriodText(rentalPeriodText);
            // выбирается чек бокс Цвет самоката
            objOrderlPage.setColorScooter(colorScooter);
            // заполняется Комментарий для курьера
            objOrderlPage.setCommentText(commentText);
            // клик по кнопке Заказать при завершении оформления заказа
            objOrderlPage.clickModalOrderButton();
            // лик по кнопке Да в модальном окне подтверждения заказа
            objOrderlPage.clickModalYesButton();
            // проверяется заголовок окна Заказ оформлен
            objOrderlPage.checkOrderBeenPlaced();
            // закрываем браузер, здесь потому, что в тест подставляются разные данные.
            driver.quit();

        }

    @Test
    public void checkMakingOrderHeaderFooter() throws InterruptedException {
        // драйвер для браузера Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        // драйвер для браузера Chrome
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // создается объект класса главной страницы
        HomePageQaScooter objHomePageQaScooter = new HomePageQaScooter(driver);
        //Кликаем по кнопке Заказать в футере
        objHomePageQaScooter.clickFooterOrderButton();
        // создается объект класса  страницы заказа
        OrderlPage objOrderlPage = new OrderlPage(driver);
        // заполняется поле имя
        objOrderlPage.setNameTextField(nameText);
        // заполняется поле фамилия
        objOrderlPage.setSecondNameTextFieldField(secondNameText);
        // заполняется Адрес: куда привезти заказ
        objOrderlPage.setAdressTextField(adressText);
        // из выпадающего списка выбирается Станция метро
        objOrderlPage.setMetroStationDropDown(metroStation);
        // заполняется Телефон: на него позвонит курьер
        objOrderlPage.setTelephoneText(telephoneText);
        // клик по кнопке далее
        objOrderlPage.clickNextButton();
        // заполняется Когда привезти самокат
        objOrderlPage.setDateDelivery(dateDelivery);
        // из выпадающего списка выбирается Срок аренды
        objOrderlPage.setRentalPeriodText(rentalPeriodText);
        // выбирается чек бокс Цвет самоката
        objOrderlPage.setColorScooter(colorScooter);
        // заполняется Комментарий для курьера
        objOrderlPage.setCommentText(commentText);
        // клик по кнопке Заказать при завершении оформления заказа
        objOrderlPage.clickModalOrderButton();
        // лик по кнопке Да в модальном окне подтверждения заказа
        objOrderlPage.clickModalYesButton();
        // проверяется заголовок окна Заказ оформлен
        objOrderlPage.checkOrderBeenPlaced();
        // закрываем браузер, здесь потому, что в тест подставляются разные данные.
        driver.quit();

    }


   }
