package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com");
		
		driver.manage().window().maximize();
		
		String homepagetitle=driver.getTitle();
		System.out.println("Home Page Title: "+homepagetitle);
		System.out.println("Validate Home Page: "+homepagetitle.contains("GSMArena.com"));
		
		driver.findElement(By.xpath("//*[@id=\"body\"]/aside/div[1]/ul/li[25]/a")).click();
		List<WebElement> mobilelist = driver.findElements(By.xpath("//*[@id=\"review-body\"]/div[1]/ul/li[1]/a/img"));
		System.out.println("List of Mobile name: "+mobilelist.size());
		for(int i=0; i<mobilelist.size(); i++) {
			System.out.println(mobilelist.get(i).getText());
		}
	}

}
