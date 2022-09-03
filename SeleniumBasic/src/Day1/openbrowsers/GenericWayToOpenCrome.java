package Day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenCrome {

	public static void main(String[] args) {
		String CurrentWorkingDir = System.getProperty("user.dir");
		String CromeExePath = CurrentWorkingDir+"\\Excutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",CromeExePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		
		System.out.println("Actual Google page title is: "+actualTitle);
		System.out.println("Expected Google page title is: "+expectedTitle);
		System.out.println("Google Title Validation: "+actualTitle.equals(expectedTitle));
		
		String Actualurl = driver.getCurrentUrl();
		String Expectedurl = "https://www.google.com";
		
		System.out.println("Actual Google page URL: "+Actualurl);
		System.out.println("Expected Google page URL: "+Expectedurl);
		System.out.println("Google page URL Validation: "+Actualurl.contains(Expectedurl));
		
		String pageSource = driver.getPageSource();
		System.out.println("Page Source Code length: "+pageSource.length());
		
		driver.close();
	}

}
