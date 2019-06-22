package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ps2930\\Desktop\\Learn\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("http://www.naveenautomationlabs.com/2017/11/top-90-selenium-interview-questions.html");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Praveen Naika Shivakumara");
        driver.close();
	}

}
