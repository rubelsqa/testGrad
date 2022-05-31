package sel;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GrdSel {

	@Test
	public void googleTest() throws MalformedURLException {
		WebDriverManager.chromedriver().driverVersion("92").setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--window-size=1920,1200");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities); // I have altered
																										// this line

		driver.get("https://www.google.com/");
		System.out.println("Tittle is >>>>>>>>>>>>>> " + driver.getTitle().toString());
		driver.close();
	}

}
