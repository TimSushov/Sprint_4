import PageObject.BrowserWebdrivers;
import PageObject.HomePageQaScooter;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;



@RunWith(Parameterized.class)
public class TestDropDownText {

    //выбрать барузер
    BrowserWebdrivers browserWebdrivers = new BrowserWebdrivers();
    WebDriver driver = browserWebdrivers.chromeWebdriver();

    private  String textHeaderDropDown;
    private  String textInDropDown;

    public TestDropDownText(String textHeaderDropDown, String textInDropDown) {
        this.textHeaderDropDown = textHeaderDropDown;
        this.textInDropDown = textInDropDown;

    }

    @Parameterized.Parameters (name = "{index}:проверка в списке({0}) должен быть текст({1})")
        public static Object[][] getDropdowntexts() {
            //Проверяем текст вопроса и верный ответ на него
            return new Object[][]{
                    {"Сколько это стоит? И как оплатить?",
                            "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {"Хочу сразу несколько самокатов! Так можно?",
                            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {"Как рассчитывается время аренды?",
                            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {"Можно ли заказать самокат прямо на сегодня?",
                            "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {"Можно ли продлить заказ или вернуть самокат раньше?",
                            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {"Вы привозите зарядку вместе с самокатом?",
                            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {"Можно ли отменить заказ?",
                            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {"Я жизу за МКАДом, привезёте?",
                            "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }

        @Test
        public void checkTextInDropDown() throws InterruptedException {
            // переход на страницу тестового приложения
            driver.get("https://qa-scooter.praktikum-services.ru/");
            // создается объект класса главной страницы
            HomePageQaScooter objHomePageQaScooter = new HomePageQaScooter(driver);
            // скролинг до заголовка Вопросы о важном
            objHomePageQaScooter.scrollingToheaderMainQuestions();
            // вызывается метод открытия выпадающего списка
            objHomePageQaScooter.openDropDownQuestions(textHeaderDropDown);
            // вызывается метод по проверки текста в ввыпадающем списке
            objHomePageQaScooter.checkTextDropDownQuestions(textInDropDown);
        }

        @After
        public void teardown() {
            // Закрой браузер
            driver.quit();
        }
}
