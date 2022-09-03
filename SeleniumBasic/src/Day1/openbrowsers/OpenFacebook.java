package Day1.openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		String cromeDir = currentDir+"\\Excutables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",cromeDir);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook";
		
		System.out.println("Actual Title of the Page: "+ActualTitle);
		System.out.println("Expected Title of the Page: "+ExpectedTitle);
		System.out.println("Validation of Title: "+ActualTitle.equals(ExpectedTitle));
		
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl ="www.facebook.com";
		
		System.out.println("Actual Url is: "+ActualUrl);
		System.out.println("Expected Url is: "+ExpectedUrl);
		System.out.println("Validate the Url: "+ActualUrl.contains(ExpectedUrl));
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(pagesource.length());
		System.out.println(driver.findElement(By.cssSelector("#day")).isDisplayed());
		
		driver.close();
	}

}
