package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import core.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution extends Base {

	@Test
	public void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(getURL());
		System.out.println(driver.getTitle() + "from Chrome browser");

		driver.close();
	}

	@Test
	public void firefoxBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(getURL());
		System.out.println(driver.getTitle() + "from firefox browser");

		driver.close();

	}

}
