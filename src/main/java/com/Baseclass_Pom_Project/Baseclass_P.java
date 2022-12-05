package com.Baseclass_Pom_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//google meet
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_P {

	public static WebDriver driver;
// haaa
	// 1
	public static void browserLaunch(String drive) {

		if (drive.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Lenovo\\eclipse-workspace\\Baseclass_Pom_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (drive.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Baseclass_Pom_Project\\\\Driver\\\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}

	// 2
	public static void urlLaunch(String element) {
		driver.get(element);

	}

	// 3
	public static void sendsKeys(WebElement element, String values) {
		element.sendKeys(values);
	}

	// 4
	public static void clicks(WebElement element) {
		element.click();
	}

	// 5
	public static void dropdown(WebElement element, String value, String text) {
		Select s = new Select(element);

		if (value.equalsIgnoreCase("selectByValue")) {

			s.selectByValue(text);
		} else if (value.equalsIgnoreCase("selectByIndex")) {
			int parseInt = Integer.parseInt(text);
			s.selectByIndex(parseInt);

		} else if (value.equalsIgnoreCase("selectByVisibleText")) {
			s.selectByVisibleText(text);

		}

	}

	// 6
	public static void screenshort(String ss) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(ss);
		FileUtils.copyFile(screenshotAs, des);

	}

	// 7
	public static void actions(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();

	}

	// 8
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	// 9
	public static void alert(WebElement element, String alt) {

		Alert a = driver.switchTo().alert();
		if (alt.equalsIgnoreCase("accept")) {
			a.accept();
		} else if (alt.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
	}

	// 10
	public static void webtable(WebElement element) {

		String text = element.getText();
		System.out.println(text);

	}

}
 
