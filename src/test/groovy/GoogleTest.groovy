import geb.Browser
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

/**
 * Created by raghavan on 4/29/15.
 *
 *
 */

Browser.drive{

  System.setProperty("webdriver.chrome.driver","<YOUR_CHROME_DRIVER_PATH>")

    to GoogleHomePage

    assert at(GoogleHomePage)

    search.field.value("wikipedia")

    waitFor {at GoogleResultsPage }

    assert firstResultLink.text() == "Wikipedia"

    firstResultLink.click()

    waitFor { at WikipediaPage}

    }
