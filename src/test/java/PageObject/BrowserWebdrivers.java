package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWebdrivers {



    public  WebDriver chromeWebdriver(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        return driver;

    }

    public  WebDriver firefoxWebdriver(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        return driver;

    }

}
