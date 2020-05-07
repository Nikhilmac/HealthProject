package SfaxPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Purchase {
	public WebDriver driver;

	@Test
	public void f() {
		String name = driver.getTitle();
		System.out.println(name + " = Title Name");
		String url = driver.getCurrentUrl();
		System.out.println(url + "= URL");
		driver.findElement(By.name("email")).sendKeys("nikhil@gmail.com");
		driver.findElement(By.name("firstname")).sendKeys("aaa");
		driver.findElement(By.name("lastname")).sendKeys("bbbb");
		driver.findElement(By.name("reg_email__")).sendKeys("123456");

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
