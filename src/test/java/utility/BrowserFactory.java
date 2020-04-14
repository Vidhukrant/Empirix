package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startChrome(String browserName,WebDriver d)
	{
		if (browserName.equals("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			d = new ChromeDriver();
			// JavascriptExecutor js = (JavascriptExecutor) driver;
		} else {
			System.out.println("no other browser present");
		}
		// dynamic wait
		d.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		d.manage().window().maximize();
		return d;
	}

public static void  startApplication(WebDriver d, String appURL) {
		
		d.get(appURL);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
}
