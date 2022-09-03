package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenOrangeHRM {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement LoginField=driver.findElement(By.id("btnLogin"));
		LoginField.click();
		
		String homepagetitle=driver.getTitle();
		System.out.println("Home Page Title: "+homepagetitle);
System.out.println("Validate Home Page Title: "+homepagetitle.equals("OrangeHRM"));
		
		
		driver.close();
		
		
	}

}
