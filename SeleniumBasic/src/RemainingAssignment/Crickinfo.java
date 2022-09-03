package RemainingAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickinfo {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String CromeDir = CurrentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", CromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com");
		
		driver.manage().window().maximize();
		String homepagetitle=driver.getTitle();
		System.out.println("Home Page Title: "+homepagetitle);
		System.out.println("Validate Home Page: "+homepagetitle.contains("ask cricinfo"));
		
		List<WebElement> inputlist = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[3]/div/nav/div/div/div/div[2]/div[1]/div[6]/a"));
		System.out.println("Size of the homepage list: "+inputlist.size());
		for(int i=0; i<inputlist.size(); i++) {
			System.out.println(inputlist.get(i).getText());
	}
	}
}
