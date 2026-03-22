import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        System.out.println("Test executed");

        driver.quit();
    }
}
