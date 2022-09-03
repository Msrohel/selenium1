package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFlipkart {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		List<WebElement> inputlist = driver.findElements(By.className("xtXmba"));
		System.out.println("Size of the homepage list: "+inputlist.size());
		for(int i=0; i<inputlist.size(); i++) {
			System.out.println(inputlist.get(i).getText());
		}
	}

}
