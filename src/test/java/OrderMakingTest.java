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
public class OrderMakingTest {

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



    public OrderMakingTest(String nameText, String secondNameText, String adressText, String metroStation, String telephoneText, String dateDelivery, String rentalPeriodText, String colorScooter, String commentText) {
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

    @Parameterized.Parameters (name = "{index}:проверка в списке({0}) должен быть текст({1})")
        public static Object[][] getDropdowntexts() {
            //Проверяем текст вопроса и верный ответ на него
            return new Object[][]{
                    {"Иван","Иванов","улица Иванова 42 кв 2","Окружная","89138882255","12.12.2024","сутки","чёрный жемчуг",""},
                    {"Петр","петров","улица Петрова 42 кв 2","Сокольники","+71233212244","11.02.2024","двое суток","серая безысходность",""},


            };
        }


        @Test
        public void checkMakingOrderHeaderBottom() throws InterruptedException {
            // драйвер для браузера Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
            // драйвер для браузера Chrome
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();

            // переход на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru/");

            // создается объект класса главной страницы
            HomePageQaScooter objHomePageQaScooter = new HomePageQaScooter(driver);
            //Кликаем по кнопке Заказать в хэдере
            objHomePageQaScooter.clickHeaderOrderButton();
            // создается объект класса  страницы заказа
            OrderlPage objOrderlPage = new OrderlPage(driver);








            driver.quit();

        }


//    @AfterEach
//    public void teardown() {
//        driver.quit();
//    }

   }
