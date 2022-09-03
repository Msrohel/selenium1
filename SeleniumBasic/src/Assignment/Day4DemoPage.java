package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4DemoPage {

	public static void main(String[] args) throws InterruptedException {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement LoginField=driver.findElement(By.id("loginButton"));
		LoginField.click();
		
Thread.sleep(2000);
		
		String homepagetitle=driver.getTitle();
		System.out.println("Home Page Title: "+homepagetitle);
		System.out.println("Validate Home Page Title: "+homepagetitle.equals("actiTIME - Enter Time-Track"));
		
		//WebElement LogoutField=driver.findElement(By.id("logoutLink"));
		//LogoutField.click();
		//driver.close();
	}

}
