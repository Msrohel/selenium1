package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEtrain {

	public static void main(String[] args) throws InterruptedException {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//*[@id=\"tbsfi1\"]"));
		input.sendKeys("pune");
		input.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.);
				To.sendKeys("Mumbai");
		To.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
		
		driver.findElement(By.cssSelector("#tbsfi4")).click();
		driver.findElement(By.className("nav")).click();
		driver.findElement(By.cssSelector("body > div.dpdd.etcal.closeTapOut > table > tbody > tr:nth-child(5) > td:nth-child(5) > input")).click();
		driver.findElement(By.className("btn")).click();
		
		List<WebElement> TrainName = driver.findElements(By.xpath("//*[@id=\"upperdata\"]/div/div[1]/table/tbody/tr[6]/td[2]/a"));
		System.out.println("No. of Trains:"+TrainName.size());
	}

}
