package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenVtiger {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Test@123");
		
		WebElement signinField=driver.findElement(By.className("buttonBlue"));
		signinField.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String homepagetitle=driver.getTitle();
		System.out.println("Home Page Title: "+homepagetitle);
		System.out.println("Validate Home Page: "+homepagetitle.equals("Dashboard"));
		
		WebElement AddWidgetField=driver.findElement(By.className("btn-group"));
		AddWidgetField.click();
		
		driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
		
		AddWidgetField.click();
		
		driver.findElement(By.cssSelector("a[data-name='History']")).click();
		
		driver.findElement(By.cssSelector("i.fa fa-remove")).click();
		
		driver.findElement(By.cssSelector("i.fa fa-remove")).click();




	}

}
