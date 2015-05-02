import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

/**
 * Created by raghavan on 5/1/15.
 */
class GoogleWikipediaSpec extends GebSpec{

    def "first result for wikipedia search should be wikipedia"() {

        given:
        DesiredCapabilities capabiities = new DesiredCapabilities()
        capabiities.setCapability("automationName", "Appium")
        capabiities.setCapability("deviceName", "Nexus 5")
        capabiities.setCapability("platformName", "Android")
        capabiities.setCapability("version", "")
        capabiities.setCapability("browserName", "Chrome")

       //   System.setProperty("webdriver.chrome.driver","/Users/raghavan/Gradle_Works/mysampleapp/chromedriver")
        //   new ChromeDriver(ChromeDriverService.createDefaultService(),capabiities)


        def browser = new Browser();
        browser.driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabiities)
        driver = browser.getDriver()
       driver.get("http://www.google.com")
       WebElement wikiElement = driver.findElement(By.name("q")).sendKeys("wikipedia \n")
        driver.findElement(By.className("g")).findElement(By.cssSelector("a")).click()

    }

}
