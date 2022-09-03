package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniusSuggetion {

	public static void main(String[] args) throws InterruptedException {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium interview Question");
		Thread.sleep(2000);
		
		List<WebElement> suggetion = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("Suggestion Count: "+suggetion.size());
		for(int i=0; i<suggetion.size(); i++) {
			WebElement element = suggetion.get(i);
			System.out.println(element.getText());
		}
	}

}
