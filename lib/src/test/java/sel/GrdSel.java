package sel;

import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GrdSel {

	@Test
	public void googleTest() {
		
		
		Proxy p = new Proxy();
		p.setHttpProxy("localhost:8888");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, p);
		
		WebDriverManager.chromedriver().driverVersion("92").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--window-size=1920,1200");
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		
		
		
		
		
		
		
		driver.get("https://www.google.com/");
		System.out.println("Tittle is >>>>>>>>>>>>>> " + driver.getTitle().toString());
		driver.close();
	}

}
